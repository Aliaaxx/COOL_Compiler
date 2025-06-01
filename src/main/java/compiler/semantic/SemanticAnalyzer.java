package main.java.compiler.semantic;

import main.java.compiler.ast.*;
import java.util.*;

public class SemanticAnalyzer implements ASTVisitor<Void> {
    private final SymbolTable symbolTable = new SymbolTable();
    private final List<String> errors = new ArrayList<>();
    private final Map<String, ClassInfo> classTable = new HashMap<>();
    private String currentFilename = "<stdin>";
    private ClassInfo currentClass;
    private MethodInfo currentMethod;

    public void analyze(ASTNode node, String filename) {
        this.currentFilename = filename;
        buildClassTable(node);
        checkInheritance();
        node.accept(this);

        if (!errors.isEmpty()) {
            System.err.println("Semantic errors found:");
            errors.forEach(System.err::println);
            System.exit(1);
        }
    }

    // ======================== Class Table Construction ========================
    private void buildClassTable(ASTNode node) {
        if (!(node instanceof Program)) return;

        Program program = (Program) node;
        for (ClassDef classDef : program.classes) {
            if (classTable.containsKey(classDef.name)) {
                error(classDef, "Class " + classDef.name + " is already defined");
                continue;
            }

            ClassInfo classInfo = new ClassInfo(
                    classDef.name,
                    classDef.parent,
                    classDef.getLine(),
                    classDef.getColumn()
            );
            classTable.put(classDef.name, classInfo);
            symbolTable.addClassAstNode(classDef.name, classDef);
        }
    }

/*
    private void checkInheritance() {
        for (ClassInfo classInfo : classTable.values()) {
            if (classInfo.parent != null && !classTable.containsKey(classInfo.parent)) {
                error(classInfo, "Class " + classInfo.name + " inherits from undefined class " + classInfo.parent);
            }

            // Check for inheritance cycles
            Set<String> visited = new HashSet<>();
            ClassInfo current = classInfo;
            while (current.parent != null) {
                if (visited.contains(current.name)) {
                    error(current, "Inheritance cycle detected for class " + current.name);
                    break;
                }
                visited.add(current.name);
                current = classTable.get(current.parent);
            }
        }
    }

 */
private void checkInheritance() {
    for (ClassInfo classInfo : classTable.values()) {
        if (classInfo.parent != null) {
            ClassInfo current = classTable.get(classInfo.parent);
            Set<String> visited = new HashSet<>();
            visited.add(classInfo.name);

            while (current != null) {
                if (visited.contains(current.name)) {
                    error(classInfo, "Inheritance cycle detected for class " + classInfo.name);
                    break;
                }
                visited.add(current.name);
                current = classTable.get(current.parent);
            }

            if (classTable.get(classInfo.parent) == null) {
                error(classInfo, "Class " + classInfo.name + " inherits from undefined class " + classInfo.parent);
            }
        }
    }
}

    // ======================== Visitor Methods ========================
    @Override
    public Void visit(Program node) {
        for (ClassDef classDef : node.classes) {
            currentClass = classTable.get(classDef.name);
            symbolTable.setCurrentClass(currentClass);
            classDef.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ClassDef node) {
        // Process features
        for (Feature feature : node.features) {
            feature.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Attribute node) {
        // Check if type exists
        if (!classTable.containsKey(node.type) && !node.type.equals("SELF_TYPE")) {
            error(node, "Undefined type " + node.type + " for attribute " + node.name);
        }

        // Check initialization expression if present
        if (node.init != null) {
            node.init.accept(this);
            String initType = getExpressionType(node.init);
            if (!isSubtype(initType, node.type)) {
                error(node, "Type mismatch in attribute initialization: " +
                        initType + " is not a subtype of " + node.type);
            }
        }

        // Add to class attributes
        VariableSymbol attrSymbol = new VariableSymbol(
                node.name, node.type, node.getLine(), node.getColumn()
        );
        currentClass.attributes.put(node.name, attrSymbol);

        return null;
    }

    @Override
    public Void visit(Method node) {
        // Check return type
        if (!classTable.containsKey(node.returnType) && !node.returnType.equals("SELF_TYPE")) {
            error(node, "Undefined return type " + node.returnType + " for method " + node.name);
        }

        MethodInfo methodInfo = new MethodInfo(
                node.name, node.returnType, node.getLine(), node.getColumn()
        );

        // Process formals
        symbolTable.enterScope();
        for (Formal formal : node.formals) {
            if (!classTable.containsKey(formal.type)) {
                error(formal, "Undefined type " + formal.type + " for parameter " + formal.name);
            }

            VariableSymbol paramSymbol = new VariableSymbol(
                    formal.name, formal.type, formal.getLine(), formal.getColumn()
            );
            methodInfo.formals.add(paramSymbol);
            symbolTable.addSymbol(formal.name, paramSymbol);
        }

        // Check method body
        currentMethod = methodInfo;
        node.body.accept(this);
        currentMethod = null;

        String bodyType = getExpressionType(node.body);
        if (!isSubtype(bodyType, node.returnType)) {
            error(node, "Method " + node.name + " returns " + bodyType +
                    " but declared return type is " + node.returnType);
        }

        // Add to class methods
        currentClass.methods.put(node.name, methodInfo);
        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visit(Formal node) {
        // Handled in visit(Method)
        return null;
    }

    // ======================== Expression Handling ========================
    @Override
    public Void visit(Assignment node) {
        node.value.accept(this);
        String valueType = getExpressionType(node.value);

        // Check if variable exists
        Symbol symbol = symbolTable.lookup(node.name);
        if (symbol == null) {
            error(node, "Variable " + node.name + " is not defined");
            return null;
        }

        if (!(symbol instanceof VariableSymbol)) {
            error(node, node.name + " is not a variable");
            return null;
        }

        VariableSymbol varSymbol = (VariableSymbol) symbol;
        if (!isSubtype(valueType, varSymbol.type)) {
            error(node, "Cannot assign " + valueType + " to variable " +
                    node.name + " of type " + varSymbol.type);
        }

        return null;
    }

    @Override
    public Void visit(Dispatch node) {
        // Check caller expression if present
        if (node.caller != null) {
            node.caller.accept(this);
            String callerType = getExpressionType(node.caller);

            // Verify static dispatch type
            if (node.type != null && !isSubtype(callerType, node.type)) {
                error(node, "Static dispatch type " + node.type +
                        " is not a supertype of " + callerType);
            }
        }

        // Check arguments
        for (Expression arg : node.args) {
            arg.accept(this);
        }

        // Verify method exists
        String dispatchType = node.type != null ? node.type :
                (node.caller != null ? getExpressionType(node.caller) : currentClass.name);

        ClassInfo classInfo = classTable.get(dispatchType);
        while (classInfo != null) {
            if (classInfo.methods.containsKey(node.methodName)) {
                MethodInfo methodInfo = classInfo.methods.get(node.methodName);

                // Check argument count
                if (node.args.size() != methodInfo.formals.size()) {
                    error(node, "Method " + node.methodName + " expects " +
                            methodInfo.formals.size() + " arguments but got " + node.args.size());
                    break;
                }

                // Check argument types
                for (int i = 0; i < node.args.size(); i++) {
                    String argType = getExpressionType(node.args.get(i));
                    String paramType = methodInfo.formals.get(i).type;
                    if (!isSubtype(argType, paramType)) {
                        error(node, "Argument " + (i+1) + " type mismatch: expected " +
                                paramType + ", got " + argType);
                    }
                }

                return null;
            }
            classInfo = classTable.get(classInfo.parent);
        }

        error(node, "Method " + node.methodName + " not found in class " + dispatchType);
        return null;
    }

    @Override
    public Void visit(If node) {
        node.cond.accept(this);
        String condType = getExpressionType(node.cond);
        if (!condType.equals("Bool")) {
            error(node, "If condition must be Bool, got " + condType);
        }

        node.thenBranch.accept(this);
        node.elseBranch.accept(this);
        return null;
    }

    // ======================== Helper Methods ========================
    private String getExpressionType(Expression expr) {
        if (expr instanceof IntLiteral) return "Int";
        if (expr instanceof StringLiteral) return "String";
        if (expr instanceof BoolLiteral) return "Bool";
        if (expr instanceof Identifier) {
            Symbol symbol = symbolTable.lookup(((Identifier) expr).name);
            return symbol instanceof VariableSymbol ? ((VariableSymbol) symbol).type : "Object";
        }
        if (expr instanceof New) return ((New) expr).type;
        if (expr instanceof IsVoid) return "Bool";
        // Add cases for other expression types
        return "Object"; // Default fallback
    }

    private boolean isSubtype(String subtype, String supertype) {
        if (subtype.equals(supertype)) return true;
        if (supertype.equals("Object")) return true;
        if (subtype.equals("SELF_TYPE")) return supertype.equals(currentClass.name);

        ClassInfo classInfo = classTable.get(subtype);
        while (classInfo != null) {
            if (classInfo.name.equals(supertype)) return true;
            classInfo = classTable.get(classInfo.parent);
        }
        return false;
    }

    private void error(ASTNode node, String message) {
        errors.add(currentFilename + ":" + node.getLine() + ":" +
                node.getColumn() + ": " + message);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    private void error(ClassInfo classInfo, String message) {
        ClassDef classDef = symbolTable.getClassAstNode(classInfo.name);
        if (classDef != null) {
            error(classDef, message);
        } else {
            errors.add("Error in class " + classInfo.name + ": " + message);
        }
    }
    /*
    private void error(ClassInfo classInfo, String message) {
        // First try to find the original ClassDef node from the AST
        ClassDef classDef = findClassDef(classInfo.name);
        if (classDef != null) {
            error(classDef, message);
        } else {
            // Fallback error reporting without line numbers
            errors.add("Semantic error: " + message);
        }
    }
    */


    @Override
    public Void visit(IntLiteral node) {
        // No semantic checks needed for integer literals
        return null;
    }

    @Override
    public Void visit(StringLiteral node) {
       // node.setType("Int");  // Set type to built-in Int
        return null;
    }

    @Override
    public Void visit(BoolLiteral node) {
        // No semantic checks needed for boolean literals
        return null;
    }

    @Override
    public Void visit(Identifier node) {
        // Verify the identifier exists in the symbol table
        Symbol symbol = symbolTable.lookup(node.name);
        if (symbol == null) {
            error(node, "Identifier " + node.name + " is not defined");
        }
        return null;
    }

    @Override
    public Void visit(New node) {
        // Check if the type exists
        if (!classTable.containsKey(node.type) && !node.type.equals("SELF_TYPE")) {
            error(node, "Cannot instantiate undefined class " + node.type);
        }
        return null;
    }

    @Override
    public Void visit(IsVoid node) {
        node.expr.accept(this);
        return null;
    }

    @Override
    public Void visit(Negate node) {
        node.expr.accept(this);
        return null;
    }

    @Override
    public Void visit(Not node) {
        node.expr.accept(this);
        String exprType = getExpressionType(node.expr);
        if (!exprType.equals("Bool")) {
            error(node, "NOT operation requires Bool, got " + exprType);
        }
        return null;
    }

    @Override
    public Void visit(Plus node) {
        node.left.accept(this);
        node.right.accept(this);
        checkNumericOperands(node, node.left, node.right);
        return null;
    }

    @Override
    public Void visit(Minus node) {
        node.left.accept(this);
        node.right.accept(this);
        checkNumericOperands(node, node.left, node.right);
        return null;
    }

    @Override
    public Void visit(Multiply node) {
        node.left.accept(this);
        node.right.accept(this);
        checkNumericOperands(node, node.left, node.right);
        return null;
    }

    @Override
    public Void visit(Divide node) {
        node.left.accept(this);
        node.right.accept(this);
        checkNumericOperands(node, node.left, node.right);
        return null;
    }

    @Override
    public Void visit(LessThan node) {
        node.left.accept(this);
        node.right.accept(this);
        checkNumericOperands(node, node.left, node.right);
        return null;
    }

    @Override
    public Void visit(LessThanOrEqual node) {
        node.left.accept(this);
        node.right.accept(this);
        checkNumericOperands(node, node.left, node.right);
        return null;
    }

    @Override
    public Void visit(Equal node) {
        node.left.accept(this);
        node.right.accept(this);

        // Special case: Can't compare basic types with =
        String leftType = getExpressionType(node.left);
        String rightType = getExpressionType(node.right);

        if ((leftType.equals("Int") || leftType.equals("String") || leftType.equals("Bool"))) {
            if (!leftType.equals(rightType)) {
                error(node, "Illegal comparison with = between " + leftType + " and " + rightType);
            }
        }
        return null;
    }

    // Helper method for numeric operations
    private void checkNumericOperands(ASTNode node, Expression left, Expression right) {
        String leftType = getExpressionType(left);
        String rightType = getExpressionType(right);

        if (!leftType.equals("Int") || !rightType.equals("Int")) {
            error(node, "Non-integer operands: " + leftType + " and " + rightType);
        }
    }

    @Override
    public Void visit(While node) {
        // Check condition type
        node.cond.accept(this);
        String condType = getExpressionType(node.cond);
        if (!condType.equals("Bool")) {
            error(node, "While condition must be Bool, got " + condType);
        }

        // Check body
        symbolTable.enterScope();
        node.body.accept(this);
        symbolTable.exitScope();

        return null;
    }

    @Override
    public Void visit(Block node) {
        symbolTable.enterScope();
        for (Expression expr : node.expressions) {
            expr.accept(this);
        }
        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visit(Let node) {
        symbolTable.enterScope();

        // Process bindings
        for (Let.Binding binding : node.bindings) {
            // Check type exists
            if (!classTable.containsKey(binding.type) && !binding.type.equals("SELF_TYPE")) {
                error(node, "Undefined type " + binding.type + " in let binding");
            }

            // Add to symbol table
            VariableSymbol varSymbol = new VariableSymbol(
                    binding.name, binding.type, node.getLine(), node.getColumn()
            );
            symbolTable.addSymbol(binding.name, varSymbol);

            // Check initialization if present
            if (binding.init != null) {
                binding.init.accept(this);
                String initType = getExpressionType(binding.init);
                if (!isSubtype(initType, binding.type)) {
                    error(node, "Let initialization type mismatch: " +
                            initType + " is not a subtype of " + binding.type);
                }
            }
        }

        // Process body
        node.body.accept(this);
        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visit(Case node) {
        // Check main expression
        node.expr.accept(this);

        Set<String> coveredTypes = new HashSet<>();

        // Process branches
        for (CaseBranch branch : node.branches) {
            // Check for duplicate types
            if (coveredTypes.contains(branch.type)) {
                error(branch, "Duplicate case branch for type " + branch.type);
            }
            coveredTypes.add(branch.type);

            // Check type exists
            if (!classTable.containsKey(branch.type) && !branch.type.equals("SELF_TYPE")) {
                error(branch, "Undefined type " + branch.type + " in case branch");
            }

            // Process branch
            symbolTable.enterScope();
            VariableSymbol varSymbol = new VariableSymbol(
                    branch.varName, branch.type, branch.getLine(), branch.getColumn()
            );
            symbolTable.addSymbol(branch.varName, varSymbol);
            branch.expr.accept(this);
            symbolTable.exitScope();
        }

        return null;
    }

    @Override
    public Void visit(CaseBranch node) {
        // Handled in visit(Case)
        return null;
    }

    @Override
    public Void visit(BinaryOperation node) {
        // Visit both operands
        node.left.accept(this);
        node.right.accept(this);

        String leftType = getExpressionType(node.left);
        String rightType = getExpressionType(node.right);

        switch (node.operator) {
            case "+":
            case "-":
            case "*":
            case "/":
                // Arithmetic operations require Int operands
                if (!leftType.equals("Int") || !rightType.equals("Int")) {
                    error(node, "Arithmetic operation " + node.operator +
                            " requires Int operands, got " + leftType + " and " + rightType);
                }
                break;

            case "<":
            case "<=":
                // Comparisons require Int operands and return Bool
                if (!leftType.equals("Int") || !rightType.equals("Int")) {
                    error(node, "Comparison " + node.operator +
                            " requires Int operands, got " + leftType + " and " + rightType);
                }
                break;

            case "=":
                // Equality has special type rules
                if ((leftType.equals("Int") || leftType.equals("String") || leftType.equals("Bool"))) {
                if (!leftType.equals(rightType)) {
                    error(node, "Illegal comparison with = between " +
                            leftType + " and " + rightType);
                }
            }
            break;

            default:
                error(node, "Unknown binary operator: " + node.operator);
        }

        return null;
    }

    @Override
    public Void visit(UnaryOperation node) {
        // Visit the operand
        node.expr.accept(this);

        String exprType = getExpressionType(node.expr);

        switch (node.operator) {
            case "~":
                // Complement operator requires Int operand
                if (!exprType.equals("Int")) {
                    error(node, "Complement operation ~ requires Int operand, got " + exprType);
                }
                break;

            case "NOT":
                // NOT operator requires Bool operand
                if (!exprType.equals("Bool")) {
                    error(node, "NOT operation requires Bool operand, got " + exprType);
                }
                break;

            case "ISVOID":
                // ISVOID accepts any type and returns Bool
                break;

            default:
                error(node, "Unknown unary operator: " + node.operator);
        }

        return null;
    }
}
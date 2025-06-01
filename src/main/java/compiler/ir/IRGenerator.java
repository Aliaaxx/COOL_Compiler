package main.java.compiler.ir;

import main.java.compiler.ast.*;
import main.java.compiler.ast.ASTVisitor;

import java.util.*;

public class IRGenerator implements ASTVisitor<TACFunction> {
    private TACFunction currentFunction;
    private final Map<String, TACFunction> functions = new HashMap<>();
    private int labelCounter = 0;
    private int tempCounter = 0;

    // Entry point for IR generation
    public Map<String, TACFunction> generate(ASTNode node) {
        node.accept(this);
        return functions;
    }

    // Helper methods
    private String newTemp() {
        return "t" + tempCounter++;
    }

    private String newLabel() {
        return "L" + labelCounter++;
    }

    // Program and class structure
    @Override
    public TACFunction visit(Program node) {
        for (ClassDef classDef : node.classes) {
            classDef.accept(this);
        }
        return null;
    }

    @Override
    public TACFunction visit(ClassDef node) {
        for (Feature feature : node.features) {
            feature.accept(this);
        }
        return null;
    }

    // Features (methods and attributes)
    @Override
    public TACFunction visit(Method node) {
        currentFunction = new TACFunction();
        currentFunction.name = node.name;

        // Process formals
        for (Formal formal : node.formals) {
            currentFunction.add(new TACInstruction(
                    TACInstruction.Type.PARAM,
                    null,
                    formal.name,
                    null,
                    null
            ));
        }

        // Generate method body
        node.body.accept(this);

        functions.put(node.name, currentFunction);
        return null;
    }

    @Override
    public TACFunction visit(Attribute node) {
        if (node.init != null) {
            node.init.accept(this);
        }
        return null;
    }

    @Override
    public TACFunction visit(Formal node) {
        return null;
    }

    // Expressions
    @Override
    public TACFunction visit(IntLiteral node) {
        String temp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.ASSIGN,
                temp,
                String.valueOf(node.value),
                null,
                null
        ));
        return currentFunction;
    }

    @Override
    public TACFunction visit(StringLiteral node) {
        String temp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.ASSIGN,
                temp,
                node.value,
                null,
                null
        ));
        return currentFunction;
    }

    @Override
    public TACFunction visit(BoolLiteral node) {
        String temp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.ASSIGN,
                temp,
                node.value ? "true" : "false",
                null,
                null
        ));
        return currentFunction;
    }

    @Override
    public TACFunction visit(Identifier node) {
        // Just return the variable name
        String temp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.ASSIGN,
                temp,
                node.name,
                null,
                null
        ));
        return currentFunction;
    }

    @Override
    public TACFunction visit(Assignment node) {
        node.value.accept(this);
        TACFunction valueFunc = node.value.accept(this);
        String valueTemp = valueFunc.instructions.get(valueFunc.instructions.size()-1).result;

        currentFunction.add(new TACInstruction(
                TACInstruction.Type.ASSIGN,
                node.name,
                valueTemp,
                null,
                null
        ));
        return currentFunction;
    }

    @Override
    public TACFunction visit(BinaryOperation node) {
        TACFunction left = node.left.accept(this);
        String leftTemp = left.instructions.get(left.instructions.size()-1).result;

        TACFunction right = node.right.accept(this);
        String rightTemp = right.instructions.get(right.instructions.size()-1).result;

        String resultTemp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.BINARY_OP,
                resultTemp,
                leftTemp,
                rightTemp,
                node.operator
        ));
        return currentFunction;
    }

    @Override
    public TACFunction visit(UnaryOperation node) {
        // Handle all unary operations with a common pattern
        TACFunction expr = node.expr.accept(this);
        String exprTemp = expr.instructions.get(expr.instructions.size()-1).result;

        String resultTemp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.UNARY_OP,
                resultTemp,
                exprTemp,
                null,
                node.operator
        ));
        return currentFunction;
    }


    @Override
    public TACFunction visit(If node) {
        String elseLabel = newLabel();
        String endLabel = newLabel();

        // Generate condition
        TACFunction cond = node.cond.accept(this);
        String condTemp = cond.instructions.get(cond.instructions.size()-1).result;

        // Conditional jump
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.COND_GOTO,
                null,
                condTemp,
                elseLabel,
                null
        ));

        // Then branch
        node.thenBranch.accept(this);

        // Jump to end
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.GOTO,
                null,
                endLabel,
                null,
                null
        ));

        // Else label
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.LABEL,
                null,
                elseLabel,
                null,
                null
        ));

        // Else branch
        node.elseBranch.accept(this);

        // End label
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.LABEL,
                null,
                endLabel,
                null,
                null
        ));

        return currentFunction;
    }

    @Override
    public TACFunction visit(While node) {
        String startLabel = newLabel();
        String endLabel = newLabel();

        // Start label
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.LABEL,
                null,
                startLabel,
                null,
                null
        ));

        // Condition
        TACFunction cond = node.cond.accept(this);
        String condTemp = cond.instructions.get(cond.instructions.size()-1).result;

        // Jump if false
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.COND_GOTO,
                null,
                condTemp,
                endLabel,
                null
        ));

        // Body
        node.body.accept(this);

        // Jump back to start
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.GOTO,
                null,
                startLabel,
                null,
                null
        ));

        // End label
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.LABEL,
                null,
                endLabel,
                null,
                null
        ));

        return currentFunction;
    }

    @Override
    public TACFunction visit(Case node) {
        // Evaluate the case expression
        TACFunction exprFunc = node.expr.accept(this);
        String exprTemp = exprFunc.instructions.get(exprFunc.instructions.size()-1).result;

        // Create labels and temporaries
        String endLabel = newLabel();
        String nextCaseLabel = null;
        String resultTemp = newTemp();

        // Store original expression in a temporary for type checking
        String caseVar = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.ASSIGN,
                caseVar,
                exprTemp,
                null,
                null
        ));

        // Process each branch
        for (int i = 0; i < node.branches.size(); i++) {
            CaseBranch branch = node.branches.get(i);

            // Create label for next case (except for last branch)
            if (i < node.branches.size() - 1) {
                nextCaseLabel = newLabel();
            }

            // Generate type check
            String typeCheckTemp = newTemp();
            currentFunction.add(new TACInstruction(
                    TACInstruction.Type.CALL,
                    typeCheckTemp,
                    "typecheck",
                    caseVar + "," + branch.type,
                    null
            ));

            // Conditional jump if type doesn't match
            currentFunction.add(new TACInstruction(
                    TACInstruction.Type.COND_GOTO,
                    null,
                    typeCheckTemp,
                    (i < node.branches.size() - 1) ? nextCaseLabel : endLabel,
                    "=="
            ));

            // Create binding for this branch
            currentFunction.add(new TACInstruction(
                    TACInstruction.Type.ASSIGN,
                    branch.varName,
                    caseVar,
                    null,
                    null
            ));

            // Process branch expression
            TACFunction branchFunc = branch.expr.accept(this);
            String branchTemp = branchFunc.instructions.get(branchFunc.instructions.size()-1).result;

            // Store result
            currentFunction.add(new TACInstruction(
                    TACInstruction.Type.ASSIGN,
                    resultTemp,
                    branchTemp,
                    null,
                    null
            ));

            // Jump to end
            currentFunction.add(new TACInstruction(
                    TACInstruction.Type.GOTO,
                    null,
                    endLabel,
                    null,
                    null
            ));

            // Add label for next case (if not last branch)
            if (i < node.branches.size() - 1) {
                currentFunction.add(new TACInstruction(
                        TACInstruction.Type.LABEL,
                        null,
                        nextCaseLabel,
                        null,
                        null
                ));
            }
        }

        // Add end label
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.LABEL,
                null,
                endLabel,
                null,
                null
        ));

        return currentFunction;
    }
    @Override
    public TACFunction visit(CaseBranch node) {
        // CaseBranch nodes are handled within the Case node's visit method,
        // so this method just processes the branch's expression

        // Create a new temporary for the branch result
        String resultTemp = newTemp();

        // Process the branch expression
        TACFunction exprFunc = node.expr.accept(this);
        String exprResult = exprFunc.instructions.get(exprFunc.instructions.size()-1).result;

        // Assign the expression result to our temporary
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.ASSIGN,
                resultTemp,
                exprResult,
                null,
                null
        ));

        return currentFunction;
    }

    @Override
    public TACFunction visit(Block node) {
        for (Expression expr : node.expressions) {
            expr.accept(this);
        }
        return currentFunction;
    }

    @Override
    public TACFunction visit(Let node) {
        // Process bindings
        for (Let.Binding binding : node.bindings) {
            if (binding.init != null) {
                binding.init.accept(this);
                TACFunction initFunc = binding.init.accept(this);
                String initTemp = initFunc.instructions.get(initFunc.instructions.size()-1).result;

                currentFunction.add(new TACInstruction(
                        TACInstruction.Type.ASSIGN,
                        binding.name,
                        initTemp,
                        null,
                        null
                ));
            }
        }

        // Process body
        node.body.accept(this);
        return currentFunction;
    }

    @Override
    public TACFunction visit(Dispatch node) {
        // Handle receiver
        String receiverTemp = null;
        if (node.caller != null) {
            TACFunction caller = node.caller.accept(this);
            receiverTemp = caller.instructions.get(caller.instructions.size()-1).result;
        }

        // Process arguments
        List<String> argTemps = new ArrayList<>();
        for (Expression arg : node.args) {
            TACFunction argFunc = arg.accept(this);
            argTemps.add(argFunc.instructions.get(argFunc.instructions.size()-1).result);
        }

        // Generate call
        String resultTemp = newTemp();
        String methodName = node.methodName;
        if (node.type != null) {
            methodName = node.type + "." + methodName;
        }

        currentFunction.add(new TACInstruction(
                TACInstruction.Type.CALL,
                resultTemp,
                methodName,
                String.join(",", argTemps),
                null
        ));

        return currentFunction;
    }

    @Override
    public TACFunction visit(New node) {
        String temp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.CALL,
                temp,
                "new_" + node.type,
                null,
                null
        ));
        return currentFunction;
    }

    @Override
    public TACFunction visit(Not node) {
        TACFunction expr = node.expr.accept(this);
        String exprTemp = expr.instructions.get(expr.instructions.size()-1).result;

        String resultTemp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.UNARY_OP,
                resultTemp,
                exprTemp,
                null,
                "NOT"
        ));
        return currentFunction;
    }

    @Override
    public TACFunction visit(Negate node) {
        TACFunction expr = node.expr.accept(this);
        String exprTemp = expr.instructions.get(expr.instructions.size()-1).result;

        String resultTemp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.UNARY_OP,
                resultTemp,
                exprTemp,
                null,
                "NEGATE"
        ));
        return currentFunction;
    }

    @Override
    public TACFunction visit(Plus node) {
        TACFunction left = node.left.accept(this);
        String leftTemp = left.instructions.get(left.instructions.size()-1).result;

        // Evaluate right operand
        TACFunction right = node.right.accept(this);
        String rightTemp = right.instructions.get(right.instructions.size()-1).result;

        // Generate subtraction instruction
        String resultTemp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.BINARY_OP,
                resultTemp,
                leftTemp,
                rightTemp,
                "PLUS"
        ));

        return currentFunction;
    }

    @Override
    public TACFunction visit(Minus node) {
        // Evaluate left operand
        TACFunction left = node.left.accept(this);
        String leftTemp = left.instructions.get(left.instructions.size()-1).result;

        // Evaluate right operand
        TACFunction right = node.right.accept(this);
        String rightTemp = right.instructions.get(right.instructions.size()-1).result;

        // Generate subtraction instruction
        String resultTemp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.BINARY_OP,
                resultTemp,
                leftTemp,
                rightTemp,
                "MINUS"
        ));

        return currentFunction;
    }

    @Override
    public TACFunction visit(Multiply node) {
        TACFunction left = node.left.accept(this);
        String leftTemp = left.instructions.get(left.instructions.size()-1).result;

        // Evaluate right operand
        TACFunction right = node.right.accept(this);
        String rightTemp = right.instructions.get(right.instructions.size()-1).result;

        // Generate subtraction instruction
        String resultTemp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.BINARY_OP,
                resultTemp,
                leftTemp,
                rightTemp,
                "MUL"
        ));

        return currentFunction;
    }

    @Override
    public TACFunction visit(Divide node) {
        TACFunction left = node.left.accept(this);
        String leftTemp = left.instructions.get(left.instructions.size()-1).result;

        // Evaluate right operand
        TACFunction right = node.right.accept(this);
        String rightTemp = right.instructions.get(right.instructions.size()-1).result;

        // Generate subtraction instruction
        String resultTemp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.BINARY_OP,
                resultTemp,
                leftTemp,
                rightTemp,
                "Divide"
        ));

        return currentFunction;
    }

    @Override
    public TACFunction visit(LessThan node) {
        // Evaluate left operand
        TACFunction left = node.left.accept(this);
        String leftTemp = left.instructions.get(left.instructions.size()-1).result;

        // Evaluate right operand
        TACFunction right = node.right.accept(this);
        String rightTemp = right.instructions.get(right.instructions.size()-1).result;

        // Generate comparison instruction
        String resultTemp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.BINARY_OP,
                resultTemp,
                leftTemp,
                rightTemp,
                "<"  // Less-than operator
        ));

        return currentFunction;
    }

    @Override
    public TACFunction visit(LessThanOrEqual node) {
        // Evaluate left operand
        TACFunction left = node.left.accept(this);
        String leftTemp = left.instructions.get(left.instructions.size()-1).result;

        // Evaluate right operand
        TACFunction right = node.right.accept(this);
        String rightTemp = right.instructions.get(right.instructions.size()-1).result;

        // Generate comparison instruction
        String resultTemp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.BINARY_OP,
                resultTemp,
                leftTemp,
                rightTemp,
                "<="  // Less-than-or-equal operator
        ));

        return currentFunction;
    }

    @Override
    public TACFunction visit(Equal node) {
        // Evaluate left operand
        TACFunction left = node.left.accept(this);
        String leftTemp = left.instructions.get(left.instructions.size()-1).result;

        // Evaluate right operand
        TACFunction right = node.right.accept(this);
        String rightTemp = right.instructions.get(right.instructions.size()-1).result;

        // Generate equality comparison instruction
        String resultTemp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.BINARY_OP,
                resultTemp,
                leftTemp,
                rightTemp,
                "=="  // Equality operator
        ));

        return currentFunction;
    }

    @Override
    public TACFunction visit(IsVoid node) {
        node.expr.accept(this);
        TACFunction expr = node.expr.accept(this);
        String exprTemp = expr.instructions.get(expr.instructions.size()-1).result;

        String resultTemp = newTemp();
        currentFunction.add(new TACInstruction(
                TACInstruction.Type.UNARY_OP,
                resultTemp,
                exprTemp,
                null,
                "ISVOID"
        ));
        return currentFunction;
    }
}

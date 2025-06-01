package main.java.compiler.ast;

public class ASTPrinter implements ASTVisitor<Void> {
    private int indentLevel = 0;
    private final StringBuilder output = new StringBuilder();

    public String getOutput() {
        return output.toString();
    }
    @Override
    public Void visit(BinaryOperation node) {
        printNode(node.operator + "Operation");
        indentLevel++;
        printNode("Left");
        node.left.accept(this);
        printNode("Right");
        node.right.accept(this);
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(UnaryOperation node) {
        return null;
    }

    private void indent() {
        for (int i = 0; i < indentLevel; i++) {
            output.append("  ");
        }
    }

    private void printNode(String nodeType, String... fields) {
        indent();
        output.append(nodeType);
        if (fields.length > 0) {
            output.append("(");
            output.append(String.join(", ", fields));
            output.append(")");
        }
        output.append("\n");
    }

    @Override
    public Void visit(Program node) {
        printNode("Program");
        indentLevel++;
        for (ClassDef classDef : node.classes) {
            classDef.accept(this);
        }
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(ClassDef node) {
        printNode("ClassDef", node.name,
                node.parent != null ? "inherits " + node.parent : "");
        indentLevel++;
        for (Feature feature : node.features) {
            feature.accept(this);
        }
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(Attribute node) {
        printNode("Attribute", node.name, node.type,
                node.init != null ? "init" : "no init");
        if (node.init != null) {
            indentLevel++;
            node.init.accept(this);
            indentLevel--;
        }
        return null;
    }

    @Override
    public Void visit(Method node) {
        printNode("Method", node.name, node.returnType);
        indentLevel++;
        for (Formal formal : node.formals) {
            formal.accept(this);
        }
        node.body.accept(this);
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(Formal node) {
        printNode("Formal", node.name, node.type);
        return null;
    }

    @Override
    public Void visit(IntLiteral node) {
        printNode("IntLiteral", String.valueOf(node.value));
        return null;
    }

    @Override
    public Void visit(StringLiteral node) {
        printNode("StringLiteral", "\"" + node.value + "\"");
        return null;
    }

    @Override
    public Void visit(BoolLiteral node) {
        printNode("BoolLiteral", String.valueOf(node.value));
        return null;
    }

    @Override
    public Void visit(Identifier node) {
        printNode("Identifier", node.name);
        return null;
    }

    @Override
    public Void visit(Assignment node) {
        printNode("Assignment", node.name);
        indentLevel++;
        node.value.accept(this);
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(If node) {
        printNode("If");
        indentLevel++;
        printNode("Condition");
        node.cond.accept(this);
        printNode("Then");
        node.thenBranch.accept(this);
        printNode("Else");
        node.elseBranch.accept(this);
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(While node) {
        printNode("While");
        indentLevel++;
        printNode("Condition");
        node.cond.accept(this);
        printNode("Body");
        node.body.accept(this);
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(Dispatch node) {
        printNode("Dispatch",
                node.caller != null ? "explicit" : "self",
                node.methodName,
                node.type != null ? "static type: " + node.type : "");
        indentLevel++;
        if (node.caller != null) {
            node.caller.accept(this);
        }
        for (Expression arg : node.args) {
            arg.accept(this);
        }
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(Block node) {
        printNode("Block");
        indentLevel++;
        for (Expression expr : node.expressions) {
            expr.accept(this);
        }
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(Let node) {
        printNode("Let");
        indentLevel++;
        for (Let.Binding binding : node.bindings) {
            printNode("Binding", binding.name, binding.type);
            if (binding.init != null) {
                indentLevel++;
                binding.init.accept(this);
                indentLevel--;
            }
        }
        printNode("In");
        node.body.accept(this);
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(Case node) {
        printNode("Case");
        indentLevel++;
        printNode("Expression");
        node.expr.accept(this);
        for (CaseBranch branch : node.branches) {
            branch.accept(this);
        }
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(CaseBranch node) {
        printNode("CaseBranch", node.varName, node.type);
        indentLevel++;
        node.expr.accept(this);
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(New node) {
        printNode("New", node.type);
        return null;
    }

    @Override
    public Void visit(IsVoid node) {
        printNode("IsVoid");
        indentLevel++;
        node.expr.accept(this);
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(Negate node) {
        printNode("Negate");
        indentLevel++;
        node.expr.accept(this);
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(Not node) {
        printNode("Not");
        indentLevel++;
        node.expr.accept(this);
        indentLevel--;
        return null;
    }

    @Override
    public Void visit(Plus node) {
        printBinaryOp("Plus", node.left, node.right);
        return null;
    }

    @Override
    public Void visit(Minus node) {
        printBinaryOp("Minus", node.left, node.right);
        return null;
    }

    @Override
    public Void visit(Multiply node) {
        printBinaryOp("Multiply", node.left, node.right);
        return null;
    }

    @Override
    public Void visit(Divide node) {
        printBinaryOp("Divide", node.left, node.right);
        return null;
    }

    @Override
    public Void visit(LessThan node) {
        printBinaryOp("LessThan", node.left, node.right);
        return null;
    }

    @Override
    public Void visit(LessThanOrEqual node) {
        printBinaryOp("LessThanOrEqual", node.left, node.right);
        return null;
    }

    @Override
    public Void visit(Equal node) {
        printBinaryOp("Equal", node.left, node.right);
        return null;
    }

    private void printBinaryOp(String opName, Expression left, Expression right) {
        printNode(opName);
        indentLevel++;
        printNode("Left");
        left.accept(this);
        printNode("Right");
        right.accept(this);
        indentLevel--;
    }
}
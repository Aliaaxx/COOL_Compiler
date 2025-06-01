package main.java.compiler.ast;

public class UnaryOperation extends Expression {
    public final Expression expr;
    public final String operator;

    public UnaryOperation(Expression expr, String operator,
                          int line, int column) {
        super(line, column);
        this.expr = expr;
        this.operator = operator;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "UnaryOp(" + operator + " " + expr + ")";
    }
}
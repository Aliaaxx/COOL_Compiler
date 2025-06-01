package main.java.compiler.ast;

public class BinaryOperation extends Expression {
    public final Expression left;
    public final Expression right;
    public final String operator;

    public BinaryOperation(Expression left, Expression right,
                           String operator, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "BinaryOp(" + left + " " + operator + " " + right + ")";
    }
}

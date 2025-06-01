package main.java.compiler.ast;

public class Plus extends Expression {
    public final Expression left;
    public final Expression right;

    public Plus(Expression left, Expression right,
                int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Plus(" + left + ", " + right + ")";
    }
}

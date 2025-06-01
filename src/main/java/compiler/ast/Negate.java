package main.java.compiler.ast;
public class Negate extends Expression {
    public final Expression expr;

    public Negate(Expression expr, int line, int column) {
        super(line, column);
        this.expr = expr;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Negate(" + expr + ")";
    }
}

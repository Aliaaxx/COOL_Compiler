package main.java.compiler.ast;

public class Not extends Expression {
    public final Expression expr;

    public Not(Expression expr, int line, int column) {
        super(line, column);
        this.expr = expr;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Not(" + expr + ")";
    }
}
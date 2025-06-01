package main.java.compiler.ast;

public class While extends Expression {
    public final Expression cond;
    public final Expression body;

    public While(Expression cond, Expression body, int line, int column) {
        super(line, column);
        this.cond = cond;
        this.body = body;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "While(" + cond + " loop " + body + ")";
    }
}

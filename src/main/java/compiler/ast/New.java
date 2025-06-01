package main.java.compiler.ast;

public class New extends Expression {
    public final String type;

    public New(String type, int line, int column) {
        super(line, column);
        this.type = type;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "New(" + type + ")";
    }
}
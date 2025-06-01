package main.java.compiler.ast;

public class BoolLiteral extends Expression {
    public final boolean value;

    public BoolLiteral(boolean value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "BoolLiteral(" + value + ")";
    }
}
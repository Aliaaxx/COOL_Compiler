package main.java.compiler.ast;

public class IntLiteral extends Expression {
    public final int value;

    public IntLiteral(int value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "IntLiteral(" + value + ")";
    }
}
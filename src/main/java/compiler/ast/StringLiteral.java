package main.java.compiler.ast;

public class StringLiteral extends Expression {
    public final String value;

    public StringLiteral(String value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "StringLiteral(\"" + value + "\")";
    }
}
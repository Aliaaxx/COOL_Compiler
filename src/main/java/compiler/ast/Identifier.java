package main.java.compiler.ast;

public class Identifier extends Expression {
    public final String name;

    public Identifier(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Identifier(" + name + ")";
    }
}
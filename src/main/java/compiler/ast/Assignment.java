package main.java.compiler.ast;

public class Assignment extends Expression {
    public final String name;
    public final Expression value;

    public Assignment(String name, Expression value, int line, int column) {
        super(line, column);
        this.name = name;
        this.value = value;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Assignment(" + name + " <- " + value + ")";
    }
}

package main.java.compiler.ast;


public class Formal extends ASTNode {
    public final String name;
    public final String type;

    public Formal(String name, String type, int line, int column) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Formal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", line=" + getLine() +
                ", column=" + getColumn() +
                '}';
    }
}
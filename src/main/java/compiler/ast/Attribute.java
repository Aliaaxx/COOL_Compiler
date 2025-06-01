package main.java.compiler.ast;
public class Attribute extends Feature {
    public final String name;
    public final String type;
    public final Expression init;

    public Attribute(String name, String type, Expression init,
                     int line, int column) {
        super(line, column);
        this.name = name;
        this.type = type;
        this.init = init;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {

        return "Attribute{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", init=" + init +
                ", line=" + getLine() +
                ", column=" + getColumn() +
                '}';
    }
}

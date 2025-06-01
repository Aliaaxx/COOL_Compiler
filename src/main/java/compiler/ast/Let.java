package main.java.compiler.ast;

import java.util.List;

public class Let extends Expression {
    public static class Binding {
        public final String name;
        public final String type;
        public final Expression init;

        public Binding(String name, String type, Expression init) {
            this.name = name;
            this.type = type;
            this.init = init;
        }

        @Override
        public String toString() {
            return name + " : " + type + (init != null ? " <- " + init : "");
        }
    }

    public final List<Binding> bindings;
    public final Expression body;

    public Let(List<Binding> bindings, Expression body, int line, int column) {
        super(line, column);
        this.bindings = bindings;
        this.body = body;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Let(" + bindings + " in " + body + ")";
    }
}
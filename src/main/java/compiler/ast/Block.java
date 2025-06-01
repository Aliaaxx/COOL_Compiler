package main.java.compiler.ast;


import java.util.List;

public class Block extends Expression {
    public final List<Expression> expressions;

    public Block(List<Expression> expressions, int line, int column) {
        super(line, column);
        this.expressions = expressions;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Block(" + expressions + ")";
    }
}
package main.java.compiler.ast;

public abstract class Feature extends ASTNode {
    public Feature(int line, int column) {
        super(line, column);
    }
}
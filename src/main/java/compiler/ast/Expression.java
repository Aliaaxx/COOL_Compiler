package main.java.compiler.ast;
public abstract class Expression extends ASTNode {
    public Expression(int line, int column) {
        super(line, column);
    }
}
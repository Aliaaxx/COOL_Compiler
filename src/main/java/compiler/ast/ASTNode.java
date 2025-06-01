package main.java.compiler.ast;

public abstract class ASTNode {
    // All nodes will have a location in source code
    private final int line;
    private final int column;

    public ASTNode(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() { return line; }
    public int getColumn() { return column; }

    // Visitor pattern acceptance method
    public abstract <T> T accept(ASTVisitor<T> visitor);
}

package main.java.compiler.ast;

public class CaseBranch extends ASTNode {
    public final String varName;
    public final String type;
    public final Expression expr;

    public CaseBranch(String varName, String type, Expression expr,
                      int line, int column) {
        super(line, column);
        this.varName = varName;
        this.type = type;
        this.expr = expr;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "CaseBranch(" + varName + ":" + type + " => " + expr + ")";
    }
}
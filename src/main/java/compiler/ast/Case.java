package main.java.compiler.ast;

import java.util.List;

public class Case extends Expression {
    public final Expression expr;
    public final List<CaseBranch> branches;

    public Case(Expression expr, List<CaseBranch> branches,
                int line, int column) {
        super(line, column);
        this.expr = expr;
        this.branches = branches;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Case(" + expr + ", " + branches + ")";
    }
}

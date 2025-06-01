package main.java.compiler.ast;

import java.util.List;

public class Dispatch extends Expression {
    public final Expression caller;
    public final String methodName;
    public final List<Expression> args;
    public final String type;  // For static dispatch (with @)

    public Dispatch(Expression caller, String methodName, List<Expression> args,
                    String type, int line, int column) {
        super(line, column);
        this.caller = caller;
        this.methodName = methodName;
        this.args = args;
        this.type = type;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Dispatch(" + caller +
                (type != null ? "@" + type : "") +
                "." + methodName + args + ")";
    }
}
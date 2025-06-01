package main.java.compiler.ast;
import main.java.compiler.ast.ASTNode;
import java.util.List;

public class Method extends Feature {
    public final String name;
    public final List<Formal> formals;
    public final String returnType;
    public final Expression body;

    public Method(String name, List<Formal> formals, String returnType, Expression body,
                  int line, int column) {
        super(line, column);
        this.name = name;
        this.formals = formals;
        this.returnType = returnType;
        this.body = body;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Method{" +
                "name='" + name + '\'' +
                ", formals=" + formals +
                ", returnType='" + returnType + '\'' +
                ", body=" + body +
                ", line=" + getLine() +
                ", column=" + getColumn() +
                '}';
    }
}
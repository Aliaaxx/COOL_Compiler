
package main.java.compiler.ast;

import java.util.List;

public class Program extends ASTNode {
    public final List<ClassDef> classes;

    public Program(List<ClassDef> classes, int line, int column) {
        super(line, column);
        this.classes = classes;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

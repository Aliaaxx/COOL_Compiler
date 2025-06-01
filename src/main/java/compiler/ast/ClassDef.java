package main.java.compiler.ast;

import java.util.List;

public class ClassDef extends ASTNode {
    public final String name;
    public final String parent;
    public final List<Feature> features;

    public ClassDef(String name, String parent, List<Feature> features,
                    int line, int column) {
        super(line, column);
        this.name = name;
        this.parent = parent;
        this.features = features;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
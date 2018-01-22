package implementation;

import contract.IVisitable;
import contract.IVisitor;

public class Ligne implements IVisitable{

    public String name;

    public Ligne(String name) {
        this.name = name;
    }

    @Override
    public void accept(IVisitor v) {

    }
}

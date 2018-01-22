package implementation;

import contract.IVisitable;
import contract.IVisitor;

import java.util.List;

public class Commande implements IVisitable{

    public String name;
    public List<Ligne> lignes;

    public Commande(String name) {
        this.name = name;
    }

    public Commande(String name, String ligneName) {
        this.name = name;
        addLigne(ligneName);
    }

    public void addLigne(String ligneName) {
        lignes.add(new Ligne(ligneName));
    }

    @Override
    public void accept(IVisitor v) {

    }
}

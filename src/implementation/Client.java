package implementation;

import contract.IVisitable;
import contract.IVisitor;

import java.util.List;

public class Client implements IVisitable{

    public String name;
    public List<Commande> commandes;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void accept(IVisitor v) {

    }
}

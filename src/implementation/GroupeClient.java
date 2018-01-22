package implementation;

import contract.IVisitable;
import contract.IVisitor;

import java.util.List;

public class GroupeClient implements IVisitable{

    public String name;
    public List<Client> clients;

    @Override
    public void accept(IVisitor v) {

    }
}

package contract;

import implementation.Client;
import implementation.Commande;
import implementation.Ligne;

public interface IVisitor {

    public void visit(Client c);

    public void visit(Commande c);

    public void visit(Ligne l);

    public void afficherCommandes();
}

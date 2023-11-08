package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : inserer;index;mot");
            return;
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.effacer(depart,fin);
        super.executer();
    }
}

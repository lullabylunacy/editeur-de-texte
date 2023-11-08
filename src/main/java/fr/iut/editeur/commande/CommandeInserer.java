package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;index;mot");
            return;
        }
        String mot = parameters[2];
        int index = Integer.parseInt(parameters[1]);
        this.document.inserer(index,mot);
        super.executer();
    }
}

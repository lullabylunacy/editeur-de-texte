package fr.iut.editeur.commande;

import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;depart;fin;chaine");
            return;
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String chaine="";
        if (parameters.length==4) {
            chaine=parameters[3];
        }
        this.document.remplacer(depart,fin,chaine);
        super.executer();
    }
}

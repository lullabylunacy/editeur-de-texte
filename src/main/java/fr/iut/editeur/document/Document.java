package fr.iut.editeur.document;
/**
 * gère les actions que chaque commande doit effectuer
 */
public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }
    /**
     * Description de la méthode
     * @param start est l'indice du premier caractere à remplacer
     * @param end est l'indice du der caractere à remplacer
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }
    /**
     * Description de la méthode
     * @param start est l'indice du premier caractere à mettre en majuscule
     * @param end est l'indice du der caractere à mettre en majuscule
     */
    public void majuscules(int start, int end) {
        remplacer(start,end,texte.substring(start,end).toUpperCase());
    }
    public void clear() {
        setTexte("");
    }
    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }
    public void inserer(int index, String mot)
    {
        String leftPart = texte.substring(0, index);
        String rightPart = texte.substring(index,texte.length());
        texte = leftPart + mot + rightPart;    }

    public String toString() {
        return this.texte;
    }
}

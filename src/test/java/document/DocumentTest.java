package document;

import fr.iut.editeur.document.Document;
import junit.framework.TestCase;
public class DocumentTest extends TestCase {

    public void testAjouter(){
        Document texte=new Document();
        texte.setTexte("texte");
        texte.ajouter(" test");
        assertEquals(texte.getTexte(),"texte test");
    }
    public void testRemplacer(){
        Document texte=new Document();
        texte.setTexte("texte");
        texte.remplacer(0,5,"trucs");
        assertEquals("trucs",texte.getTexte());
    }
}

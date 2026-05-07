import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import donnees.CD;
import donnees.Magasin;

public class MagasinTest {

    @Test
    void testTriSelectionPremierEtDernier() {

        Magasin magasin = new Magasin();

        magasin.ajouteCd(new CD("Ziggy", "Céline Dion"));
        magasin.ajouteCd(new CD("Envole moi", "Jean Jack Goldman"));
        magasin.ajouteCd(new CD("I Was Made For Lovin'You", "Kiss"));
        magasin.ajouteCd(new CD("Despacito", "Luis Fonsi"));

        magasin.trierSelection();

        int taille = magasin.getListeCds().size();

        String premierTitre = magasin.getListeCds().get(0).getTitreCD();
        assertEquals("Despacito", premierTitre, "Le premier élément après tri devrait être Despacito");

        String dernierTitre = magasin.getListeCds().get(taille - 1).getTitreCD();
        assertEquals("Ziggy", dernierTitre, "Le dernier élément après tri devrait être Ziggy");
    }
}
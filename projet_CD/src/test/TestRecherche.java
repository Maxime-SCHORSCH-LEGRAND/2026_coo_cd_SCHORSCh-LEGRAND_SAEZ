import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class TestRecherche {


    public void testRechercheAvecResultat() {


        Magasin m = new Magasin();
        m.ajouteCd(new CD("A", "Queen"));
        m.ajouteCd(new CD("B", "ACDC"));


        ArrayList<CD> res =
                m.chercher(new SelecteurArtiste("Queen"));


        assertEquals(1, res.size());
        assertEquals("Queen", res.get(0).getArtiste());
    }


    public void testRechercheSansResultat() {


        Magasin m = new Magasin();
        m.ajouteCd(new CD("A", "Queen"));


        ArrayList<CD> res =
                m.chercher(new SelecteurArtiste("Metallica"));


        assertEquals(0, res.size());
    }

    public void testSelecteurEt() {

        Magasin m = new Magasin();

        m.ajouteCd(new CD("Greatest Hits", "Queen"));
        m.ajouteCd(new CD("Black Album", "Metallica"));

        Selecteur s = new SelecteurEt(
                new SelecteurArtiste("Queen"),
                new SelecteurAlbum("Greatest Hits")
        );

        ArrayList<CD> res = m.chercher(s);

        assertEquals(1, res.size());
    }
    public void testComplexe() {

        Magasin m = new Magasin();

        m.ajouteCd(new CD("Rejuvenation", "The meters"));
        m.ajouteCd(new CD("The meters", "The meters"));

        Selecteur s =
                new SelecteurEt(
                        new SelecteurArtiste("The meters"),
                        new SelecteurNon(
                                new SelecteurAlbum("Rejuvenation")
                        )
                );

        ArrayList<CD> res = m.chercher(s);

        assertEquals(1, res.size());
        assertEquals("The meters",
                res.get(0).getTitre());
    }

    public void testPiste() {

        Magasin m = new Magasin();

        CD cd = new CD("Album", "Queen");
        cd.ajoutePiste(new InfoPiste("Bohemian Rhapsody"));

        m.ajouteCd(cd);

        ArrayList<CD> res =
                m.chercher(new SelecteurPiste("Bohemian Rhapsody"));

        assertEquals(1, res.size());
    }
}
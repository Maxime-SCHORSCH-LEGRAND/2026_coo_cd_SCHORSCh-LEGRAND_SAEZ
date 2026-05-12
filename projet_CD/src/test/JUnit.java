import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnit{

    void testChargerMagasinValide() throws FileNotFoundException {

        String chemin = "musicbrainzSimple";
        ChargeurMagasin cm = new ChargeurMagasin(chemin);

        Magasin m = cm.chargerMagasin();

        assertNotNull(m, "Le magasin ne devrait pas être nul");

        assertTrue(m.getListeCds().size() > 0, "Le magasin doit contenir au moins un CD.");
    }


    void testChargerMagasinInexistant() {

        ChargeurMagasin cm = new ChargeurMagasin("quelquepart");

        assertThrows(FileNotFoundException.class, () -> {
            cm.chargerMagasin();
        });

    }
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnit{

    void testChargerMagasinValide() throws FileNotFoundException {

        String chemin = "musicbrainzSimple";
        ChargeurMagasin cm = new ChargeurMagasin(chemin);

        Magasin m = cm.chargerMagasin();

        assertNotNull(m, "Le magasin ne devrait pas être nul");
        // Remplace 10 par le nombre de fichiers XML que tu as dans ton dossier de test
        assertTrue(m.getListeCds().size() > 0, "Le magasin doit contenir au moins un CD.");
    }

    @Test
    void testChargerMagasinInexistant() {

        ChargeurMagasin cm = new ChargeurMagasin("quelquepart");

        assertThrows(FileNotFoundException.class, () -> {
            cm.chargerMagasin();
        });

    }
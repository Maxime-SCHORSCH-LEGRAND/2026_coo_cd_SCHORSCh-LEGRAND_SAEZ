public class SelecteurArtiste implements Selecteur {

    private String nomArtiste;

    public SelecteurArtiste(String nom) {
        nomArtiste = nom;
    }

    public boolean garderCd(CD cd) {
        return cd.getArtiste()
                .equalsIgnoreCase(nomArtiste);
    }
}
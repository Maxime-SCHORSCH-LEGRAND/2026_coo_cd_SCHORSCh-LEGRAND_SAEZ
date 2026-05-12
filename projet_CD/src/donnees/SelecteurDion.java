public class SelecteurDion implements Selecteur {

    public boolean garderCd(CD cd) {
        return cd.getArtiste()
                .equalsIgnoreCase("Celine Dion");
    }
}
public class ComparateurArtiste implements ComparateurCd {

    public boolean etreAvant(CD cd1, CD cd2) {
        return cd1.getArtiste()
                .compareToIgnoreCase(cd2.getArtiste()) < 0;
    }
}
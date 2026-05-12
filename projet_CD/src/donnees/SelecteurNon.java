public class SelecteurNon implements Selecteur {

    private Selecteur s;

    public SelecteurNon(Selecteur s) {
        this.s = s;
    }

    public boolean garderCd(CD cd) {
        return !s.garderCd(cd);
    }
}
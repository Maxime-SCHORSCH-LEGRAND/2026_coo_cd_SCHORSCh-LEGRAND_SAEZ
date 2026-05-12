public class SelecteurOu implements Selecteur {

    private Selecteur s1;
    private Selecteur s2;

    public SelecteurOu(Selecteur a, Selecteur b) {
        s1 = a;
        s2 = b;
    }

    public boolean garderCd(CD cd) {
        return s1.garderCd(cd) || s2.garderCd(cd);
    }
}
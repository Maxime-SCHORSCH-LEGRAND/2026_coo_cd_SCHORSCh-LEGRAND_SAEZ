public class SelecteurBibier implements Selecteur {

    public boolean garderCd(CD cd) {
        return cd.getArtiste()
                .equalsIgnoreCase("Justin Bieber");
    }
}
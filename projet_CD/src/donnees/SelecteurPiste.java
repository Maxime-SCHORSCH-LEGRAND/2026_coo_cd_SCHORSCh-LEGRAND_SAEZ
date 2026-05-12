public class SelecteurPiste implements Selecteur {

    private String nom;

    public SelecteurPiste(String nom) {
        this.nom = nom;
    }

    public boolean garderCd(CD cd) {

        for(InfoPiste p : cd.getListePistes()) {

            if(p.getTitre()
                    .equalsIgnoreCase(nom)) {

                return true;
            }
        }

        return false;
    }
}
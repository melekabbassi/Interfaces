public class Voiture extends Vehicule {

    public Voiture(String marque, int puissance) {
        super(marque, puissance);
    }

    @Override
    void CalculNbPassager() {
        if (this.getMarque().equals("Jiayuan")) {
            this.setNbPassager(2);
        } else {
            this.setNbPassager(5);
        }
    }

    @Override
    void CalculPrixVignette(){
        if (this.getPuissance() == 4) {
            this.setPuissance(60);
        } else {
            this.setPuissance(120);
        }
    }
}

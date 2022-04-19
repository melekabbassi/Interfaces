public class Bus extends Vehicule implements Livreur {
    private String busType;

    public Bus(String marque, int puissance, String busType) {
        super(marque, puissance);
        this.busType = busType;
    }

    String getBusType() {
        return busType;
    }

    void setBusType(String busType) {
        this.busType = busType;
    }

    @Override
    void CalculNbPassager() {
        if(this.getBusType().equals("mini")){
            this.setNbPassager(10);
        } else if(this.getBusType().equals("maxi")){
            this.setNbPassager(30);
        }
    }

    @Override
    void CalculPrixVignette() {
        if (getBusType().equals("mini")) {
            System.out.println(10*getNbPassagers());
        } else if (getBusType().equals("maxi")) {
            System.out.println(10*getNbPassagers());
        }
    }

    @Override
    public void calculMontantLivraison(double coordPointDépart, double coordPointArrivé) {
        double distance = Math.sqrt(Math.pow(coordPointDépart, 2) + Math.pow(coordPointArrivé, 2));
        if (distance < 100) {
            System.out.println("Le montant de la livraison est de " + 500 + " Tnd");
        } else {
            System.out.println("Le montant de la livraison est de " + 700 + " Tnd");
        }
    }
}

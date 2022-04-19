public class Taxi extends Vehicule implements Livreur{
    private double prixUnitaireLivraison;
    private double taxeRoute;

    public Taxi(String marque, int puissance) {
        super(marque, puissance);
    }

    @Override
    void CalculNbPassager() { 
        this.setNbPassager(5);
    }

    @Override
    void CalculPrixVignette() {
        System.out.println(12*taxeRoute);
    }

    @Override
    public void calculMontantLivraison(double coordPointDépart, double coordPointArrivé) {
        double distance = Math.sqrt(Math.pow(coordPointDépart, 2) + Math.pow(coordPointArrivé, 2));
        System.out.println("Le montant de la livraison est de " + distance * prixUnitaireLivraison + " Tnd");
    }
}

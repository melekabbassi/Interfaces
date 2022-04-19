public class Livraison implements Livreur {

    @Override
    public void calculMontantLivraison(double coordPointDépart, double coordPointArrivé) {
        double distance = Math.sqrt(Math.pow(coordPointDépart, 2) + Math.pow(coordPointArrivé, 2));
        System.out.println("Le montant de la livraison est de " + distance * 0.5 + "€");
    }
    
    // main
    public static void main(String[] args) {
        Livraison livraison = new Livraison();
        livraison.calculMontantLivraison(1, 2);
    }
}

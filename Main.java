public class Main {
    
        public static void main(String[] args) {
        
            Voiture voiture = new Voiture("Jiayuan", 4);
            voiture.CalculNbPassager();
            voiture.CalculPrixVignette();
            System.out.println("Nombre passager du Voiture: " + voiture.getNbPassagers());
            System.out.println("Puissance: " + voiture.getPuissance());

            System.out.println("\n");

            Taxi taxi = new Taxi("Jiayuan", 4);
            taxi.CalculNbPassager();
            System.out.print("Prix Vignette: ");
            taxi.CalculPrixVignette();
            System.out.println("Nombre de passager du Taxi: " + taxi.getNbPassagers());
            System.out.println("Puissance: "+taxi.getPuissance());
            taxi.calculMontantLivraison(1, 2);

            System.out.println("\n");

            Bus bus = new Bus("Mercedes", 4, "maxi");
            bus.CalculNbPassager();
            System.out.print("Prix Vignette: ");
            bus.CalculPrixVignette();
            System.out.println("Nombre de passager du Bus: " + bus.getNbPassagers());
            System.out.println("Puissance: " + bus.getPuissance());
            bus.calculMontantLivraison(1, 2);

            System.out.println("\n");
        }
    
}

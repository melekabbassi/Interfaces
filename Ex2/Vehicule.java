package Ex2;

public abstract class Vehicule {
    private String marque;
    private int nbPassagers;
    private int puissance;

    // constructor
    public Vehicule(String marque, int puissance) {
        this.marque = marque;
        this.puissance = puissance;
    }

    // getters
    public String getMarque() {
        return marque;
    }

    public int getNbPassagers(){
        return nbPassagers;
    }
    public int getPuissance() {
        return puissance;
    }

    // setters

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setNbPassager(int nbPassagers) {
        this.nbPassagers = nbPassagers;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    // methods

    abstract void CalculNbPassager();

    abstract void CalculPrixVignette();
}

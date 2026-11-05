public abstract class Paiement {
    protected double montant;

    public Paiement(double montant) {
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

    public void afficherMontant() {
        System.out.println("Montant : " + getMontant());
    }

    public abstract void effectuerPaiement();
}

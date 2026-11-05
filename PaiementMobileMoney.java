public class PaiementMobileMoney extends Paiement {

    public PaiementMobileMoney(double montant) {
        super(montant);
    }

    @Override
    public void effectuerPaiement() {
        System.out.println("Paiement Mobile Money de " + getMontant() + "FCFA effectué");
    }
}

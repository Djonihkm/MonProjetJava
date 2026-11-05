// Crée une classe Produit contenant :
// - Un attribut nom de type String.
// - Un attribut prix de type double.
// - Une méthode afficherInformations() qui affiche le nom et le prix du produit.
// Puis crée un objet dans une méthode main, renseigne ses attributs et appelle afficherInformations().

public class Produit {
    String nom;
    double prix;

    public void afficherInformations() {
        System.out.println("Nom du produit : " + nom);
        System.out.println("Prix du produit : " + prix);
    }

    public static void main(String[] args) {
        Produit produit = new Produit();
        produit.nom = "Ordinateur";
        produit.prix = 999.99;
        produit.afficherInformations();
    }
}


// Écris une classe SurchageMethode contenant deux méthodes surchargées nommées multiplier :
// - La première reçoit deux entiers et renvoie leur produit.
// - La seconde reçoit trois entiers et renvoie leur produit.

public class SurchageMethode {
    // Sans le mot clé static il faut créer un objet pour utiliser les methodes
    public static int multiplier(int a, int b) {
        return a * b;
    }

    public static int multiplier(int a, int b, int c) {
        return a * b * c;
    }
}
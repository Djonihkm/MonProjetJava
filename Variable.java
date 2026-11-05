// public class Variable {
//     public static void main(String[] args) {
//         String nom = "Djoni";
//         int age = 25;
//         double prix = 2500.50;
//         int quantite = 3;

//         double total = prix * quantite;

//         System.out.println("Nom : " + nom);
//         System.out.println("Age : " + age);
//         System.out.println("Prix unitaire : " + prix);
//         System.out.println("Total : " + total);
//     }
// }


// Écris un programme Java qui :
// - déclare une variable prix valant 1500 ;
// - déclare une variable quantite valant 4 ;
// - calcule le total ;
// - affiche Le montant total est : 6000.

public class Variable {
    public static void main(String[] args) {
        int prix = 1500;
        int quantite = 4;
        int total = prix * quantite;
        System.out.println("Le montant total est : " + total);
    }
}

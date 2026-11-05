// Concernant la classe Personne 
// public class Main {
//     public static void main(String[] args) {
//         Etudiant Djoni = new Etudiant("Djoni", 20, "Système Informatique et logiciel");
//         Djoni.sePresenter();
//         Djoni.afficherFiliere();
//     }
// }

// Concernant la classe Animale
// public class Main {

//     public static void main(String[] args) {
//         Animal[] animals = {
//                 new Animal(),
//                 new Chien(),
//                 new Chat()
//         };

//         for (Animal animal : animals) {
//             animal.faireDuBruit();
//         }
//     }
// }

// Concernant la classe Paiement
public class Main {
    public static void main(String[] args) {
        Paiement paiement1 = new PaiementMobileMoney(25000);
        
        paiement1.afficherMontant();
        paiement1.effectuerPaiement();
    }

}
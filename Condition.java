// Écris une condition qui affiche Majeur si age est supérieur ou égal à 18, et Mineur sinon.
// public class Condition {
//     public static void main(String[] args) {
//         int age = 17;

//         if (age >= 18) {
//             System.out.println("Majeur");
//         } else {
//             System.out.println("Mineur");
//         }
//     }
// }

// Avec int note = 9;, affiche :
// - Très bien si la note est supérieure ou égale à 16 ;
// - Bien si elle est supérieure ou égale à 12 ;
// - Passable si elle est supérieure ou égale à 10 ;
// - Insuffisant dans les autres cas.

public class Condition {
    public static void main(String[] args) {
        int note = 9;

        if (note >= 16) {
            System.out.println("Très bien");

        } else if (note >= 12) {
            System.out.println("Bien");
        } else if (note >= 10) {
            System.out.println("Passable");
        } else {
            System.out.println("Insuffisant");
        }
    }
}
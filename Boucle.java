// Écris une boucle for qui affiche les nombres de 1 à 10.

// public class Boucle {
//     public static void main(String[] args) {
//         for(int i = 1; i<=10; i++) {
//             System.out.println(i);
//         }
//     }
// }

// Écris une boucle for qui affiche uniquement les nombres pairs de 2 à 20.

public class Boucle {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
// Attributs : nom (String) et age (int).
// Un constructeur pour initialiser les deux attributs.
// Une méthode sePresenter() qui affiche le nom et l'âge.

public class Personne {
    protected  String nom;
    protected  int age;

    public Personne (String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void sePresenter(){
        System.out.println("Nom : " + nom);
        System.out.println("Age : " + age);
    }
}

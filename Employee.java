// Crée une classe Employe avec :
// - nom de type String, déclaré private.
// - salaire de type double, déclaré private.
// - Un constructeur pour initialiser ces deux attributs.
// - Un getter pour le nom.
// - Un getter pour le salaire.
// - Un setter pour le salaire qui refuse les valeurs négatives.
// - Une méthode afficherInformations().
// Dans main, crée un employé, affiche ses informations, modifie son salaire et
// affiche le nouveau salaire. {

// }

public class Employee {
    private String nom;
    private double salaire;

    public Employee(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double nouveauSalaire) {
        if (nouveauSalaire < 0) {
            System.out.println("Valeur négative interdite");
        } else {
            salaire = nouveauSalaire;
        }
    }

    public void afficherInformations() {
        System.out.println("Nom : " + getNom());
        System.out.println("Salaire : " + getSalaire());
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Jean", 175000);
        employee.afficherInformations();

        employee.setSalaire(400000);
        System.out.println("Nouveau salaire : " + employee.getSalaire());
    }
}

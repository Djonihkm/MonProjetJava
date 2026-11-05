// Hérite de Personne.
// Ajoute un attribut filiere (String).
// Son constructeur initialise le nom, l'âge et la filière.
// Une méthode afficherFiliere() affiche la filière.

public class Etudiant extends Personne {
    private String filiere;

    public Etudiant(String nom, int age, String filiere) {
        super(nom, age);
        this.filiere = filiere;
    }

    public void afficherFiliere() {
        System.out.println("Filière : " + filiere);
    }

    
}

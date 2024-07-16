public class personne {
    private final String nom;
    private final int age;

    public personne() {
        this.nom = "";
        this.age = 18;
    }

    public personne(final String nom, final int age) {
        this.nom = nom;
        this.age = age;
    }

    public personne(final personne p) {
        this.nom = p.nom;
        this.age = p.age;
    }

    @Override
    public String toString() {
        return "Personne, nom = " + nom + ", age = " + age;
    }
}

 class Etudiant extends personne {
    private final String universite;
    private final String specialite;

    public Etudiant() {
        super();
        this.universite = "";
        this.specialite = "";
    }

    public Etudiant(final String nom, final int age, final String universite, final String specialite) {
        super(nom, age);
        this.universite = universite;
        this.specialite = specialite;
    }

    public Etudiant(final Etudiant e) {
        super(e);
        this.universite = e.universite;
        this.specialite = e.specialite;
    }

   
    public static class Main {
        public static void main(String[] args) {
            personne personne = new personne("MATHEOOOO", 1200);
            System.out.println(personne);
    
            Etudiant etudiant = new Etudiant("MATHEOOOO", 1200, "Universite de Paris", "Informatique");
            System.out.println(etudiant);
        }}
    }
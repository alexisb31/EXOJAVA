import java.util.ArrayList;

public class Eleve implements Comparable<Eleve>{
    private String nom;
    private ArrayList<Integer> listenotes = new ArrayList<>();
    private Double moyenne;

    public Eleve(String nom) {
        this.nom = nom;
        this.moyenne = 0.0;
    }

    public Eleve(String nom, ArrayList<Integer> listenotes, Double moyenne) {
        this.nom = nom;
        this.listenotes = listenotes;
        this.moyenne = moyenne;
    }

    public double calculMoyenne() {
        if (listenotes.isEmpty()) {
            moyenne = 0.0;
        } else {
            double somme = 0;
            for (int note : listenotes) {
                somme += note;
            }
            moyenne = somme / listenotes.size();
        }
        return moyenne;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Integer> getListenotes() {
        return listenotes;
    }

    public void ajouterNote(int note) {
        if (note < 0) {
            note = 0;
        } else if (note > 20) {
            note = 20;
        }
        listenotes.add(note);
    }

    @Override
    public int compareTo(Eleve autreEleve) {
        return this.moyenne.compareTo(autreEleve.getMoyenne());
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Moyenne: " + moyenne;
    }
}


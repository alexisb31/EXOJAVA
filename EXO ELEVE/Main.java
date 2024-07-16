// Main.java
public class Main {
    public static void main(String[] args) {
        Eleve e = new Eleve("Titouan");
        e.ajouterNote(10);
        e.ajouterNote(15);
        e.ajouterNote(20);
        System.out.println("La moyenne de " + e.getNom() + " est de " + e.calculMoyenne());
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Eleve e1 = new Eleve("Titouan");
        e1.ajouterNote(10);
        e1.ajouterNote(15);
        e1.ajouterNote(20);
        e1.calculMoyenne();

        Eleve e2 = new Eleve("Léa");
        e2.ajouterNote(4);
        e2.ajouterNote(11);
        e2.ajouterNote(18);
        e2.calculMoyenne();

        System.out.println("La moyenne de " + e1.getNom() + " est de " + e1.getMoyenne());
        System.out.println("La moyenne de " + e2.getNom() + " est de " + e2.getMoyenne());

        if (e1.compareTo(e2) > 0) {
            System.out.println(e1.getNom() + " a une meilleure moyenne que " + e2.getNom());
        } else if (e1.compareTo(e2) < 0) {
            System.out.println(e2.getNom() + " a une meilleure moyenne que " + e1.getNom());
        } else {
            System.out.println(e1.getNom() + " et " + e2.getNom() + " ont la même moyenne");
        }
    }
}

public class CalculFactorielle {

    // Méthode pour calculer la factorielle d'un nombre
    public static long calculerFactorielle(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Le nombre doit être positif ou nul.");
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculerFactorielle(n - 1);
        }
    }

    // Méthode principale pour tester la fonction de calcul de factorielle
    public static void main(String[] args) {
        // Tester avec un nombre
        int nombreATester = 29;
        long resultat = calculerFactorielle(nombreATester);
        System.out.println("La factorielle de " + nombreATester + " est : " + resultat);
    }
}

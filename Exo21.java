import java.util.Scanner;

public class Exo21 {
    static class Calcul{
        static Scanner sc = new Scanner(System.in);
        public static void calcul(){
            System.out.println("Saisissez un nombre : ");
            int x = sc.nextInt();
            int result = ((x*x)+x+3);
            System.out.println("Le resultat du calcul est : " + result);
        }
    }
    public static void main(String[] args) {
        Calcul.calcul();
    }
}

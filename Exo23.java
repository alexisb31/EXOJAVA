import java.util.Scanner;

public class Exo23 {
    static Scanner sc = new Scanner(System.in);
    static class Surface{
        public static void CalculerSurface(){
        System.out.println("Saisissez la logueur du rectangle : ");
        int longueur = sc.nextInt();
        System.out.println("Saisissez la largeur du rectangle : ");
        int largeur = sc.nextInt();

        int aire = longueur * largeur;
        System.out.println("L'aire du rectangle est : " + aire + " m2");
    }
    }
    public static void main(String[]args){
        Surface.CalculerSurface();
    }

}

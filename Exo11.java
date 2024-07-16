import java.util.Scanner;

public class Exo11 {
    static Scanner sc = new Scanner(System.in);

    public static void TemperatureConverter(){
            System.out.println("Saisissez une temperature en degres Celsius :");
            int Celsius = sc.nextInt();
            int Fahrenheit = (9/5) * Celsius + 32;
            System.out.println("valeur en degres Fahrenheit : " + Fahrenheit);
        }
    public static void main(String[]args){
        TemperatureConverter();
    }
    }


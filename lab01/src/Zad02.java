import java.util.Scanner;

public class Zad02 {
    public static void main(String[] args) {
        // Kalkulator tekstowy

        Scanner sc = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Enter number1: ");
        number1 = sc.nextInt();

        System.out.println("Enter number2: ");
        number2 = sc.nextInt();

        int suma = number1 + number2;
        int roznica = number1 - number2;
        int mnozenie = number1 * number2;
        int dzielenie = number1 / number2;

        System.out.println("Suma: " + suma);
        System.out.println("Roznica: " + roznica);
        System.out.println("Mnozenie: " + mnozenie);
        System.out.println("Dzielenie: " + dzielenie);

        sc.close();

    }
}

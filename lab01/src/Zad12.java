import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podawaj liczby całkowite (licza ujemna kończy program):");

        int liczba = scanner.nextInt();

        if (liczba < 0) {
            System.out.println("Nie wprowadzono żadnych poprawnych liczb.");
        } else {
            int min = liczba;
            int max = liczba;

            while (true) {
                liczba = scanner.nextInt();

                if (liczba < 0) {
                    break;
                }
                if (liczba > max) {
                    max = liczba;
                }
                if (liczba < min) {
                    min = liczba;
                }
            }
            System.out.println("Największa liczba: " + max);
            System.out.println("Najmniejsza liczba: " + min);
        }
    }
}

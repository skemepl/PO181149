import java.util.Scanner;

public class Zad08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj dodatnią liczbę całkowitą: ");
        int liczba = sc.nextInt();

        if(liczba < 0){
            System.out.println("Tylko liczby dodatnie są dozwolone");
        } else{
            int odwocona = 0;

            while(liczba>0){
                int cyfra = liczba % 10;
                odwocona = odwocona * 10 + cyfra;
                liczba /= 10;
            }

            System.out.println("Liczba w odwróconej kolejności: " + odwocona);

            sc.close();

        }
    }
}

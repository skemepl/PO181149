import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pobranie znaku i liczby
        System.out.println("Podaj pojedynczy znak: ");
        char znak = sc.next().charAt(0);

        System.out.println("Podaj wysokość piramidy (liczba całkowita): ");
        int n = sc.nextInt();

        //Budowanie piramidy
        for(int i=1;i<=n;i++){
            StringBuilder level = new StringBuilder();
            for(int j=0;j<2*i-1;j++){
                level.append(znak);
            }
            System.out.println(level);
        }
        sc.close();
    }
}

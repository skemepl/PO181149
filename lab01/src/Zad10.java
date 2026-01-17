import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę n (mniejszą): ");
        int n = sc.nextInt();

        System.out.println("Podaj liczbę m (większą): ");
        int m = sc.nextInt();

        if(n>=m){
            System.out.println("Błąd: n musi być mniejsze niż m.");
        }else{
            int suma = 0;
            for(int i=n;i<=m;i++){
                suma +=i;
            }
            System.out.println("Suma liczb od " + n + " do " + m + " wynosi: "+ suma);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Zad09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int a = sc.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        int b = sc.nextInt();

        int nww = obliczNWW(a, b);

        System.out.println("Najmniejsza wspólna wielokrotność (NWW) liczb " + a + " i " + b + " to: " + nww);

        sc.close();

    }
    public static int obliczNWW(int a, int b){
        return Math.abs(a * b) / obliczNWD(a, b);
    }
    public static int obliczNWD(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}

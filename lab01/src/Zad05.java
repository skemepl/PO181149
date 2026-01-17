import java.util.Scanner;

public class Zad05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj swój dochód (PLN): ");
        double dochod = sc.nextDouble();
        double podatek;

        if(dochod <= 85528){
            podatek = dochod * 0.18;
        }else{
            podatek = 14839.02 + (dochod - 85528) * 0.32;
        }

        System.out.println("Twój podatek dochodowy wynosi: " + podatek + "PLN");

        sc.close();

    }
}

import java.util.Scanner;

public class Zad06 {
    enum Miesiac { STYCZEN, LUTY, MARZEC, KWIECIEN, MAJ, CZERWIEC, LIPIEC, SIERPIEN, WRZESIEN, PAZDZIERNIK, LISTOPAD, GRUDZIEN }

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.print("Podaj dzień: ");
        int dzien = skaner.nextInt();

        System.out.print("Podaj miesiąc: ");
        String nazwa = skaner.next();

        System.out.print("Podaj rok: ");
        int rok = skaner.nextInt();

        Miesiac miesiac = Miesiac.valueOf(nazwa.toUpperCase());
        boolean przestepny = (rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0);
        int maxDni;

        switch (miesiac) {
            case KWIECIEN: case CZERWIEC: case WRZESIEN: case LISTOPAD:
                maxDni = 30;
                break;
            case LUTY:
                maxDni = przestepny ? 29 : 28;
                break;
            default:
                maxDni = 31;
        }

        if (dzien > 0 && dzien <= maxDni && rok > 0) {
            System.out.println("Poprawna data");
        } else {
            System.out.println("Błędna data");
        }
    }
}

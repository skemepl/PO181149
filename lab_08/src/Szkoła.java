import java.util.Arrays;

public class Szkoła {
    public static void main(String[] args) {
        Osoba[] osoby = {
                new Osoba("Anna", 25, 165.5),
                new Osoba("Bartek", 19, 190.0),
                new Osoba("Dawid", 25, 175.5),
                new Osoba("Dorota", 35, 170.5),
                new Osoba("Ewa", 22, 160.0)
        };

        System.out.println("Przed sortowaniem:");
        for (Osoba osoba : osoby) {
            System.out.println(osoba);
        }

        Arrays.sort(osoby, new WiekComparator());

        System.out.println("Po sortowaniu według wieku:");
        for (Osoba osoba : osoby) {
            System.out.println(osoba);
        }
    }
}

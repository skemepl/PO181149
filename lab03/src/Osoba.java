import java.util.Scanner;

public class Osoba {
    private String name;
    private int years;

    private Osoba(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public static Osoba stworzOsobe(String name, int years) {
        return new Osoba(name, years);
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Years: " + years);
    }

    public static void main(String[] args) {
//        Osoba o1 = new Osoba("Nieznany", 1); <-- Błąd kompilacji

        Osoba o2 = Osoba.stworzOsobe("Mateusz", 21);
        o2.showInfo();
    }
}

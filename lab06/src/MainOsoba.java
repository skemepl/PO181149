import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract class Osoba {
    String imie;
    String nazwisko;
    LocalDate dataRozpoczecia;

    public Osoba(String imie, String nazwisko, LocalDate dataRozpoczecia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public abstract String getOpis();
}

class Student extends Osoba {
    public Student(String imie, String nazwisko, LocalDate data) { super(imie, nazwisko, data); }
    public String getOpis() { return "Student: " + imie + " " + nazwisko; }
}

class PracownikNaukowy extends Osoba {
    public PracownikNaukowy(String imie, String nazwisko, LocalDate data) { super(imie, nazwisko, data); }
    public String getOpis() { return "Naukowiec: " + imie + " " + nazwisko; }
}

class PracownikAdministracyjny extends Osoba {
    public PracownikAdministracyjny(String imie, String nazwisko, LocalDate data) { super(imie, nazwisko, data); }
    public String getOpis() { return "Admin: " + imie + " " + nazwisko; }
}

public class MainOsoba {
    public static void main(String[] args) {
        List<Osoba> osoby = new ArrayList<>();
        osoby.add(new Student("Jan", "Kowalski", LocalDate.of(2020, 10, 1)));
        osoby.add(new PracownikNaukowy("Anna", "Nowak", LocalDate.of(2015, 5, 15)));
        osoby.add(new PracownikAdministracyjny("Piotr", "Wisniewski", LocalDate.of(2018, 1, 10)));

        for (Osoba o : osoby) {
            System.out.println(o.getOpis());
        }

        System.out.println("Różnica lat: " + roznicaLat(osoby.get(0), osoby.get(1)));
    }

    public static long roznicaLat(Osoba a, Osoba b) {
        LocalDate d1 = a.dataRozpoczecia;
        LocalDate d2 = b.dataRozpoczecia;

        if (d1.isAfter(d2)) {
            LocalDate temp = d1;
            d1 = d2;
            d2 = temp;
        }

        int years = d2.getYear() - d1.getYear();
        if (d2.getMonthValue() < d1.getMonthValue() ||
                (d2.getMonthValue() == d1.getMonthValue() && d2.getDayOfMonth() < d1.getDayOfMonth())) {
            years--;
        }

        return years;
    }
}
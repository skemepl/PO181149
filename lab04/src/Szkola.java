import java.util.ArrayList;
import java.util.List;

public class Szkola {
    private List<String> uczniowie = new ArrayList<>();

    public void dodajUcznia(String imieNazwisko) {
        uczniowie.add(imieNazwisko);
    }

    public List<String> getUczniowie() {
        return new ArrayList<>(uczniowie);
    }

    public static void main(String[] args) {
        Szkola szkola = new Szkola();
        szkola.dodajUcznia("Anna Kowalska");
        szkola.dodajUcznia("Jan Nowak");

        List<String> lista = szkola.getUczniowie();
        lista.remove(0);

        System.out.println(lista);
        System.out.println("Uczniowie szkoły: " + szkola.getUczniowie());
    }

}

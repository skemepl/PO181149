import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {
    public static void main(String[] args) {
        List<Product> items = new ArrayList<>();

        items.add(new Product("Mleko", 4.5, LocalDate.of(2025, 12, 10)));
        items.add(new Product("Ser", 12.0, LocalDate.of(2026, 1, 12)));
        items.add(new Product("Chleb", 5.5, LocalDate.of(2025, 12, 10)));
        items.add(new Product("Jogurt", 2.99, LocalDate.of(2025, 12, 10)));
        items.add(new Product("Szynka", 25.0, LocalDate.of(2026, 2, 20)));

        System.out.println("Przed sortowaniem:");
        items.forEach(System.out::println);

        Collections.sort(items);

        System.out.println("Po sortowaniu:");
        items.forEach(System.out::println);
    }
}

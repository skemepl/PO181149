import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zad2 {
    public static <T> void reversePrint(Iterable<T> items) {
        if (items == null) {
            return;
        }
        List<T> list = new ArrayList<>();
        for (T item : items) {
            list.add(item);
        }

        Collections.reverse(list);

        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        System.out.println("Kolejność odwrócona:");
        reversePrint(numbers);
    }
}

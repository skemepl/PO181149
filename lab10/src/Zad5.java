import java.util.HashSet;
import java.util.List;

public class Zad5 {
    public static <T> HashSet<T> findUniqueElements(List<T> list) {
        if (list == null || list.isEmpty()) {
            return new HashSet<>();
        }
        return new HashSet<>(list);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,2,3,3,4,5,5,1);

        HashSet<Integer> result = findUniqueElements(numbers);

        System.out.println("Oryginalna lista: " + numbers);
        System.out.println("Unikalne elementy: " + result);
    }
}

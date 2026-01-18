import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class Zad8 {

    public static <T> boolean isSymmetric(Deque<T> deque) {
        Deque<T> copy = new LinkedList<>(deque);
        while (copy.size() > 1) {
            T first = copy.pollFirst();
            T last = copy.pollLast();
            if (!Objects.equals(first, last)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Deque<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        System.out.println(isSymmetric(numbers));
    }
}
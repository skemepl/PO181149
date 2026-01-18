import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;

public class Zad4 {

    public static <T> boolean isPalindrome(LinkedList<T> list) {
        // Pusta lista lub jeden element to zawsze palindrom
        if (list == null || list.size() <= 1) return true;

        ListIterator<T> forward = list.listIterator();
        ListIterator<T> backward = list.listIterator(list.size());

        // Sprawdzamy tylko do połowy listy
        for (int i = 0; i < list.size() / 2; i++) {
            T left = forward.next();
            T right = backward.previous();

            if (!Objects.equals(left, right)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("kajak");
        list.add("wioślarz");
        list.add("kajak");

        System.out.println("Czy palindrom: " + isPalindrome(list)); // true

        list.add("łódka");
        System.out.println("Czy palindrom: " + isPalindrome(list)); // false
    }
}
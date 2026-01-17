import java.util.*;

public class Zad1 {
    public static <T> void printUnique(Collection<T> items){
        if(items != null){
            items.stream().distinct().forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        printUnique(java.util.List.of("Ania", "Bartek", "Ania", "Cezary"));
    }
}

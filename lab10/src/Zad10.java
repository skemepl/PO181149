import java.util.HashMap;
import java.util.Map;

public class Zad10 {

    public static <K, V> Map<V, K> reverseMap(Map<K, V> map) {
        Map<V, K> reversed = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            reversed.put(entry.getValue(), entry.getKey());
        }
        return reversed;
    }

    public static void main(String[] args) {
        Map<String, Integer> original = new HashMap<>();
        original.put("Jeden", 1);
        original.put("JedenB", 1);
        original.put("Dwa", 2);

        System.out.println(reverseMap(original));
    }
}
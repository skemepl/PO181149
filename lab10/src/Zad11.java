import java.util.HashMap;

public class Zad11 {

    public static <K, V> HashMap<V, Integer> countValueOccurrences(HashMap<K, V> map) {
        HashMap<V, Integer> counts = new HashMap<>();
        for (V value : map.values()) {
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }
        return counts;
    }

    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<>();
        data.put("A", "Kot");
        data.put("B", "Pies");
        data.put("C", "Kot");

        System.out.println(countValueOccurrences(data));
    }
}
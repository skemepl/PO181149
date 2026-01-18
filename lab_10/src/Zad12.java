import java.util.TreeMap;

public class Zad12 {

    public static <K, V> TreeMap<K, V> subMapInRange(TreeMap<K, V> map, K startKey, K endKey) {
        return new TreeMap<>(map.subMap(startKey, true, endKey, true));
    }

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");

        System.out.println(subMapInRange(map, 2, 3));
    }
}
import java.util.ArrayList;
import java.util.List;

public class Zad3 {
    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2){
        ArrayList<T> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>(List.of("A", "B", "C"));
        ArrayList<String> l2 = new ArrayList<>(List.of("D", "E", "F"));

        ArrayList<String> result = mergeLists(l1, l2);
        System.out.println(result);
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class Zad7 {
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> list){
        ArrayList<Integer> odwrocona = new ArrayList<>();
        for(int i = list.size() - 1; i >= 0; i--){
            odwrocona.add(list.get(i));
        }
        return odwrocona;
    };

    public static void main(String[] args) {
        ArrayList<Integer> oryginalna = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Oryginalna: " + oryginalna);

        ArrayList<Integer> odwrocona = reverseArray(oryginalna);
        System.out.println("Odwrocona: " + odwrocona);
    }
}

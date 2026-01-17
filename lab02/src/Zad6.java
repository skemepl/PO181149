import java.util.ArrayList;
import java.util.Arrays;

public class Zad6 {
    public static int minimumValue(ArrayList<Integer> list){
        int min = list.get(0);
        for(int liczba : list){
            if(liczba < min){
                min = liczba;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>(Arrays.asList(12,43,33,14,5,62,7,18,59,120));
        System.out.println("Lista: " + liczby);
        int najmniejsza = minimumValue(liczby);
        System.out.println("Najmniejsza liczba: " + najmniejsza);
    }
}

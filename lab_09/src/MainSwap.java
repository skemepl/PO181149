import java.util.Arrays;

public class MainSwap {

    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("Błąd: Indeksy spoza zakresu lub pusta tablica.");
            return;
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] liczby = {1, 2, 3, 4, 5};
        System.out.println("Przed: " + Arrays.toString(liczby));

        swap(liczby, 0, 4);

        System.out.println("Po: " + Arrays.toString(liczby));

        String[] slowa = {"Ala", "ma", "kota"};
        swap(slowa, 0, 2);
        System.out.println("Słowa po zamianie: " + Arrays.toString(slowa));
    }
}
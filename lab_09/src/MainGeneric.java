public class MainGeneric {

    public static <T extends Comparable<T>> T max(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica jest pusta");
        }

        T maxElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(maxElement) > 0) {
                maxElement = array[i];
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        Integer[] liczby = {10, 4, 8, 2, 9};
        String[] imiona = {"Adam", "Zenon", "Bartek"};

        System.out.println("Max liczba: " + max(liczby));
        System.out.println("Max imie: " + max(imiona));
    }
}
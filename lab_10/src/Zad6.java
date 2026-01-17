import java.util.TreeSet;

public class Zad6 {
    public static <T> TreeSet<T> findElementsInRange(TreeSet<T> set, T lowerBound, T upperBound) {
        if(set == null || lowerBound == null || upperBound == null) {
            return new TreeSet<>();
        }

        return new TreeSet<>(set.subSet(lowerBound, true, upperBound, true));
    }
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for(int i = 10; i<=100; i+=10){
            numbers.add(i);
        }
        System.out.println("Oryginalny zbiór: " + numbers);

        TreeSet<Integer> range = findElementsInRange(numbers, 25, 75);

        System.out.println("Elementy w przedziale [25, 75]: " + range);
    }
}

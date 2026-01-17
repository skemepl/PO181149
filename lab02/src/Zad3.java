import java.util.Random;

public class Zad3 {
    public static int generateRandomIntInRange(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min > max");
        }
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        int min = 5;
        int max = 10;

        System.out.println("Random number between " + min + " and " + max);
        for(int i=0;i<5;i++) {
            int random = generateRandomIntInRange(min,max);
            System.out.println("-> " + random);
        }
    }
}

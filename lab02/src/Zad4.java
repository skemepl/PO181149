import java.util.Random;

public class Zad4 {
    public static int randomIntBetween1To100(int min, int max) {
        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }

    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int[] digits = new int[20];
        double sum = 0;

        System.out.println("20 Random number between 1 and 100");
        for(int i=0;i<20;i++) {
            digits[i] = randomIntBetween1To100(min,max);
            System.out.print(digits[i] + " ");
            sum+=digits[i];
        }
        System.out.println("\nAvg: "+sum/20);
    }
}

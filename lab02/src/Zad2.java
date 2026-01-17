public class Zad2 {
    public static double siedemDoMinusN(int n) {
        if(n <= 0) {
            throw  new IllegalArgumentException("n musi być dodatnie");
        }

        int power = 1;
        for(int i = 0; i < n; i++) {
            power *= 7;
        }

        return 1.0/power;
    }

    public static void main(String[] args) {
        int n=4;
        double result=siedemDoMinusN(n);
        System.out.println(result);
    }

}

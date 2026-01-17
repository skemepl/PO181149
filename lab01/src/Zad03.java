public class Zad03 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 3;
        double d = 20.0;

        a += 4;
        b -= a;
        c *= (2 - 4 * a);
        d /= (4 - Math.pow(a, 2));

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}

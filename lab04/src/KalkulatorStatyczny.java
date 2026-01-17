public class KalkulatorStatyczny {
    static int liczbaOperacji = 0;

    public static int dodaj(int a, int b) {
        liczbaOperacji++;
        return a + b;
    }
    public static int odejmij(int a, int b) {
        liczbaOperacji++;
        return a - b;
    }
    public static int pomnoz(int a, int b) {
        liczbaOperacji++;
        return a * b;
    }
    public static int getLiczbaOperacji() {
        return liczbaOperacji;
    }
    public static void main(String[] args) {
        System.out.println("5 + 3 = " + KalkulatorStatyczny.dodaj(5, 3));
        System.out.println("5 - 3 = " + KalkulatorStatyczny.odejmij(5, 3));
        System.out.println("5 * 3 = " + KalkulatorStatyczny.pomnoz(5, 3));

        System.out.println("Liczba operacji: " + KalkulatorStatyczny.getLiczbaOperacji());
    }
}

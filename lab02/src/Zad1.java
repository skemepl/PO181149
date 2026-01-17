public class Zad1 {
    public static int najwiekszaLiczbaPierwsza(int n) {
        if(n<=2) {
            System.out.println("n musi być większe niż 2");
        }

        for (int i=n-1; i>=2; i--) {
            if (czyPierwsza(i)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean czyPierwsza(int liczba) {
        if(liczba<2) return false;
        for(int i=2;i<=Math.sqrt(liczba);i++) {
            if(liczba%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(najwiekszaLiczbaPierwsza(10));
        System.out.println(najwiekszaLiczbaPierwsza(3));
        System.out.println(najwiekszaLiczbaPierwsza(31));
    }

}

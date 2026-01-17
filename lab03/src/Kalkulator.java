public class Kalkulator {

    public int obliczSume(int a, int b) {
        if(checkData(a, b)) {
            return a+b;
        } else {
            System.out.println("Błąd: Jedna z liczb jest dodatnia");
            return 0;
        }
    }

    private boolean checkData(int a, int b) {
        if(a< 0 || b < 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        System.out.println("Suma 5 + 3: " + k.obliczSume(5, 3));
        System.out.println("Suma 5 + (-2): " + k.obliczSume(5, -2));
    }
}

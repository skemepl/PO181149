public class Zad10 {
    public static void capitalizeEverySecond(StringBuffer text) {
        for (int i = 0; i < text.length(); i += 2) {
            char znak = text.charAt(i);
            text.setCharAt(i, Character.toUpperCase(znak));
        }
    }

    public static void main(String[] args) {
        StringBuffer napis = new StringBuffer("kolokwium");
        System.out.println("Original: " + napis);

        capitalizeEverySecond(napis);
        System.out.println("After Capitalization: " + napis);
    }
}

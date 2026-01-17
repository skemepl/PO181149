public class Zad8 {
    public static String swapFirstAndLast(String text) {
        if(text.length() <= 1) {
            return text;
        }

        char first = text.charAt(0);
        char last = text.charAt(text.length() - 1);
        String middle = text.substring(1, text.length() - 1);
        return last + middle + first;
    }

    public static void main(String[] args) {
        String original = "Mateusz";
        String swapped = swapFirstAndLast(original);

        System.out.println("Original: " + original);
        System.out.println("Swapped: " + swapped);
    }
}

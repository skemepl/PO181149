import java.util.Random;

public class Zad5 {
    public static void main(String[] args) {
        int[] tab = new int[30];
        Random rand = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(1000) + 1;
        }

        int licznikKwadratow = 0;

        for (int liczba : tab){
            int pierwiastek = (int) Math.sqrt(liczba);
            if(pierwiastek * pierwiastek == liczba){
                licznikKwadratow++;
            }
        }

        System.out.println("Tablica liczb: ");
        for(int liczba : tab){
            System.out.println(liczba + " ");
        }

        System.out.println("Licznik kwadratow: " + licznikKwadratow);

    }
}

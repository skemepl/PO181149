public class Zad07 {
    public static void main(String[] args) {
        System.out.println("Pierwsze 20 liczb parzystych: ");
        int licznikParzyste = 0;
        int liczba = 2;

        do{
            System.out.print(liczba + " ");
            liczba += 2;
            licznikParzyste++;
        } while(licznikParzyste<20);

        System.out.println("\nPierwsze 20 liczb nieparzystych: ");
        int licznikNieparzyste = 0;
        liczba = 1;

        do{
            System.out.print(liczba + " ");
            liczba+=2;
            licznikNieparzyste++;
        } while(licznikNieparzyste<20);

    }
}

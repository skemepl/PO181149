public class TestAccess {
    public static void main(String[] args) {
        Person osoba = new Person("Mateusz", "tajneHaslo");

        System.out.println("Imię: " + osoba.name);
        // System.out.println("Hasło: " + osoba.password); <-- Błąd kompilacji
        System.out.println("Hasło: " + osoba.getPassword());
        osoba.setPassword("noweHaslo");
        System.out.println("Nowe hasło: "+ osoba.getPassword());
    }
}

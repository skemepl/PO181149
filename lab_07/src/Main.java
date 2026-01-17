public class Main {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO("Wiedźmin: Ostatnie życzenie", "Andrzej Sapkowski", 39.99, 1993);
        BookDTO book2 = new BookDTO("Hobbit", "J.R.R Tolkien", 45.50, 1937);
        BookDTO book3 = new BookDTO("Pan Tadeusz", "Adam Mickiewiz", 25.00, 1834);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("\nTytuł pierwszej książki: " + book1.title());
        System.out.println("Cena: " + book1.price() + " zł");

        BankAccount emptyAccount = new BankAccount("PL1234567890");
        System.out.println("Nowe konto: " + emptyAccount);

        BankAccount savingsAccount = new BankAccount("PL0987654321", 1000.0);
        System.out.println("Konto oszczędnościowe: " + savingsAccount);

        BankAccount updatedAccount = savingsAccount.withInterest(5.0);

        System.out.println("Konto po naliczeniu odsetek: " + updatedAccount);
    }
}

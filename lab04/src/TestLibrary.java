import books.Book;
import library.Shelf;

public class TestLibrary {
    public static void main(String[] args) {
        Shelf shelf = new Shelf();

        Book b1 = new Book("Lalka", "Bolesław Prus", 1890);
        Book b2 = new Book("Zbrodnia i kara", "Fiodor Dostojewski", 1866);

        shelf.addBook(b1);
        shelf.addBook(b2);

        shelf.printShelf();

        shelf.removeBook(b1);
        shelf.printShelf();
    }
}

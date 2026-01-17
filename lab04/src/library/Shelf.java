package library;

import books.Book;
import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private List<Book> books;

    public Shelf() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added");
    }

    public void removeBook(Book book) {
        if(books.remove(book)) {
            System.out.println("Book removed");
        } else  {
            System.out.println("Book not found");
        }
    }

    public void printShelf() {
        System.out.println("Shelf: ");
        for (Book book : books) {
            System.out.println("- " + book);
        }
    }
}

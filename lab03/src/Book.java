public class Book {
    String title;
    String author;
    int publicationYear;

    public Book() {
        title = "Nieznany tytuł";
        author = "Nieznany autor";
        publicationYear = 0;
    }

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication year: " + publicationYear);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Lalka", "Bolesław Prus", 1890);

        System.out.println("Książka 1: ");
        book1.printInfo();

        System.out.println("Książka 2: ");
        book2.printInfo();
    }
}

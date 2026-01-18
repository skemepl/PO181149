import java.time.LocalDate;

public class Product implements Comparable<Product>{
    private String name;
    private double price;
    private LocalDate expirationDate;

    public Product(String name, double price, LocalDate expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    @Override
    public int compareTo(Product o) {
        int dateCompare = expirationDate.compareTo(o.expirationDate);

        if(dateCompare != 0){
            return dateCompare;
        }

        return Double.compare(price, o.price);
    }

    @Override
    public String toString() {
        return String.format("Produkt: " + name + " Cena: " + price + " Data ważności: " + expirationDate);
    }

}

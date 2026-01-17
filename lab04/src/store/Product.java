package store;

public class Product {
    static int numberOfProducts = 0;

    static final int MAX_PRODUCT = 5;

    private String name;

    public Product(String name) {
        if(numberOfProducts < MAX_PRODUCT) {
            this.name = name;
            numberOfProducts++;
            System.out.println("store.Product " + this.name + " created");
        } else  {
            System.out.println("store.Product " + this.name + " is too big");
        }
    }
}

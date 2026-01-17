public class Car {
    String brand;
    String model;
    int productionYear;

    // Domyślny
    public Car() {
        brand = "Nieznana marka";
        model = "Nieznany model";
        productionYear = 0;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        productionYear = 0; // Domyślna wartość
    }

    public Car(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    // Wyświetlanie informacji
    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + productionYear);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Supra");
        Car car3 = new Car("Ford", "Mustang", 2020);

        System.out.println("Car 1: ");
        car1.printInfo();

        System.out.println("Car 2: ");
        car2.printInfo();

        System.out.println("Car 3: ");
        car3.printInfo();
    }
}

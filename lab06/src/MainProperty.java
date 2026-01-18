import java.util.Objects;

class Property {
    private String address;
    private double size;
    private double price;

    public Property(String address, double size, double price) {
        this.address = address;
        this.size = size;
        this.price = price;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public double getSize() { return size; }
    public void setSize(double size) { this.size = size; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Address: " + address + ", Size: " + size + ", Price: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return Double.compare(property.size, size) == 0 &&
                Double.compare(property.price, price) == 0 &&
                Objects.equals(address, property.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, size, price);
    }
}

class House extends Property {
    private int numberOfFloors;

    public House(String address, double size, double price, int numberOfFloors) {
        super(address, size, price);
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfFloors() { return numberOfFloors; }
    public void setNumberOfFloors(int numberOfFloors) { this.numberOfFloors = numberOfFloors; }

    @Override
    public String toString() {
        return super.toString() + ", Floors: " + numberOfFloors;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        House house = (House) o;
        return numberOfFloors == house.numberOfFloors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfFloors);
    }
}

class Apartment extends Property {
    private int floorNumber;

    public Apartment(String address, double size, double price, int floorNumber) {
        super(address, size, price);
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() { return floorNumber; }
    public void setFloorNumber(int floorNumber) { this.floorNumber = floorNumber; }

    @Override
    public String toString() {
        return super.toString() + ", Floor: " + floorNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Apartment apartment = (Apartment) o;
        return floorNumber == apartment.floorNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), floorNumber);
    }
}

public class MainProperty {
    public static void main(String[] args) {
        House house = new House("Warszawska 1", 120.5, 500000, 2);
        Apartment apt = new Apartment("Krakowska 5", 45.0, 300000, 3);

        System.out.println(house);
        System.out.println(apt);
    }
}
import java.util.Objects;

public class Property {
    private String address;
    private double size;
    private double price;

    public Property(String address, double size, double price) {
        this.address = address;
        this.size = size;
        this.price = price;
    }
}

public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}

public double getSize() {
    return size;
}
public void setSize(double size) {
    this.size = size;
}

public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}

@Override
public String toString() {
    return "Address: " + address + ", Size: " + size + "m2, Price: " + price;
}

@Override
public boolean equals(Object o){
    if (this == o) return true;
    if(!(o instanceof Property)) return false;
    Property property = (Property) o;
    return Double.compare(property.size, size) == 0 &&
            Double.compare(property.price, price) == 0 &&
            Objects.equals(address, property.address);
}

@Override
public int hashCode() {
    return Objects.hash(address, size, price);
}

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Order {
    private int id;
    private String customerName;
    private LocalDate orderDate;

    public Order(int id, String customerName, LocalDate orderDate) {
        this.id = id;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public String getCustomerName() { return customerName; }
    public LocalDate getOrderDate() { return orderDate; }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", customer='" + customerName + '\'' + ", date=" + orderDate + '}';
    }
}

class OrderDateComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getOrderDate().compareTo(o2.getOrderDate());
    }
}

class CustomerNameComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getCustomerName().compareTo(o2.getCustomerName());
    }
}

public class MainOrder {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Nowak", LocalDate.of(2023, 10, 5)));
        orders.add(new Order(2, "Kowalski", LocalDate.of(2023, 10, 1)));
        orders.add(new Order(3, "Adamski", LocalDate.of(2023, 10, 5)));
        orders.add(new Order(4, "Zieliński", LocalDate.of(2023, 9, 15)));
        orders.add(new Order(5, "Bareja", LocalDate.of(2023, 10, 1)));

        // Sortowanie złożone: najpierw data, potem nazwa
        orders.sort(new OrderDateComparator().thenComparing(new CustomerNameComparator()));

        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
public class Company {
    public static void main(String[] args) {
        Employee emp = new Employee("Mateusz");
        System.out.println("Imię pracownika: " + emp.name);
    }
}

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
}

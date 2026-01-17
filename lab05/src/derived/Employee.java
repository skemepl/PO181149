package derived;

import base.Person;

public class Employee extends Person {
    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void displayData() {
        System.out.println("Imię: " + getFirstName());
        System.out.println("Nazwisko: " + getLastName());
    }
}

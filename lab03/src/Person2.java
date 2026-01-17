public class Person2 {
    String name;

    public Person2(String name) {
        this.name = name;
    }

    public void introduceYourself() {
        System.out.println("Hi, I'm " + name);
    }

    public void sayHello(Person2 otherPerson) {
        System.out.println("Hello, " + otherPerson.name);
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void swapNames(Person2 otherPerson) {
        String temp = this.name;
        this.name = otherPerson.name;
        otherPerson.name = temp;
    }
}

class TestPerson {
    public static void main(String[] args) {
        Person2 p1 = new Person2("Mateusz");
        Person2 p2 = new Person2("Daniel");

        p1.introduceYourself();
        p2.introduceYourself();

        p1.sayHello(p2);
        p2.sayHello(p1);

        p2.changeName("Zuzia");
        p2.introduceYourself();

        p1.swapNames(p2); // Zamiana imion

        System.out.println("Po zamianie:");

        p1.introduceYourself();
        p2.introduceYourself();

    }
}

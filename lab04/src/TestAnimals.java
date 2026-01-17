import animals.Cat;
import animals.Dog;

public class TestAnimals {
    public static void main(String[] args) {
        Dog dog = new Dog("Reksio", 4);
        Cat cat = new Cat("Kropka", 3);

        System.out.println("Pies: " + dog.name + ", wiek: " + dog.age);
        dog.makeSound();

        System.out.println("Kot: " + cat.name + ", wiek: " + cat.age);
        cat.makeSound();
    }
}

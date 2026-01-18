class Animal {
    int age;

    public Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal age: " + age;
    }
}

class Dog extends Animal {
    public Dog(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Dog age: " + age;
    }
}

public class MainComparison {

    public static <T extends Animal> T findMax(T element1, T element2) {
        if (element1.age > element2.age) {
            return element1;
        } else {
            return element2;
        }
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(10);

        Dog olderDog = findMax(dog1, dog2);
        System.out.println("Starsze zwierzę: " + olderDog);
    }
}
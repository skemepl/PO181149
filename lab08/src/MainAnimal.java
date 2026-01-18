interface LoudAnimal {
    void makeNoise();
}

class Dog implements LoudAnimal {
    @Override
    public void makeNoise() {
        System.out.println("Woof woof");
    }
}

class Cat implements LoudAnimal {
    @Override
    public void makeNoise() {
        System.out.println("Meow meow");
    }
}

public class MainAnimal {
    public static void main(String[] args) {
        LoudAnimal dog = new Dog();
        LoudAnimal cat = new Cat();

        dog.makeNoise();
        cat.makeNoise();
    }
}
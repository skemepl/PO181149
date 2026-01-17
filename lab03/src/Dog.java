public class Dog {
    // Pola klasy
    String name;
    String breed;
    int age;

    // Konstruktor
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Metoda
    public void bark() {
        System.out.println("Wow Wow");
    }

    // Przypadek testowy
    public static void main(String[] args) {
        Dog myDog = new Dog("Reksio", "Beagle", 4);
        System.out.println("Dog: " + myDog.name + ", breed: " + myDog.breed + ", age: " + myDog.age);
        myDog.bark();
    }

}

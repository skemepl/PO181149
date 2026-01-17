public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setObject("Test1");
        String message = stringBox.getObject();
        System.out.println("Zawartość stringBox: " + message);

        Box<Integer> integerBox = new Box<>();
        integerBox.setObject(123);
        int number = integerBox.getObject();
        System.out.println("Zawartość intBox: " + number);


        //Zad 2
        Triple<String, Integer, Boolean> studentData = new Triple<>("Jan Kowalski", 23, true);
        
        String name = studentData.getFirst();
        Integer age = studentData.getSecond();
        boolean isActive = studentData.getThird();

        System.out.println("Student: " + name);
        System.out.println("Wiek: " + age);
        System.out.println("Czy Aktywny: " + isActive);

        Triple<Double, Double, String> coordinates =
                new Triple<>(52.22, 21.02, "Warszawa");

        System.out.println("Lokalizacja: " + coordinates);
    }
}

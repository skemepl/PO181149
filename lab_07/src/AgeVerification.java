public class AgeVerification {
    public static void checkAge(int age){
        if(age<18){
            throw new IllegalArgumentException("Wiek nie może być poniżej 18");
        }
        System.out.println("Dostęp przyznany");
    }

    public static void main(String[] args){
        int[] testAges = {25, 15, 18, -6};

        for(int age : testAges){
            try{
                checkAge(age);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Zakończono sprawdzanie osoby.");
            }
        }
    }
}

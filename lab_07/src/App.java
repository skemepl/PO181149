public class App {
    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
        String emailR = "^[A-Za-z0-9+_.-]+@(.+)$";

        if(dane == null || !dane.matches(emailR)) {
            throw new NiepoprawnyFormatDanychException("Dane: " + dane + " są nie poprawne.");
        }
        System.out.println("Format poprawny");
    }

    public static void main(String[] args) {
        String[] testoweDane = {"kontakt@firma.pl", "zly_adres.com", "jan.kowalski@poczta", "admin@domena.pl"};

        for(String email : testoweDane) {
            try {
                System.out.println("Sprawdzam: " + email);
                sprawdzFormatDanych(email);
            } catch (NiepoprawnyFormatDanychException e) {
                System.err.println(e.getMessage());
            } finally {
                System.out.println("----------------------");
            }
        }
    }
}

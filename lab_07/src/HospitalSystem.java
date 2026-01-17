import java.time.LocalDate;

public class HospitalSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient("Jan", "Kowalski", LocalDate.of(1990, 1, 1));
        Patient p2 = new Patient("Anna", "Nowak",  LocalDate.of(1960, 12, 12));

        p1.getCard().addEntry("Złamanie ręki - 2024");
        p1.getCard().addEntry("Kontrola - 2025");

        Doctor doctor = new Doctor("Kamil", "Bzych", "Ortopeda");
        doctor.addPatient(p1);
        doctor.addPatient(p2);

        doctor.showPatients();
        System.out.println("Szczegóły karty pacjenta 1: " + p1.getCard());
    }
}

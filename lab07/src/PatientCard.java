import java.time.LocalDate;
import java.util.ArrayList;

class PatientCard {
    private ArrayList<String> medicalHistory;
    private ArrayList<String> allergies;
    private ArrayList<String> medications;

    public PatientCard(){
        this.medicalHistory = new ArrayList<>();
        this.allergies = new ArrayList<>();
        this.medications = new ArrayList<>();
    }

    public void addEntry(String entry) { medicalHistory.add(entry); }

    @Override
    public String toString() {
        return "Historia: " + this.medicalHistory + ", Alergie: " + this.allergies;
    }
}


class Patient {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private PatientCard card;

    public Patient(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.card = new PatientCard();
    }

    public PatientCard getCard() {
        return card;
    }

    @Override
    public String toString() {
        return "Pacjent: " + this.firstName + ", " + this.lastName + " (ur. " + this.birthDate + ")";
    }
}

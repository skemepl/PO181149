import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String firstName;
    private String lastName;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String firstName, String lastName, String specialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public void showPatients(){
        System.out.println("Lekarz " + lastName + " przyjmuje pacjentów: ");
        for(Patient patient : patients){
            System.out.println(patient);
        }
    }
}

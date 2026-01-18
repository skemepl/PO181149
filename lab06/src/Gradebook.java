import java.util.ArrayList;
import java.util.Objects;

public class Gradebook {
    private String firstName;
    private String lastName;
    private ArrayList<Integer> grades;

    public Gradebook(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new ArrayList<>();
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public ArrayList<Integer> getGrades() { return grades; }
    public void setGrades(ArrayList<Integer> grades) { this.grades = grades; }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void removeGrade(int index) {
        if (index >= 0 && index < grades.size()) {
            grades.remove(index);
        }
    }

    public double averageGrade() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (int g : grades) sum += g;
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Gradebook for " + firstName + " " + lastName + ": Average Grade = " + averageGrade() + ", Grades: " + grades + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gradebook gradebook = (Gradebook) o;
        return Objects.equals(firstName, gradebook.firstName) &&
                Objects.equals(lastName, gradebook.lastName) &&
                Objects.equals(grades, gradebook.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, grades);
    }
}
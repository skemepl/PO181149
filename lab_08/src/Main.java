import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ania", 4.5, 2002));
        students.add(new Student("Maria", 3.8, 2001));
        students.add(new Student("Julia", 5.0, 2003));
        students.add(new Student("Marek", 4.2, 2002));
        students.add(new Student("Tomek", 4.9, 2001));

        System.out.println("Lista przed sortowaniem:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);


        System.out.println("Lista po sortowaniu malejąco (wedłóg średniej):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

public class Student implements Comparable<Student>{
    private String name;
    private double averageGrade;
    private int yearOfBirth;
    public Student(String name,double averageGrade,int yearOfBirth){
        this.name=name;
        this.averageGrade=averageGrade;
        this.yearOfBirth=yearOfBirth;
    }

    @Override
    public int compareTo(Student o) {
        if(this.averageGrade<o.averageGrade) return 1;
        else if(this.averageGrade>o.averageGrade) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return String.format("Student: " + name + " Średnia: " + averageGrade + " Rok ur.: " + yearOfBirth);
    }
}

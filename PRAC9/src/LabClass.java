import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;
        import java.util.List;

public class LabClass {
    private List<Student> students;

    public LabClass() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void sortStudentsByAverageGrade() {
        Collections.sort(students, Comparator.comparingDouble(Student::getAverageGrade));
    }

    // Другие методы для работы со списком студентов
}

import java.util.List;
import java.util.Scanner;

public class LabClassUI {
    private static LabClass labClass = new LabClass();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. Sort students by average grade");
            System.out.println("3. Search student by name");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    sortStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter average grade: ");
            double averageGrade = scanner.nextDouble();

            System.out.print("Enter INN: ");
            String INN = scanner.next();

            Student student = new Student(name, averageGrade, INN);
            labClass.addStudent(student);
            System.out.println("Student added successfully.");
        } catch (EmptyStringException | BadINNException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    // LabClassUI.java
    private static void sortStudents() {
        labClass.sortStudentsByAverageGrade();
        List<Student> sortedStudents = labClass.getStudents();

        System.out.println("Students sorted by average grade:");
        for (Student student : sortedStudents) {
            System.out.println("Name: " + student.getName() + ", Average Grade: " + student.getAverageGrade() + ", INN: " + student.getINN());
        }
    }


    private static void searchStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name to search: ");
        String name = scanner.nextLine();

        try {
            Student foundStudent = findStudentByName(name);
            System.out.println("Student found: " + foundStudent.getName() + " with average grade " + foundStudent.getAverageGrade());
        } catch (StudentNotFoundException e) {
            System.out.println("Student not found: " + e.getMessage());
        }
    }

    private static Student findStudentByName(String name) throws StudentNotFoundException {
        for (Student student : labClass.getStudents()) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with name '" + name + "' not found.");
    }
}

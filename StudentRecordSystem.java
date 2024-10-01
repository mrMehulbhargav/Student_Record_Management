
import java.util.*;

public class StudentRecordSystem {
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add new student record");
            System.out.println("2. Update existing student record");
            System.out.println("3. Display all student records");
            System.out.println("4. Search for a student by ID");
            System.out.println("5. Calculate and display average GPA");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    updateStudent(scanner);
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    searchStudent(scanner);
                    break;
                case 5:
                    calculateAverageGPA();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Enter GPA: ");
        double GPA = scanner.nextDouble();
        students.add(new Student(studentID, firstName, lastName, dateOfBirth, GPA));
        System.out.println("Student added successfully.");
    }

    private static void updateStudent(Scanner scanner) {
        System.out.print("Enter Student ID to update: ");
        String studentID = scanner.nextLine();
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                System.out.print("Enter new First Name: ");
                student.setFirstName(scanner.nextLine());
                System.out.print("Enter new Last Name: ");
                student.setLastName(scanner.nextLine());
                System.out.print("Enter new Date of Birth (YYYY-MM-DD): ");
                student.setDateOfBirth(scanner.nextLine());
                System.out.print("Enter new GPA: ");
                student.setGPA(scanner.nextDouble());
                System.out.println("Student record updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void searchStudent(Scanner scanner) {
        System.out.print("Enter Student ID to search: ");
        String studentID = scanner.nextLine();
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void calculateAverageGPA() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }
        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.getGPA();
        }
        System.out.println("Average GPA: " + (totalGPA / students.size()));
    }
}

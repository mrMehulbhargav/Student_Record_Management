
import java.util.*;

public class Student {
    private String studentID;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private double GPA;

    // Constructor
    public Student(String studentID, String firstName, String lastName, String dateOfBirth, double GPA) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.GPA = GPA;
    }

    // Getters and setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Name: " + firstName + " " + lastName + ", DOB: " + dateOfBirth + ", GPA: " + GPA;
    }
}

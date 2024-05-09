// 9. Write a program to demonstrate the concept of abstract class with constructor and ``final`` method.

abstract class Student {
    private String name;
    private int rollNumber;

    // Constructor for Student class
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayDetails();

    // Final method to display student information
    public final void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class BCAStudent extends Student {
    private String semester;

    // Constructor for BCAStudent class
    public BCAStudent(String name, int rollNumber, String semester) {
        super(name, rollNumber);
        this.semester = semester;
    }

    // Implementation of abstract method
    @Override
    public void displayDetails() {
        System.out.println("BCA Student Details:");
        displayStudentInfo();
        System.out.println("Semester: " + semester);
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        // Create a BCAStudent object
        BCAStudent bcaStudent = new BCAStudent("Sagar Yadav", 24, "4th");

        // Display BCA student details
        bcaStudent.displayDetails();
    }
}

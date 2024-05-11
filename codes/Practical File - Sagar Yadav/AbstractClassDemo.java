// 9. Write a program to demonstrate the concept of abstract class with constructor and ``final`` method.

abstract class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public abstract void displayDetails();

    // Final method 
    public final void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class BCAStudent extends Student {
    private String semester;

    public BCAStudent(String name, int rollNumber, String semester) {
        super(name, rollNumber);
        this.semester = semester;
    }


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

        System.out.println("\n\n-------------------------------------------------------------------------");
        System.out.println("| Sagar Yadav, Enrollment No.: 02027902022, 4th Semester (2022-25), BCA |");
        System.out.println("-------------------------------------------------------------------------");
    }
} // Sagar Yadav, Enrollment No.: 02027902022, 4th Semester, BCA (2022-25)
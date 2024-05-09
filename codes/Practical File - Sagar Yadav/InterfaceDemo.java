// 10. Write a program to demonstrate the concept of interface when two interfaces have unique methods and same data members.

interface Person {
    String name = "Sagar Yadav"; // Shared data member

    void displayDetails(); // Unique method
}

interface Student {
    String name = "Alice Smith"; // Shared data member

    void displayInfo(); // Unique method
}

class CollegeStudent implements Person, Student {
    @Override
    public void displayDetails() {
        System.out.println("Person Name: " + Person.name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + Student.name);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        CollegeStudent collegeStudent = new CollegeStudent();
        collegeStudent.displayDetails();
        collegeStudent.displayInfo();
    }
}

// 10. Write a program to demonstrate the concept of interface when two interfaces have unique methods and same data members.

interface Person {
    String name = "Sagar Yadav";

    void displayDetails(); 
}

interface Student {
    String name = "Prasoon Kumar";

    void displayInfo();
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
/*		Student Details
Sagar Yadav
Semester: Fourth
Enrolment No.: 02027902022
Session: 2022-25
Course: Bachelor of Computer Application
*/
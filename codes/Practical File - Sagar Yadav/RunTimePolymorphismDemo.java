// 7. Write a program to demonstrate run-time polymorphism. 
class Student {
    void display() {
        System.out.println("Sagar Yadav");
    }
}

class BCAStudent extends Student {
    void display() {
        System.out.println("Shiva Yadav!");
    }
}

public class RunTimePolymorphismDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        BCAStudent student2 = new BCAStudent();

        student1.display();
        student2.display();

        System.out.println("\n\n-------------------------------------------------------------------------");
        System.out.println("| Sagar Yadav, Enrollment No.: 02027902022, 4th Semester (2022-25), BCA |");
        System.out.println("-------------------------------------------------------------------------");
    }
} // Sagar Yadav, Enrollment No.: 02027902022, 4th Semester, BCA (2022-25)
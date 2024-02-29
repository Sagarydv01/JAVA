// 6. Write a program to use super() to invoke base class constructor

class Base {
    String collName;

    Base(String value) {
        collName = value;
    }

    void displayBase() {
        System.out.println("Name (Base Class): " + collName);
    }
}

class Derived extends Base {
    String course;

    Derived(String value1, String value2) {
        super(value1);
        course = value2;
    }

    void displayDerived() {
        System.out.println("Course (Derived Class): " + course);
    }
}

class SuperDemo {
    public static void main(String[] args) {
        Derived derived = new Derived("TIIPS", "Bachelor of Computer Application (BCA)");

        derived.displayBase();
        derived.displayDerived();

        System.out.println("\n\n-------------------------------------------------------------------------");
        System.out.println("| Sagar Yadav, Enrollment No.: 02027902022, 4th Semester (2022-25), BCA |");
        System.out.println("-------------------------------------------------------------------------");
    }
} // Sagar Yadav, Enrollment No.: 02027902022, 4th Semseter, BCA (2022-25)
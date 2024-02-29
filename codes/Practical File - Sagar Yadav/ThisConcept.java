// 4. Write a program to demonstrate concept of 'this'.

class ThisConcept {
    String name;
    int age;

    ThisConcept() {
        System.out.println("Default Constructor called using this keyword!");
    }

    ThisConcept(String name, int age) {
        this();     //  calling Default Constructor
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        this.about();
    }

    void about() {
        System.out.println("Sagar Yadav, Enrollment No.: 02027902022, 4rth Semester, 2022-25, BCA");
    }

    public static void main(String[] args) {
        ThisConcept obj = new ThisConcept("Sagar Yadav", 19);
        obj.display();
    }
} // Sagar Yadav, Enrollment No.: 02027902022, 4rth Semester, 2022-25, BCA
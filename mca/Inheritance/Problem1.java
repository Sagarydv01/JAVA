package Inheritance;

class MyClass1 {
    int rollNo;
    String name;

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    void setData(int r, String n) {
        rollNo = r;
        name = n;
    }
}

class MyClass2 extends MyClass1 {
    int marks;

    void setMarks(int m) {
        marks = m;
    }

    void displayMarks() {
        System.out.println("Marks: " + marks);
    }
}

class MyClass3 extends MyClass2 {
    int practicalMarks;

    void setPracticalMarks(int pm) {
        practicalMarks = pm;
    }
    void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }
}

public class Problem1 {
    public static void main(String[] args) {
        MyClass3 obj = new MyClass3();
        obj.setData(102, "Sagar");
        obj.setMarks(85);
        obj.setPracticalMarks(90);
        obj.display();
        obj.displayMarks();
        obj.displayPracticalMarks();
    }
}

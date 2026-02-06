package Inheritance;

class MyClass1 {
    int rollNo;
    String name;

    MyClass1 (int r, String s) {
        rollNo = r;
        name = s;

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class MyClass2 extends MyClass1{
    int marks;

    MyClass2 (int m) {
        super(102, "Sagar");
        marks = m;
    }

    void displayMarks() {
        System.out.println("Marks: " + marks);
    }
}

// class MyClass3 {
//     int practicalMarks;

//     MyClass3 (int pm) {
//         practicalMarks = pm;
//     }

//     void displayPracticalMarks() {
//         System.out.println("Practical Marks: " + practicalMarks);
//     }
// }


public class Problem1_1 {
    public static void main(String[] args) {
        // MyClass1 ob1 = new MyClass1(102, "Sagar");
        MyClass2 ob2 = new MyClass2(400);
        ob2.displayMarks();
        // MyClass3 ob3 = new MyClass3(303);
    }
}

class Student implements Cloneable {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void show() {
        System.out.println("RollNo: " + rollNo + " Name: " + name);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneObject {
    public static void main(String[] args) {
        try {
            Student std1 = new Student(101, "Sagar");
            Student std2 = (Student)std1.clone();

            std1.show();
            std2.show();
        } catch (CloneNotSupportedException e) {}
    }  
}

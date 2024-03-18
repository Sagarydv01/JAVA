interface A {
    void display();
    int a = 10;
}
interface B {
    void display();
    int b = 10;
}
class Test implements A, B {
    public void display() {
        System.out.println("Sagar yadav!");
    }

    void add() {
        int sum = A.a + B.b;
        System.out.println("Sum: " + sum);
    }
}
public class InterfaceDemo2 {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();
        test.add();
    }
}

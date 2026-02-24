interface InnerMethodOverloadingOverriding1 {
    void display(int n);
}

interface InnerMethodOverloadingOverriding2 extends InnerMethodOverloadingOverriding1{
    void display (int n);
    void display (int a, int b);
}
class MyClass1 {
    void sum (int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

class MyClass2 extends MyClass1 implements InnerMethodOverloadingOverriding2 {
    void sum (int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    void sum(int a, int b) {
        System.out.println("sum()");
    }

    public void display(int n) {
        System.out.println(n);
    }

    public void display(int a, int b) {
        System.out.println("hi");
    }
}


public class MethodOverloadingOverriding /* extends MyClass2 */ {
    public static void main(String[] args) {
        MyClass2 obj2 = new MyClass2();
        MyClass1 obj1 = new MyClass1();

        obj1.sum(13, 32);
        obj2.sum(12, 32, 42);
        obj2.sum(10, 20);
        obj2.display(321);
        obj2.display(32, 324);
    }
}

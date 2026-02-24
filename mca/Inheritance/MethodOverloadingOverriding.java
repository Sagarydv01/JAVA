class MyClass1 {
    void sum (int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

class MyClass2 extends MyClass1 {
    void sum (int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    void sum(int a, int b) {
        System.out.println("sum()");
    }
}

public class MethodOverloadingOverriding /* extends MyClass2 */ {
    public static void main(String[] args) {
        MyClass2 obj2 = new MyClass2();
        MyClass1 obj1 = new MyClass1();

        obj1.sum(13, 32);
        obj2.sum(12, 32, 42);
        obj2.sum(10, 20);
    }
}

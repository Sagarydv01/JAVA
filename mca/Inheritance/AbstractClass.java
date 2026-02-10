abstract class A {
    void test() {
        System.out.println("A");
    }

    abstract void sum();
    abstract void div();
}

class B extends A {
    void sum() {
        System.out.println("B1");
    }
    void div() {
        System.out.println("B2");
    }
}

class C extends A {
    void sum() {
        System.out.println("C1");
    }
    void div() {
        System.out.println("C2");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // A objA = new A(); error: A is abstract; cannot be instantiated
        B objB = new B();
        C objC = new C();

        // objA.test();
        objB.test();
        objB.sum();
        objB.div();
        objC.sum();
        objC.div();
    }
}

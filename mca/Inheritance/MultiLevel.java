package Inheritance;

class A {
    void showA() {
        System.out.println("Class A");
    }
}

class B extends A{
    void showB() {
        System.out.println("Class B");
    }
}

class C extends B{
    void showC() {
        System.out.println("Class C");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        C objC = new C();

        objC.showA();
        objC.showB();
        objC.showC();
    }
}

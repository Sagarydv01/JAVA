// package Inheritance;
// Feb 6, 2026

class A {
    int num;

    void greetA() {
        System.out.println("Hello");
    }
}

class B extends A {
    void greetB() {
        System.out.println("Welcome");
    }
}

class C extends A{
    void greetC() {
        System.out.println("Hi");
    }
}

class D extends C {
    void greetD() {
        System.out.println("Namaste!");
    }
}

class E extends D {
    void greetE() {
        System.out.println("Good Morning!");
    }
}

public class HybridDemo {
    public static void main(String[] args) {
        B obB = new B();
        E obE = new E();

        obB.greetA();
        obB.greetB();
        obE.greetC();
        obE.greetD();
        obE.greetE();
    }
}

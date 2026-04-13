// package Inheritance;

class A {
    protected int dataA;

    void showA() {
        System.out.println("Class A");
    }
}

class B extends A{
    protected int dataB;

    void showB() {
        System.out.println("Class B");
    }

    void setter(int a, int b) {
        dataA = a;
        dataB = b;
    }
}

class C extends B{
    private int dataC;

    void setter(int a, int b, int c) {
        dataA = a;
        dataB = b;
        dataC = c;
    }

    void showC() {
        System.out.println("Class C");
    }

    void display() {
        System.out.println("Data A: " + dataA);
        System.out.println("Data B: " + dataB);
        System.out.println("Data C: " + dataC);
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        C objC = new C();
        
        objC.setter(10, 20, 30);
        objC.display();
    }
}

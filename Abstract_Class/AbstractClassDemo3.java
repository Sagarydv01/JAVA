/*  Whats in this file
    Same as AbstractClassDemo2.java file, but only with
    a change in class B declaraction or defination
    used abstract keyword with Class B
*/ 
abstract class A {
    abstract void print();
    void displayA() {
        System.out.println("Class A!");
    }
}
abstract class B extends A {
    void displayB () {
        System.out.println("Class B!");
    }
}
class C extends B {
    void print() {
        System.out.println("Abstract method!");
    }
    void displayC () {
        System.out.println("Class C!");
    }
}
class AbstractClassDemo3 {
    public static void main(String[] args) {
        C obj = new C();
        obj.print();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
}


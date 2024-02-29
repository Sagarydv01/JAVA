// package Abstract_Class;

abstract class A {
    abstract void print();
    void displayA() {
        System.out.println("Class A!");
    }
}
class B extends A {
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
class AbstractClassDemo2 {
    public static void main(String[] args) {
        C obj = new C();
        obj.print();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
}

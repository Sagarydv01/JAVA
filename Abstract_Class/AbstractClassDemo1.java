// package Abstract_Class;
abstract class A {
    abstract void A1();

    void A2() {
        System.out.println("A");
    }
}
class B extends A {
    void A1() {
        System.out.println("From Class A - An abstract method!");
    }
    void B1(){
        System.out.println("B");
    }
}
class AbstractClassDemo1 {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.A1();  // Abstract method of Class A
        obj1.A2();
        obj1.B1();
    }
}

/*  what's in this program
 * Created 3 classes for abstract demo
 * In which i don't created Class B as abstract or 
 * can say does not define abstract method in Class B
 * because of which B also becomes an Abstrct class
 * But i don't used abstract keyword with Class B
 */ 
abstract class A {
    abstract void print();
    void displayA() {
        System.out.println("Class A!");
    }
}
class B extends A {
    void print() {
        System.out.println("Abstract method in B!");
    }
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

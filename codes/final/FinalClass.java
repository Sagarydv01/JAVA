// Final class cannot be inherited!

final class A {
    void print() {
        System.out.println("Hello, Sagar!");
    }
}
class B extends A {
    void display() {
        System.out.println("Radhe Radhe!");
    }
}
class FinalClass {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.print();
    }
}

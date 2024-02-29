// package Questions.Covariant_Return_Type;
// Simple Overriding
class A {
    int m() {
        int a = 10;
        System.out.println("A");
        return a;
    }
}
class B extends A {
    int m() {
        int b = 20;
        System.out.println("B");
        return b;
    }
}
public class CovariantReturnTypeDemo0 {
    public static void main(String[] args) {
        B objB = new B();
        objB.m();
    }
}

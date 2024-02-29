// package Questions.Covariant_Return_Type;
// Problem in normal
class A {
    int m() {
        int a = 10;
        System.out.println("A");
        return a;
    }
}
class B extends A {
    void m() {
        System.out.println("B");
    }
}
class CovariantReturnTypeDemo1 {
    B obj = new B();
    obj.m();
}

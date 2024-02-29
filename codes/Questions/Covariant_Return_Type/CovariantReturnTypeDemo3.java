// package Questions.Covariant_Return_Type;
// Using Constructor or class return type and new keyword
class A {
    A m() {
        System.out.println("A");
        return new A();
    }
}
class B extends A {
    B m() {
        System.out.println("B");
        return this;
    }
}
class CovariantReturnTypeDemo3 {
    public static void main(String[] args) {
        B obj = new B();
        obj.m();
    }
}
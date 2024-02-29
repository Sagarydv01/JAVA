// final method cannot be overriden.
class A {
    final void method() {
        System.out.println("Final Method!");
    }
}
class B extends A {
    void method() {
        System.out.println("Overriding Final Method!");
    }
}
class FinalMethod {
    public static void main(String[] args) {
        B obj = new B();
        obj.method();
    }
}
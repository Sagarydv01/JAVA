// with final keyword
class A {
    final A m() {
        System.out.println("A");
        return this;
    }
}
class B extends A {
    B m() {
        System.out.println("B");
        return this;
    }
}
class CovariantReturnTypeWithFinalDemo1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.m();
    }
}
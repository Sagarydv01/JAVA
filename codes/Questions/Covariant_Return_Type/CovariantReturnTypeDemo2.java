// Using constructor or class return type  with this keyword
class A {
    A m() {
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
class CovariantReturnTypeDemo2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.m();
    }
}
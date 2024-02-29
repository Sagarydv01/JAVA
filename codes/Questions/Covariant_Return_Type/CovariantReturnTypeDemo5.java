// Non-primitive and Primitive return type
class A {
    A m() {
        A objA = new A();
        System.out.println("A");
        return objA;
    }
}
class B extends A {
    int m() {
        int a = 22;
        System.out.println("B");
        return a;
    }
}

class CovariantReturnTypeDemo5 {
    public static void main(String[] args) {
        B obj = new B();
        obj.m();
    }
}

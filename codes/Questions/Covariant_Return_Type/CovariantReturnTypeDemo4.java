// package Questions.Covariant_Return_Type;
// using constructor or class return type
class A {
    A m() {
        A objA = new A();
        System.out.println("A");
        return objA;        
    }
}
class B {
    B m () {
        B objB = new B();
        System.out.println("B");
        return objB;
    }
}
class CovarintReturnTypeDemo4 {
    public static void main(String[] args) {
        B bobj = new B();
        bobj.m();

        A obj = new A();
        obj.m();
    } 
}

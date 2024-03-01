// Abstract Class with Covariant return type
abstract class A {
	abstact void print();
	void displayA() {
		System.out.println("Class A");
	}
}

class B extends A {
	B print() {
		System.out.println("Abstract Class A method");
		return this();
	}
}

class C extends C {
	C print() {
		System.out.println("Class C");
		return this;
	}
}

class AbstractClassWithCovariantReturnType {
	public static void main(String[] args) {
		C obj = new C();
		obj.print();
		obj.displayA();
	}
}
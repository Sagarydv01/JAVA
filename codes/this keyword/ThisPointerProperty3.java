/*			this pointer Property - 3
It is also used to call the parameterized constructor of its own class.
*/
// ---------------------------------------------------------------------------------------------------------
/*	// Problem - 1
class ThisPointerProperty3 {
	ThisPointerProperty3 () {
		this(10);
	}

	ThisPointerProperty3 (int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		ThisPointerProperty3 obj = new ThisPointerProperty3(); // 10
	}
}
*/

// -------------------------------------------------------------------------------------------------------
/*	// Problem - 2
class ThisPointerProperty3 {
	ThisPointerProperty3 () {
		// this(10);
		this(20, 30); // error: call to this must be first statement in constructor "this(20, 30);"
	}

	ThisPointerProperty3 (int a) {
		System.out.println(a);
	}

	ThisPointerProperty3 (int a, int b) {
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		ThisPointerProperty3 obj = new ThisPointerProperty3(); // 20 30
	}
}
*/

// ---------------------------------------------------------------------------------------------------------
/* // Problem - 3
class ThisPointerProperty3 {
	ThisPointerProperty3 () {
		// this(20, 30);
		this(10);		// error: call to this must be first statement in constructor "this(10);""
	}

	ThisPointerProperty3 (int a) {
		System.out.println(a);
	}

	ThisPointerProperty3 (int a, int b) {
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		ThisPointerProperty3 obj = new ThisPointerProperty3();
	}
}
*/

// ---------------------------------------------------------------------------------------------------------
/*
// Problem - 4
class ThisPointerProperty3 {
	ThisPointerProperty3 () {
		this(10);
	}

	ThisPointerProperty3 (int a) {
		this(20, 30);
		System.out.println(a);
	}

	ThisPointerProperty3 (int a, int b) {
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		ThisPointerProperty3 obj = new ThisPointerProperty3(); 
	}
} */
/* 	OUTPUT
 20 30
 10
*/

// ---------------------------------------------------------------------------------------------------------
// Problem - 5
/*class ThisPointerProperty3 {
	ThisPointerProperty3 () {
		this(10);
		System.out.println("Default COnstructor");
	}

	ThisPointerProperty3 (int a) {
		this(20, 30);
		System.out.println(a);
	}

	ThisPointerProperty3 (int a, int b) {
//		this(); //  error: recursive constructor invocation -> this();
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		ThisPointerProperty3 obj = new ThisPointerProperty3();
	}
}*/
/*	OUTPUT:
20 30
10
Default COnstructor
*/

// ---------------------------------------------------------------------------------------------------------
// Problem 5
/*
class ThisPointerProperty3 {
	ThisPointerProperty3 () {
		this(10);
		System.out.println("Default COnstructor");
	}

	ThisPointerProperty3 (int a) {
//		this();		// error: recursive constructor invocation
		System.out.println(a);
	}

	ThisPointerProperty3 (int a, int b) {
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		ThisPointerProperty3 obj = new ThisPointerProperty3();
	}
} */
/* OUTPUT:
10
Default C0nstructor
*/

// --------------------------------------------------------------------------------------------------
/*// Problem - 6
class ThisPointerProperty3 {
	ThisPointerProperty3 () {
		System.out.println("Default Constructor");
	}

	ThisPointerProperty3 (int a) {
		System.out.println("Constructor with 1 parameter!");
	}

	ThisPointerProperty3 (int a, int b) {
		this();
		this(20);
	}

	public static void main(String[] args) {
		ThisPointerProperty3 obj = new ThisPointerProperty3(33, 44);
	}
}*/

// ------------------------------------------------------------------------------------------------
// Problem - 7
/*
class ThisPointerProperty3 {
	ThisPointerProperty3 () {
		this(10);
	}

	ThisPointerProperty3 (int a) {
		System.out.println(a);
	}

	ThisPointerProperty3 (int a, int b) {
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		ThisPointerProperty3 obj1 = new ThisPointerProperty3(); // 10
		ThisPointerProperty3 obj2 = new ThisPointerProperty3(); // 10
	}
}*/

// ------------------------------------------------------------------------------------------------
// Problem - 8

class ThisPointerProperty3 {
	ThisPointerProperty3 () {
		this(10);
	}

	ThisPointerProperty3 (int a) {
		this(20, 30);
		System.out.println(a);
	}

	ThisPointerProperty3 (int a, int b) {
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		ThisPointerProperty3 obj1 = new ThisPointerProperty3();
		ThisPointerProperty3 obj2 = new ThisPointerProperty3();
	}
}
/* OUTPUT:
20 30
10
20 30
10
*/
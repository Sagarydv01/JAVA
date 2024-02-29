
class Main {
	public static void main(String[] args) {

		/* Way of Creating a Strings
			- String literal
			- Using new keyword
		*/
		// String Literal - To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).
		String str1 = "My name is Sagar Yadav.";
		String str2 = "I am a BCA Student.";

		// Using new keyword - In such a case, JVM will create a new string object in normal (non-pool) heap memory and the literal “Welcome” will be placed in the string constant pool. The variable s will refer to the object in the heap (non-pool).
		String str3 = new String ("I am residing in Greater Noida.");
		String str4 = new String ("But my hometown is Bharthana.");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		String name1 = "Sagar";
		System.out.println(name1);

		String name2 = "Sagar";
		// System.out.println(name2);

		System.out.println(name1 + " Yadav");
		name1.concat(" Shiva");

		System.out.println(name2);
		System.out.println(name1);
	}
}
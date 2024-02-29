
class StringGame {
	public static void main(String[] args) {
		String a = "A";
		System.out.println(a);

		String b = "A";
		System.out.println(b);

		a.concat("C");

		a = "Sagar";
		System.out.println(a);
		System.out.println(b);

		a = a.concat(" yadav");
		System.out.println(b);

		// -------------------------------------------
		System.out.println("--------------------------------");

		String str1 = new String("Sagar");
		String str2 = new String("Sagar");

		System.out.println(str1.concat(" yadav"));
		System.out.println(str1);
		System.out.println(str2);

		str1.concat(" Shiva");
		System.out.println(str1);
		System.out.println(str2);


	}
}
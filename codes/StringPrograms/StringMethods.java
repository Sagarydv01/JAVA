
class StringMethods {
	public static void main(String[] args) {
		String str = "I am Sagar Yadav.";

		// String length()
		System.out.println("Length of string: " + str.length());

		// String charAt(int index)
		System.out.println("Character at index 8: " + str.charAt(8));

		// String substring(int beginIndex)
		System.out.println("Substring from index 8: " + str.substring(8));

		// String substring(int beginIndex, int endIndex)
		System.out.println("Substring from index 5 to 12: " + str.substring(5,12));

		// String concat(String str)
		System.out.println("Concatenated String: " + str.concat("I'm pursuing BCA."));

		// String toUpperCase()
		System.out.println("Uppercase String: " + str.toUpperCase());

		// String toLowerCase()
		System.out.println("Lowecase String: " + str.toLowerCase());

		// String trim()
		String trimmedString = str.trim();
		System.out.println("Trimmed String: " + trimmedString);

		// String replace(char oldChar, char newChar)
		System.out.println("String with replaced characters: " + str.replace('m', 's'));

		// String replaceAll()
		// String allReplaced = str.replaceAll('a', 'z');
		// System.out.println("All 'String' replaced: " + allReplaced);

		// String indexOf(int ch)
		System.out.println("Index of 'S' in the string: " + str.indexOf('S'));

		// String contains(CharSequence s)
		System.out.println("Does the string contain 'Sagar'? " + str.contains("Sagar"));

		// String startsWith(String prefix)
		System.out.println("Does the string start with 'Sagar'? " + str.startsWith("Sagar"));

		// String endsWith(String suffix)
		System.out.println("Does the string ends with 'Yadav'? " + str.endsWith("Yadav"));

		// String isEmpty()
		System.out.println("Is the string empty? " + str.isEmpty());

		// String compareTo(String anotherString)
		String name = "Shiva Yadav";
		System.out.println("Compare to 'Shiva Yadav': " + str.compareTo(name));

		// String equals()
		System.out.println("Are the strings equal? " + str.equals(name));

		// String equalsIgnoreCase()
		boolean equalsIgnoreCase = str.equalsIgnoreCase("i Am sAgAR yAdAv.");
		System.out.println("Equal ignoring case? " + equalsIgnoreCase);

		// Checking for specific characters
		boolean containsDigit = str.matches(".*\\d.*");
		System.out.println("Contains a digit? " + containsDigit);

		// String split(String delimeter)
		String splitString[] = str.split(" ");
		System.out.println("Splitting the string by space: ");
		for (String s : splitString) {
			System.out.println(s);
		}

		// Checking to and from byte array
		byte bytes[] = str.getBytes();
		String fromBytes = new String(bytes);
		System.out.println("String from byte array: " + fromBytes);

		// Converting to primitive values
		char charArray[] = str.toCharArray();
		System.out.println("String to char array:");
		for (char c: charArray) {
			System.out.print(c + " ");
		}
	}
}
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        System.out.println("Radhey Radhey, Sagar!");

        // Datatypes
        boolean flag = true;    // default value: false
        byte range = 123;   // ranges b/w: -128 to 127 | default value: 0
        short temp = 24;    // ranges b/w: -32768 to 32767 | default value: 0
        int num = -1234567;      // ranges b/w: -2^31 to 2^31-1
        long num2 = 12345678902L;
        double num3 = 232.232323;
        float decimal = 20.223f;
        char letter = 'A';
        String name = "Sagar Yadav";

        // Output
        System.out.println(flag);
        System.out.println(range);
        System.out.println(temp);
        System.out.println(num);
        System.out.println(num2);
        System.out.print(num3);
        System.out.print("\n");
        System.out.print(decimal);
        System.out.print("\n");
        System.out.print(letter);
        System.out.print("\n");
        System.out.printf(name);

        // String : Concatenate
        String first = "Sagar";
        String last = "Yadav";
        String fullName = first + ' ' + last;
        System.out.println(fullName);

        // charAt()
        String name2 = "Shiva";
        System.out.println(name.charAt(3));

        // length() - get length
        System.out.println(fullName.length());

        // equals() - compare two strings
        System.out.println("Strings name and name2 are equal: " + name.equals(name2));
        System.out.println("Strings name and fullName are equal: " + name.equals(fullName));

        // concat() - concatenate
        System.out.println(first.concat(last));

        // substring(int beginIndex, int endIndex[optional]) - returns a specified part of a string
        System.out.println(fullName.substring(3));
        System.out.println(fullName.substring(3, 8));

        // contains(String substring) - to check if a string contains a specified substring
        System.out.println(fullName.contains(first));
        System.out.println(fullName.contains(name2));

        // join() - to join a group of strings using the joiner between them
        String hello = String.join(" ", "Hello", "World");
        System.out.println(hello);

        // Arrays
        int[] marks = new int[3];
        marks[0] = 33;
        marks[1] = 99;
        marks[2] = 87;

        System.out.println(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks.length);

        // taking input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str1 = scan.nextLine();
        System.out.println(str1);

        System.out.print("Enter a string: ");
        String str2 = scan.next();
        System.out.println(str2);

        System.out.print("Enter age: ");
        int age = scan.nextInt();
        System.out.println(age);



    }
}
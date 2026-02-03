import java.util.Scanner;
public class ConvertIntoMathematicalReadable
 {
    static String[] ones = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    static String convertInt(int num) {
        if (num == 0) return "Zero";

        if (num < 20)
            return ones[num];

        if (num < 100)
            return tens[num / 10] + (num % 10 != 0 ? " " + ones[num % 10] : "");

        if (num < 1000)
            return ones[num / 100] + " Hundred" +
                    (num % 100 != 0 ? " " + convertInt(num % 100) : "");

        if (num < 1_000_000)
            return convertInt(num / 1000) + " Thousand" +
                    (num % 1000 != 0 ? " " + convertInt(num % 1000) : "");

        if (num < 1_000_000_000)
            return convertInt(num / 1_000_000) + " Million" +
                    (num % 1_000_000 != 0 ? " " + convertInt(num % 1_000_000) : "");

        return "Out of range";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        String input = in.next();

        String[] parts = input.split("\\.");

        int integerPart = Integer.parseInt(parts[0]);
        System.out.print(convertInt(integerPart));

        if (parts.length == 2) {
            System.out.print(" point ");
            for (char c : parts[1].toCharArray()) {
                System.out.print(ones[c - '0'] + " ");
            }
        }

        in.close();
    }
}

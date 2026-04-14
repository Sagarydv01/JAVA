// 9. Write a program to convert Binary to Decimal number system.

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();
        int decimal = 0;
        int power = 0;
        // Process binary string from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            } else if (bit != '0') {
                System.out.println("Invalid binary number.");
                sc.close();
                return;
            }
            power++;
        }
        System.out.println("Decimal equivalent: " + decimal);
        sc.close();
    }
}
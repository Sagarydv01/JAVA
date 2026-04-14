// 16. Write a program to Find the Frequency of each Character in a String.

import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256]; // ASCII size

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Print result
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }

        sc.close();
    }
}
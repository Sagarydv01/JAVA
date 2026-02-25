// 5. Write a program to check the given number is Palindrome or not. 

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int num, digit, rev = 0;

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        System.out.print("Reverse of ");
        while (num > 0) {
            digit = num%10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println(rev);
        sc.close();
    }
}

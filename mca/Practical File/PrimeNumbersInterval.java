// 12. Write a program to Display Prime Numbers Between Two Intervals 

import java.util.Scanner;

public class PrimeNumbersInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input interval
        System.out.print("Enter lower bound: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper bound: ");
        int upper = sc.nextInt();
        System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
        for (int num = lower; num <= upper; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
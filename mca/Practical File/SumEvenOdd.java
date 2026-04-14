// 14. Write a program to Find Sum of Even and Odd Numbers. 

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sumEven = 0, sumOdd = 0;
        // Calculate sums
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
        sc.close();
    }
}
// 17. Write a program to Count Positive and Negative Numbers in an Array.
import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int positiveCount = 0, negativeCount = 0;
        // Count positive and negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        sc.close();
    }
}
// 11. Write a program to Check if An Array Contains a Given Value

import java.util.Scanner;

public class ArrayContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Input value to search
        System.out.print("Enter value to search: ");
        int value = sc.nextInt();
        // Check if value exists in array
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == value) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(value + " exists in the array.");
        } else {
            System.out.println(value + " does not exist in the array.");
        }
        sc.close();
    }
}
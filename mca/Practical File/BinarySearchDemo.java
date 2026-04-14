// 18. Write a program to Binary Search using class.

import java.util.Scanner;

// BinarySearch class
class BinarySearch {
    int[] arr;

    BinarySearch(int[] arr) {
        this.arr = arr;
    }

    // Method to perform binary search
    int search(int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid; // key found
            } 
            else if (arr[mid] < key) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return -1; // key not found
    }
}

public class BinarySearchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements (must be sorted)
        System.out.println("Enter " + n + " elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create object
        BinarySearch bs = new BinarySearch(arr);

        // Input key
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int index = bs.search(key);

        if (index != -1) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found in the array.");
        }

        sc.close();
    }
}
// 6. Write a program to remove duplicate element in an array. 

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int newSize = removeDuplicates(arr, n);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }


    public static int removeDuplicates(int[] arr, int n) {
        int newIndex = 0; 
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newIndex; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }
        return newIndex;
    }
}
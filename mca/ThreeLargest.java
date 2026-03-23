// Problem: print largest, second largest, third largest elements in an array.
import java.util.Scanner;

public class ThreeLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Array must contain at least 3 elements");
            sc.close();
            return;
        }

        int first = -1;
        int second = -1;
        int third = -1;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x > first) {
                third = second;
                second = first;
                first = x;
            } else if (x > second && x != first) {
                third = second;
                second = x;
            } else if (x > third && x != second && x != first) {
                third = x;
            }
        }

        System.out.println("Largest: " + first);
        System.out.println("Second Largest: " + second);
        System.out.println("Third Largest: " + third);

        sc.close();
    }
}

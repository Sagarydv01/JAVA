import java.util.Scanner;

public class OddEvenSeparate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int evenCount = 0, oddCount = 0;

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

        int e = 0, o = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                even[e++] = arr[i];
            else
                odd[o++] = arr[i];
        }

        System.out.print("Even array: ");
        for (int x : even)
            System.out.print(x + " ");

        System.out.print("\nOdd array: ");
        for (int x : odd)
            System.out.print(x + " ");

        sc.close();
    }
}

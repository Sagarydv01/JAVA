public class MissingNum {
    static int findMissingNumber1(int[] arr) {
        int n = arr.length + 1; // Total numbers from 1 to n
        int sum = n * (n + 1) / 2; // Sum of first n natural numbers

        for (int num : arr) {
            sum -= num; // Subtract each number in the array from the total sum
        }
        
        return sum; // The remaining sum is the missing number
    }

    static int findMissingNumber2(int[] arr) {
        int n = arr.length + 1; // Total numbers from 1 to n
        int xor = 0;

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        // XOR all elements in the array
        for (int num : arr) {
            xor ^= num;
        }

        return xor; // The result is the missing number
    }

    static int findMissingNumber3(int[] arr) {
        int n = arr.length + 1; // Total numbers from 1 to n
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num; // Sum of elements in the array
        }

        return expectedSum - actualSum; // The difference is the missing number
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int sum = findMissingNumber1(arr);
        int sum2 = findMissingNumber2(arr);
        int sum3 = findMissingNumber3(arr);

        System.out.println("The missing number using method 1 is: " + sum);
        System.out.println("The missing number using method 2 is: " + sum2);
        System.out.println("The missing number using method 3 is: " + sum3);
    }
}

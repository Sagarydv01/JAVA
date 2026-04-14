// 20. Write a program using multiple catch blocks. 

import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);

            int[] arr = {1, 2, 3};

            System.out.print("Enter index to access array element: ");
            int index = sc.nextInt();

            System.out.println("Array element: " + arr[index]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }  
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } 
        catch (Exception e) {
            System.out.println("Error: Some other exception occurred.");
        } 
        finally {
            System.out.println("Execution of multiple catch blocks completed.");
            sc.close();
        }
    }
}
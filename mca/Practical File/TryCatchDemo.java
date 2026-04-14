// 19. Write a program to demonstrate try-catch block.

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        finally {
            System.out.println("Execution of try-catch block completed.");
            sc.close();
        }
    }
}
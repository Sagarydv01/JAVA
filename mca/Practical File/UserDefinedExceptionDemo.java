// 21. Write a program to create user-defined exception. 

import java.util.Scanner;

// User-defined exception class
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        try {
            if (num < 0) {
                throw new NegativeNumberException("Error: Negative numbers are not allowed.");
            }
            System.out.println("You entered: " + num);
        } 
        catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Program execution completed.");
            sc.close();
        }
    }
}
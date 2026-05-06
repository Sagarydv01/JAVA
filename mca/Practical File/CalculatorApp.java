// 27. Write program to develop a calculator application in Java.
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Simple Calculator =====");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Select operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter choice (1-4): ");
        int choice = sc.nextInt();

        double result = 0;
        boolean valid = true;

        result = switch (choice) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                    yield 0;
                }
                yield num1 / num2;
            }
            default -> {
                System.out.println("Invalid choice.");
                valid = false;
                yield 0;
            }
        };

        if (valid) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
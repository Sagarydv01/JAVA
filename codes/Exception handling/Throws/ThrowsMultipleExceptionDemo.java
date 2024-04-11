import java.util.Scanner;

public class ThrowsMultipleExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int divd = scanner.nextInt();
        System.out.print("Enter Divisor: ");
        int divsr = scanner.nextInt();
        try {
            // Call a method that throws exceptions
            int res = divide(divd, divsr);
            System.out.println(res);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        scanner.close();
    }

    // Method that throws multiple exceptions
    public static int divide(int dividend, int divisor) throws ArithmeticException, IllegalArgumentException {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        } else if (divisor < 0) {
            throw new IllegalArgumentException("Divisor cannot be negative");
        }
        return dividend / divisor;
    }
}

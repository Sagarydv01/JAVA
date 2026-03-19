// package exceptionHandling;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        int num1 = 10, num2 = 0, res = 0;

        try {
            res = num1 / num2;
            System.out.println("Division: " + res);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        System.out.println("Hello!");
    }
}

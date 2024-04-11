public class Main {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        // This line will cause an ArithmeticException
        int result = 5 / 0;
        System.out.println("Result: " + result);
        result = 5 / 2;
        System.out.println("Result: " + result);
    }
}

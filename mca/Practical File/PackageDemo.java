// 26. Write programs to demonstrate the use of java packages. 

// Import custom package
import mylibrary.MathOperations;

public class PackageDemo {
    public static void main(String[] args) {
        // Create object of MathOperations from package
        MathOperations mo = new MathOperations();
        int sum = mo.add(10, 20);
        int product = mo.multiply(5, 6);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
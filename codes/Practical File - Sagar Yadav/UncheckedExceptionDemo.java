// 12. Write a program to demonstrate unchecked exception.

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            // Accessing an element outside the bounds of the array
            int num = numbers[10];
            System.out.println("Number: " + num);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the unchecked exception
            System.out.println("An ArrayIndexOutOfBoundsException occurred!");
            System.out.println("Exception message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

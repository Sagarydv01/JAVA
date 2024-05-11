// 12. Write a program to demonstrate unchecked exception.

class UncheckedExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            // Accessing an element outside the bounds of the array
            int num = numbers[10];
            System.out.println("Number: " + num);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An ArrayIndexOutOfBoundsException occurred!");
            System.out.println("Exception message: " + e.getMessage());
            e.printStackTrace();
        }
    }
} // Sagar Yadav, Enrolment No.: 02027902022, 4th Semester, BCA (2022-25)
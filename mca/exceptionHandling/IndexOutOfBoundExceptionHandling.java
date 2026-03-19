// package exceptionHandling;

public class IndexOutOfBoundExceptionHandling {
    public static void main(String[] args) {
        int arr[] = {20, 32, 22};

        try {
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        System.out.println("Success!");
    }
}

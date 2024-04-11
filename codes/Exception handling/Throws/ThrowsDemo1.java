import java.util.Scanner;

public class ThrowsDemo1{
    public static float ThrowsExample(int a, int b) throws ArithmeticException { //Declaring possible exception in method declaration
        return a/b;
    }

    public static void main(String arg[]){
        Scanner obj = new Scanner(System.in);
        int d1 = obj.nextInt(); //Example value - 10
        int d2 = obj.nextInt(); //Example value - 0
        try{
            float res = ThrowsExample(d1,d2); //calling our custom method
            System.out.println("Division of " + d1 + " and " + d2 + " is " + res);
        }
        catch(ArithmeticException e) {
            System.out.println("Division by zero is not possible!!");
        }
        obj.close();
    }
}

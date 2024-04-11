import java.util.*;

public class ThrowsDemo2{
    public static float ThrowsExample (int a, int b, int n) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        float arr[] = new float[n];
        arr[0] = a;
        arr[1] = b;
        arr[2] = a/b;
        
        return arr[2];
}

public static void main(String arg[]){
        Scanner obj = new Scanner(System.in);
        int d1 = obj.nextInt();
        int d2 = obj.nextInt();
        int len = obj.nextInt();
        try{
            float res = ThrowsExample(d1, d2, len);
            System.out.println("Division of " + d1 + " and " + d2 + " is " + res);
        }
        catch (Exception e){
            System.out.println("Exception occurred in our custom method - ThrowsExample!!! ");
        }
        obj.close();
    }
}

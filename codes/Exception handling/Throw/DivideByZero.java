// Example 2: Throwing "divide by 0" Arithmetic exception
import java.util.Scanner;

class DivideByZero {
    static int division(int number1, int number2){
       if (number2 == 0)
          throw new ArithmeticException("Divisor should not be 0");
       else
          System.out.println("Both numbers are correct!!");
       return number1/number2;
    }
    public static void main(String args[]){
      int divd, divsr;

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter Dividend: ");
      divd = scanner.nextInt();
      System.out.print("Enter Divisor: ");
      divsr = scanner.nextInt();
      scanner.close();

      int res=division(divd,divsr);
      System.out.println(res);
      System.out.println("Continue...");
    }
 }
 
 
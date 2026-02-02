import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int sel,num1,num2,res;
        Scanner scn= new Scanner(System.in);

        System.out.println("1. Addition\n2. Substraction\n3. Multipication\n4. Division\n5. Exit ");
        sel= scn.nextInt();
        System.out.println("Enter two numbers:");
        num1= scn.nextInt();
        num2= scn.nextInt();

        switch(sel)
        {
            case(1):
                res=num1+num2;
                System.out.println("Addition of "+num1+" and "+num2+" is "+res);
                break;
            case(2):
                res=num1-num2;
                System.out.println("Substraction of "+num1+" and "+num2+" is "+res);
                break;
            case(3):
                res= num1*num2;
                System.out.println("Multiplication of "+num1+" and "+num2+" is "+res);
                break;
            case(4):
                res= num1/num2;
                System.out.println("Division of "+num1+ " and "+num2+" is "+res);
                break;
            case(5):
                System.out.println("exit.");
                break;

        }
    }
}

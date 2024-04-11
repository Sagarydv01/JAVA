// Example 1: Throwing custom exception while trying to check valid driving age
import java.util.Scanner;

class UnableToDriveException extends Exception  
{  
    public UnableToDriveException (String str)  
    {  
        // calling the constructor of parent Exception
        super(str);  
    }
}

class CustomTestException
{ 
    public static void main(String args[])  
    {  
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = obj.nextInt();
        obj.close();
        try  
        {  
            if(age < 18){
                throw new UnableToDriveException("Age is not able for driving");
            }
            else {   
                System.out.println("Eligible, Apply for driving test");   
            }
        }  
        catch (UnableToDriveException e)  
        {  
            System.out.println("Exception is caught: " + e);  
        }  
    }  
}


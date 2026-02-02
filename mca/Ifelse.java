import java.util.Scanner;

public class Ifelse {
    //int num1;
    //int num2;

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        num1 = scn.nextInt();
        num2 = scn.nextInt();
        if (num1 + num2 < 10) System.out.println("num1+num2 is less than 10");
        else System.out.println("x+y is greater than 10");
        int sub1, sub2, sub3;

        sub1 = scn.nextInt();
        sub2 = scn.nextInt();
        sub3 = scn.nextInt();

        int avg = (sub1 + sub2 + sub3) / 3;
        /*if (avg > 90) System.out.println("Grade A");
        else if (avg > 80) System.out.println("Grade B");
        else if (avg > 70) System.out.println("Grade C");
        else if (avg > 60) System.out.println("Grade D");
        else if (avg > 50) System.out.println("Grade E");

        else System.out.println("Fail");*/
        System.out.println("Avg="+avg);

        switch(avg/10)
        {
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
            default:
                System.out.println("Fail");
        }
        scn.close();
    }
}

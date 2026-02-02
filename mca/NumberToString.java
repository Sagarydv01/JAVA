import java.util.Scanner;
// convrting user number into string eg: 1033 to one zero three three and 1098.98 to one zero point nine eight
public class NumberToString {
    public static void main(String[] args) {
        float dnum ;
        int num , res = 0 ,digit;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number:");
        //num = scn.nextInt();
        dnum = scn.nextFloat();
        if(dnum % 1 !=0)
            num=(int) (dnum*100);
        else
            num = (int) dnum;

        while(num > 0) {
            digit = num % 10;
            res = res * 10 + digit;
            num /= 10;
        }
        while(res>0){
            digit= res%10;

            switch(digit)
            {
                case(0):
                    System.out.println("Zero");
                    break;
                case(1):
                    System.out.println("One");
                    break;
                case(2):
                    System.out.println("Two");
                    break;
                case(3):
                    System.out.println("Three");
                    break;
                case(4):
                    System.out.println("Four");
                    break;
                case(5):
                    System.out.println("Five");
                    break;
                case(6):
                    System.out.println("Six");
                    break;
                case(7):
                    System.out.println("Seven");
                    break;
                case(8):
                    System.out.println("Eight");
                    break;
                case(9):
                    System.out.println("Nine");
                    break;

            }
            res = res/10;
        }
    }
}

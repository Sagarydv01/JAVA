import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        int num;
        int i=1;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number:");
        num = scn.nextInt();

        /*for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*" +i+"="+num*i);
        }*/
        /*do{
            System.out.println(num+"*" +i+"="+num*i);
            i++;
        } while(i <= 10);
        {
            System.out.println(num+"*" +i+"="+num*i);
            i++;
        }*/
        do{
            i=i+2;
            System.out.println("Odd numbers:");
            System.out.println(i);

        }while(i<10);
        scn.close();
    }
}

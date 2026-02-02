import java.util.Scanner;


public class ConversionIntoString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = in.next();

        System.out.println("Number in words:");

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);


            switch (ch) {
                case '0': System.out.print("Zero "); break;
                case '1': System.out.print("One "); break;
                case '2': System.out.print("Two "); break;
                case '3': System.out.print("Three "); break;
                case '4': System.out.print("Four "); break;
                case '5': System.out.print("Five "); break;
                case '6': System.out.print("Six "); break;
                case '7': System.out.print("Seven "); break;
                case '8': System.out.print("Eight "); break;
                case '9': System.out.print("Nine "); break;
                case '.': System.out.print("point "); break;
                default: System.out.print(""); break;
            }
        }
        in.close();
    }
}

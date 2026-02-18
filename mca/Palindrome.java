import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int flag = 1;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                flag = 0;
                break;
            }
        }

        if (flag == 1)
            System.out.println("Its a Palindrome!");
        else
            System.out.println("Its NOT a Palindrome!");
        sc.close();
    }
}

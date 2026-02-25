// 2. Write a program to Find sum of first n numbers.

import java.util.Scanner;

public class SumOfFirstN {
    public static void main(String[] args) {
        int num, i, sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter upto how many number, you want sum: ");
        num = sc.nextInt();

        for (i = 1; i <= num; i++)
            sum += i;

        System.out.println("Sum upto " + num + " = " + sum);

        sc.close();
    }
}

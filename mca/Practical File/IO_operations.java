// 1. Write programs to implement basic input / output operations.

import java.util.Scanner;

public class IO_operations {
    public static void main(String[] args) {
        int num;
        float percent;
        String name;
        double marks;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        num = sc.nextInt();

        System.out.print("Enter percentage: ");
        percent = sc.nextFloat();

        System.out.print("Enter String: ");
        name = sc.next();

        System.out.print("Enter total marks: ");
        marks = sc.nextDouble();

        System.out.println("Num = " + num);
        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
        System.out.println("Percentage = " + percent);
        
        sc.close();
    }
}

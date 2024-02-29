// 2. Write a program to demonstrate use of method overloading to calculate area of square, rectangle and triangle.

import java.util.Scanner;
class AreaCalculator {
    // Square
    static double calculateArea(double side) {
        return side * side;
    }

    // Rectangle
    static double calculateArea(double length, double breadth) {
        return  length * breadth;
    }

    // Triangle
    static float calculateArea(float base, float height) {
        return 0.5f * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area;

        System.out.println("\t\t=========== Square ============");
        System.out.print("Enter the side of square: ");
        double side = sc.nextDouble();
        area = calculateArea(side);
        System.out.println("Area of Square whose side is " +  side + " is " + area);
        
        System.out.println("\n\t\t=========== Rectangle ============");
        System.out.print("Enter the length and breadth of rectangle: ");
        double len = sc.nextDouble(), bre = sc.nextDouble();
        area = calculateArea(len, bre);
        System.out.println("Area of Rectangle with length " + len + " and breadth " + bre + " is " + area);

        System.out.println("\n\t\t============= Triangle =============");
        System.out.print("Enter the base and height of triangle: ");
        float bas = sc.nextFloat(), hei = sc.nextFloat();
        area = calculateArea(bas, hei);
        System.out.println("Area of Triangle with base " + bas + " and height " + hei + " is " + area + "\n");
        
        sc.close();
    }
} // Sagar Yadav, Enrolment No.: 02027902022, 4th Semseter, BCA (2022-25)
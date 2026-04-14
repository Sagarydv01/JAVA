// 15. Write a program to find the Area of a Triangle, circle, box and rectangle using class.

import java.util.Scanner;

// Triangle class
class Triangle {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

// Circle class
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

// Box class (Surface Area instead of Volume)
class Box {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double area() { // Surface area of box
        return 2 * (length * width + width * height + height * length);
    }
}

public class ShapeAreaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Triangle
        System.out.print("Enter base and height of triangle: ");
        double tBase = sc.nextDouble();
        double tHeight = sc.nextDouble();
        Triangle triangle = new Triangle(tBase, tHeight);
        System.out.println("Area of Triangle: " + triangle.area());

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of Circle: " + circle.area());

        // Rectangle
        System.out.print("Enter length and width of rectangle: ");
        double rLength = sc.nextDouble();
        double rWidth = sc.nextDouble();
        Rectangle rectangle = new Rectangle(rLength, rWidth);
        System.out.println("Area of Rectangle: " + rectangle.area());

        // Box
        System.out.print("Enter length, width and height of box: ");
        double bLength = sc.nextDouble();
        double bWidth = sc.nextDouble();
        double bHeight = sc.nextDouble();
        Box box = new Box(bLength, bWidth, bHeight);
        System.out.println("Surface Area of Box: " + box.area());

        sc.close();
    }
}
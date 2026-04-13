import java.util.Scanner;

class Circle {
    double area(double radius) {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Circle {
    double area(double length, double breadth) {
        return length * breadth;
    }
}

public class AreaCalculation {
    public static void main(String[] args) {
        // Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.print("Enter length and breadth of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        sc.close();

        double circleArea = rectangle.area(radius);
        double rectangleArea = rectangle.area(length, breadth);

        System.out.printf("Area of Circle: %.2f%n", circleArea);
        System.out.printf("Area of Rectangle: %.2f%n", rectangleArea);
    }
}

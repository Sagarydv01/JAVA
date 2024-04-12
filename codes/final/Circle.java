public class Circle {
    // Constants for PI and default radius
    public static final double PI = 3.14159;
    public static final double DEFAULT_RADIUS = 1.0;
    
    // Instance variables
    private final double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        // Create a new Circle object with the default
        // radius
        Circle circle = new Circle(DEFAULT_RADIUS);
        System.out.println("The area of the circle is " + circle.calculateArea());
        
        // Create another Circle object with a specified
        // radius, then print its area as well
        double givenRadius = 2.5;
        Circle otherCircle = new Circle(givenRadius);
        System.out.println("\nThe area of the circle with radius " + givenRadius + " is " + otherCircle.calculateArea());
    }
}

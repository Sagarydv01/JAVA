interface Circle {
    void area(int r );
    
}

interface Rectangle {
    void area (int l, int b);    
}

class Shape implements Circle, Rectangle {
    public void area(int l, int b) {
        System.out.println("Area of Rectangle: " + l * b);
    }

   
    public void area(int r) {
        System.out.println("Area of circle: " + r * r);
    }

}

public class AreaInterface {
    public static void main(String[] args) {
        Shape obj = new Shape();

        obj.area(20);
        obj.area(31, 32);
    }
}

// 13. Program to implement multiple inheritance

interface Vehicle {
    void start();
}

interface Engine {
    void fuelType();
}

// Class implements multiple interfaces
class Car implements Vehicle, Engine {
    public void start() {
        System.out.println("Car is starting...");
    }

    public void fuelType() {
        System.out.println("Car runs on petrol.");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        // Vehicle method
        myCar.fuelType();
    }
}
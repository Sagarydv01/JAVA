// WAP to create a class called Vehicle with a method called drive().
// Create a subclass called Car that overrides the drive() method to print "Repairing a car".

class Vehicle {
	void drive() {
		System.out.println("Driving a vehicle!");
	}
}

class Car extends Vehicle {
	void drive() {
		// super();	// error: call to super must be first statement in constructor	super();
		// this();	// error: call to this must be first statement in constructor	this();
		System.out.println("Repairing a car!");
	}
}

class Problem1 {
	public static void main(String [] args) {
		Car car = new Car();
		// Car carVehicle = new Vehicle(); // error: incompatible types: Vehicle cannot be converted to Car
		Vehicle vehicle = new Vehicle();
		Vehicle vehicleCar = new Car();


		car.drive();
		// vehicleCar.drive();
		vehicle.drive();
		vehicleCar.drive();
	}
}
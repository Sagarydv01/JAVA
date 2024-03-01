//

class Shape {
	void getArea(int len, int bre) {
		System.out.println("Get Area of Shape!");
	}
}
class Rectangle extends Shape {
	void getArea(int len, int bre) {
		System.out.println("Area of Rectangle: " + (len * bre));
	}
}
class Problem2 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.getArea(10,20);
	}
}
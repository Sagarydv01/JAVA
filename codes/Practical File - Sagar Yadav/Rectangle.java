// 1. Write a program declaring a class Rectangle with data member’s length and breadth and member functions Input, Output and CalcArea. 

import java.util.Scanner;

class Rectangle {
	double length, breadth;

	void inputValues() {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter length: ");
		length = input.nextDouble();

		System.out.print("Enter breadth: ");
		breadth = input.nextDouble();

		input.close();
	}

	void output() {
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
	}

	double calcArea() {
		return length * breadth;
	}

	public static void main(String[] args) {
		System.out.println("\t========= Rectangle Area Calculator =========");
		Rectangle rectangle = new Rectangle();

		rectangle.inputValues();

		System.out.println("\t\t-------- Rectangle Details --------");
		rectangle.output();

		System.out.println("Area of Rectangle: " + rectangle.calcArea());
	}
}

/*		Student Details
Sagar Yadav
Semester: Fourth
Enrolment No.: 02027902022
Session: 2022-25
Course: Bachelor of Computer Application
*/
package Questions;

import java.util.Scanner;

class CalcPercent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("\t---------- Percentage Calculator -------------");
		double marks = 0, obtainedMarks = 0, percentage = 0;
		for (short i = 1; i < 6; i++) {
			System.out.print("Enter Marks for Subject " + i + ": ");
			marks = input.nextDouble();
			obtainedMarks += marks;
		}
		percentage = (obtainedMarks/500) * 100;
		System.out.println("\nYour Percentage is: " + percentage);
	}
}
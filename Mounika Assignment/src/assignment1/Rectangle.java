package assignment1;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double length, width;

		Scanner scanner = new Scanner(System.in);

		length = new Rectangle().getDoubleWithinRange(
				"\nPlease enter the lenght of rectangle : ", 0, 1000);

		width = new Rectangle().getDoubleWithinRange(
				"\nPlease enter the width of rectangle : ", 0, 1000);

		System.out.println("\nthe perimeter of a rectangle is : "
				+ (2 * (length + width)));

		System.out.println("the lenth of the diagonal of a rectangle is : "
				+ (Math.sqrt((length * length) + (width * width))));

	}

	public double getDouble(String prompt) {

		Scanner sc = new Scanner(System.in);

		double d = 0.0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;

	}

	public double getDoubleWithinRange(String prompt, double min, double max) {

		double d = 0.0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(prompt);
			if (d < min)
				System.out.println("Error! Number must be greater than "
						+ (min - 1) + ".");
			else if (d > max)
				System.out.println("Error! Number must be less than "
						+ (max + 1) + ".");
			else
				isValid = true;
		}
		return d;
	}

}

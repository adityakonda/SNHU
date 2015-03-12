package assignment4;

import java.util.Scanner;

public class DollarCents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double input = new DollarCents().getDoubleWithinRange(
				"Enter a price : ", 0, 999999);

		System.out.println("The output is : " + (int) input);
		System.out.print((10 * input - 10 * ((int) input)) / 10);

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

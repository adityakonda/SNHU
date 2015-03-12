package assignment3;

import java.util.Scanner;

public class IntegerBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = new IntegerBreak().getIntWithinRange(
				"Please enter an interger value with in 5 digits : ", 0, 999990);

		char arr[] = Integer.toString(input).toCharArray();

		for (char c : arr) {

			System.out.print(c+" ");

		}

	}

	public int getInt(String prompt) {

		Scanner sc = new Scanner(System.in);
		int i = 0;
		boolean isValid = false;

		while (isValid == false) {

			System.out.print(prompt);

			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid Integer value. Try again.");
			}

			sc.nextLine();
		}

		return i;
	}

	public int getIntWithinRange(String prompt, int min, int max) {

		int i = 0;
		boolean isValid = false;

		while (isValid == false) {
			i = getInt(prompt);

			if (i < min)

				System.out.println("Error! Number must be greater than "
						+ (min - 1) + ".");
			else if (i > max)
				System.out.println("Error! Number must be less than "
						+ (max + 1) + ".");

			else
				isValid = true;
		}

		return i;
	}

}

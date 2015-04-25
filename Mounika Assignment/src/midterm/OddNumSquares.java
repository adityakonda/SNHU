package midterm;

import java.util.Scanner;

public class OddNumSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter a number to print squares : ");

		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {

			int input = scanner.nextInt();

			for (int i = 0; i <= input * 2; i++) {

				if (i % 2 != 0) {

					System.out.print(i * i + " ");
				}
			}

		} else {
			
			System.out.println("\nPlease enter only integer...!!!");

		}

	}

}

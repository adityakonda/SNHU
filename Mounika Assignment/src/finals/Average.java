package finals;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the number to calculate average : ");

		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();

		System.out.println(average(input));

	}

	public static double average(int n) {

		double total = 0;

		double result = 0;

		for (int i = 0; i <= n; i++) {

			total = total + i;

			result = total / n;
		}

		return result;
	}
}

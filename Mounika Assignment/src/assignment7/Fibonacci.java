package assignment7;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out
				.print("please enter an digit to print fibonacci series of numbers :");

		if (scanner.hasNextInt()) {

			int input = scanner.nextInt();

			System.out.println();

			int fib = 0;
			int fib1 = 1;
			int fibfinal;

			for (int i = 0; i <= input; i++) {

				fibfinal = fib + fib1;
				System.out.print(fibfinal + ",");
				fib = fib1;
				fib1 = fibfinal;
			}

		} else {

			System.out.println("You have entered an invalid data...!!!");

		}

	}
}
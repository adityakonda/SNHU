package midexam;

import java.util.Scanner;

public class SumOfNegativeNum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[0];

		int number;
		String nextLine;
		do {
			System.out.print("Enter the number : ");
			number = scanner.nextInt();
			nextLine = scanner.nextLine();

			if (number != 0) {
				numbers = add(numbers, number);
			}

		} while (number != 0);

		int negativeSum = 0;
		int oddSum = 0;
		int evenSum = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				negativeSum = negativeSum + numbers[i];
			} else if (numbers[i] % 2 == 0) {
				evenSum = evenSum + numbers[i];
			} else {
				oddSum = oddSum + numbers[i];
			}
		}
		System.out.println("Sum of negative numbers : " + negativeSum);
		System.out.println("Sum of positive even numbers: " + evenSum);
		System.out.println("Sum of positive odd numbers: " + oddSum);

	}

	private static int[] add(int[] numbers, int number) {

		int[] tempArray = new int[numbers.length + 1];

		for (int i = 0; i < numbers.length; i++) {
			tempArray[i] = numbers[i];
		}

		tempArray[tempArray.length - 1] = number;
		return tempArray;

	}

}

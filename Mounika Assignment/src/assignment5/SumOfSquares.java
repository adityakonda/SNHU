package assignment5;

public class SumOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		for (int i = 1; i <= 100; i++) {

			int square = i * i;

			sum = sum + square;
		}

		System.out.print("The sum of all squares between 1 and 100 is :" + sum);

	}

}

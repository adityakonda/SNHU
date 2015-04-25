package assignment8;

import java.util.Scanner;

public class StringRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the String to print : ");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		System.out.println("Please enter a number to print n times : ");
		
		int n = scanner.nextInt();
		
		System.out.print(repeat(input, n));

	}

	public static String repeat(String str, int n) {

		String result = "";

		for (int i = 0; i < n; i++) {

			result = result.concat(str);

		}

		return result;
	}

}

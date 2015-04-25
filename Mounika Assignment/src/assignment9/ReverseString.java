package assignment9;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the String to print reverse : ");

		Scanner scanner = new Scanner(System.in);

		String input = scanner.next();
		
		System.out.print(reverse(input));

	}

	public static String reverse(String str) {

		StringBuilder builder = new StringBuilder(str);

		return builder.reverse().toString();

	}
}

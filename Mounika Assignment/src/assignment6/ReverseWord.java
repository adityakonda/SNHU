package assignment6;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a Word: ");

		String reverseWord = input.next();

		StringBuilder builder = new StringBuilder(reverseWord);

		reverseWord = builder.reverse().toString();

		System.out.println("Reverse output :" + reverseWord);
	}

}

package assignment2;

import java.util.Scanner;

public class ReadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Please enter an integer between 1,000 and 999,999:");
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("output : "+scanner.next().replaceAll(",", ""));

	}

}

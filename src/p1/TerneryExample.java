package p1;

import java.util.Scanner;

public class TerneryExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Enter any integer:-");
		number = input.nextInt();
		// if(number==0)
		// System.out.println("given number is zero");

		// Using ternary operator
		String output = (number > 0) ? "positive number" : "negative number";
		System.out.println(output);
	}
}

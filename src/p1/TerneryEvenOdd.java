package p1;

import java.util.Scanner;

public class TerneryEvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Enter any integer:-");
		number = input.nextInt();

		// Using ternary operator
		String output = (number % 2 == 0) ? "even number" : "odd number";
		System.out.println(output);
	}

}

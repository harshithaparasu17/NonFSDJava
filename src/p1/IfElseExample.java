package p1;

import java.util.Scanner;

public class IfElseExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Enter any number");
		number = input.nextInt(); // read number from user

		if (number > 0)
			System.out.println("Given Number is Positive");
		else if (number < 0)
			System.out.println("Given Number is Negative");
		else
			System.out.println("Given number is zero");
	}
}

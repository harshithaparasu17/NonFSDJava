package p1;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number1, number2, number3;
		System.out.println("Enter 1st number");
		number1 = input.nextInt(); // read number1 from user
		System.out.println("Enter 2nd number");
		number2 = input.nextInt(); // read number1 from user
		System.out.println("Enter 3rd number");
		number3 = input.nextInt(); // read number1 from user

		if (number1 > number2 && number1 > number3)
			System.out.println("NUMBER " + number1 + "is the greatest");
		else if (number2 > number3)
			System.out.println("NUMBER " + number2 + "is the greatest");
		else
			System.out.println("NUMBER " + number3 + "is the greatest");

	}

}

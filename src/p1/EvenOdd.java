package p1;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Enter any number");
		number = input.nextInt(); // read number from user

		if (number % 2 == 0 && number != 0)
			System.out.println("Given Number is Even");
		else if (number % 2 != 0 && number != 0)
			System.out.println("Given Number is Odd");
		else
			System.out.println("Given number is zero");
	}

}

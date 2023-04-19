package p1;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num1; // first number to compare
		int num2; // second number to compare

		System.out.print("Input first integer: "); // prompt
		num1 = input.nextInt(); // read first number from user

		System.out.print("Input second integer: "); // prompt
		num2 = input.nextInt(); // read second number from user

		if (num1 != num2)
			System.out.println(num1 + " != " + num2);
		if (num1 > num2)
			System.out.println(num1 + " > " + num2);
		if (num1 < num2)
			System.out.println(num1 + " < " + num2);
		if (num1 <= num2)
			System.out.println(num1 + " <= " + num2);
		if (num1 >= num2)
			System.out.println(num1 + " >= " + num2);
		if (num1 == num2)
			System.out.println(num1 + " == " + num2);
	}

}

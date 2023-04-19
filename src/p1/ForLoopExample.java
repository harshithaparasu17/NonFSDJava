package p1;

import java.util.Scanner;

public class ForLoopExample {
	public static void main(String[] args) {

		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer:-");
		n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("\n" + i);
		}

	}

}

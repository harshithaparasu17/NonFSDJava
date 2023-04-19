package p1;

import java.util.Scanner;

public class MultiplesOfNumber {
	public static void main(String[] args) {

		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer:-");
		n = input.nextInt();
		System.out.println("--------");
		for (int i = 2; i <= n; i = i + 2) {
			System.out.println("\n" + i);
		}

	}

}

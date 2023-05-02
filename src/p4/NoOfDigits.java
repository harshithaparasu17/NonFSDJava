package p4;

import java.util.Scanner;

public class NoOfDigits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("Enter a number ::");
		int n = sc.nextInt();
		while (n != 0) {
			n = n / 10;
			i++;
		}
		System.out.println("Number of digits in the entered integer are :: " + i);
	}
}

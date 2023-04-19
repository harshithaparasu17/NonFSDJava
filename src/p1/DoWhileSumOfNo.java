package p1;

import java.util.Scanner;

public class DoWhileSumOfNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int n = sc.nextInt();

		int i = 1, sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= n);
		System.out.println("Sum of numbers = " + sum);

	}

}

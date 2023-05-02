package p4;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class BiConsumerInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nummber:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		BiConsumer<Integer, Integer> isSmaller = (x, y) -> {
			if (x < y) {
				System.out.println(x + " is less than " + y);
			} else if (x > y) {
				System.out.println(y + " is less than " + x);
			} else
				System.out.println("Both are equal");
		};
		isSmaller.accept(n1, n2);
	}
}

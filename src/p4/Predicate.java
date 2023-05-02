package p4;

import java.util.function.IntPredicate;

public class Predicate {
	public static int smallerNumber(int num1, int num2) {
		IntPredicate isSmaller = x -> x < num2;
		if (isSmaller.test(num1)) {
			return num1;
		} else
			return num2;
	}

	public static void main(String[] args) {
		int small = smallerNumber(10, 20);
		System.out.println(small);
	}
}

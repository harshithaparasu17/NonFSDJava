package p4.lamdaExpressions;

import java.util.ArrayList;

public class FilteringArraylistofInteges {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(-1);
		numbers.add(47);
		numbers.add(-32);
		numbers.add(+5);
		numbers.add(-7);

		// Use lambda expression to filter out negative numbers
		numbers.removeIf(number -> number < 0);
		

		// Print the remaining Positive numbers
		System.out.println("Positive numbers:");
		numbers.forEach(number -> System.out.println(number));
	}
}

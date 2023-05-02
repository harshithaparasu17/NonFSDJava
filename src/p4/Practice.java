package p4;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// accept line of input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the input:");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		String result = "";
// modify the input such that every word second letter of every word is capitalized
// String method CharAt to manipulate character within string using index
		for (String word : words) {
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if (i == 1) {
					result += Character.toUpperCase(c);
				} else {
					result += Character.toLowerCase(c);
				}

			}
			result += " "; // add space after each word
		}
// print the new output
		System.out.println(result.trim());

	}
}

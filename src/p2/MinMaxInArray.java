package p2;

import java.util.Scanner;

public class MinMaxInArray {
	
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		System.out.print("\n Enter Size of Array: ");
		int n = inp.nextInt();
		int i, sum = 0;
		int arr[] = new int[n]; // Creating N-size Array
		
		System.out.print("\n Enter "+n+" numbers: ");
		for (i = 0; i < n; i++) { // Entering N numbers in array
			arr[i] = inp.nextInt();
		}

		int max_element = arr[0], min_element = arr[0]; // Initializing with first element.

		for (i = 0; i < n; i++) {
			if (arr[i] > max_element) { // Checking Maximum element
				max_element = arr[i];
			}

			if (arr[i] < min_element) { // Checking Minimum element
				min_element = arr[i];
			}
		}

		// Printing Result
		System.out.println("\n Maximum Number: " + max_element);
		System.out.println("\n Minimum Number: " + min_element);
	}

}

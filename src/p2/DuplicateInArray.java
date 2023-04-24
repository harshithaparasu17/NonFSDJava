package p2;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateInArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array that is to be created::");
		int size = sc.nextInt();
		int[] myArray = new int[size];
		System.out.println("Enter the elements of the array ::");

		for (int i = 0; i < size; i++) {
			myArray[i] = sc.nextInt();
		}
		System.out.println("The array created is ::" + Arrays.toString(myArray));
		System.out.println("indices of the duplicate elements :: ");

		for (int i = 0; i < myArray.length; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i] == myArray[j]) {
					System.out.println(j);
				}
			}
		}
	}
}

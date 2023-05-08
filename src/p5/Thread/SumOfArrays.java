package p5.Thread;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrays extends Thread
{
public void run() {
	System.out.println("Enter the required size of the array :: ");
    Scanner s = new Scanner(System.in);
    int size = s.nextInt();
    int[] myArray = new int [size];
    System.out.println("Enter the required quantity of the threads :: ");
    int k = s.nextInt();
    int sum = 0;
    System.out.println("Enter the elements of the array one by one ");
    
    for(int i=0; i<size; i++) {
        myArray[i] = s.nextInt();

        for(int j = 0; j< k; j++){
            sum = sum + myArray[i];

        }
        System.out.println("Sum for thread: " + this.getName() + " = " + sum);
    }
    System.out.println("Elements of the array are: "+ Arrays.toString(myArray));
    System.out.println("Sum of the elements of the array ::"+sum);
}
public static void main(String[] args) {
	SumOfArrays s=new SumOfArrays();
	s.start();
}
}

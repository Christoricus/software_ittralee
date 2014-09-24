package lab1;
import java.util.Arrays;
import java.util.Scanner;

//Store 10 user-inputed integers in an array and print the 1st and the 5th values
public class Lab1_q8 {
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		int[] integers = new int[10];
		//inputting 10 integers in the array
		for (int i = 0; i < 10; i++) {
			System.out.print("Please enter an integer: ");
			integers[i] = in.nextInt();
		}
	
		//Printing out the first and the 5th values
		System.out.println("\nThe first value in the array is: " + integers[0]);
		System.out.println("The 5th value in the array is: " + integers[4]);
		
		//Printing out the whole array
		System.out.println("\nThe array entered was: " + Arrays.toString(integers));
		in.close();
	}//ends main

}//ends class

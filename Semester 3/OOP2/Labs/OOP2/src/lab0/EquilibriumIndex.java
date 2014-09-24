package lab0;
import java.util.Scanner;

public class EquilibriumIndex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int index, leftSum = 0, rightSum = 0;
		int i, j, k;
		//Ask for the length of the array
		System.out.print("How many numbers? ");
		index = in.nextInt();
		
		int[] num = new int[index]; //Intialise the array into the amount of numbers wanted
		//Inputting the numbers in the array
		for (i = 0; i < num.length; i++) {
			System.out.print("Please enter integer " + (i+1) + ": ");
			num[i] = in.nextInt();
		}
		//Loop through the entire array
		for (j = 0; j < num.length; j++) {
			//Finding the sum of the left sum
			leftSum = 0; rightSum = 0;
			for (k = 0; k < num.length; k++) {
				rightSum += num[k];
			}
			//Finding the sum of the right sum
			for (k = 1; k < num.length; k++) {
				leftSum += num[k];
			}
			//Comparing rightSum with leftSum
			if (leftSum == rightSum)
				System.out.print(j + " ");
		}
		
		in.close();
	}//end main

}

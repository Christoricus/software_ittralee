//Exercise5.java
/*This program outputs the 1st and 5th elements of an array and also the 
 *smallest and largest numbers in the array*/

package week8;
import java.util.Scanner;

public class Lab11Exercise5 {
	
	public static void main(String[] args)
	{
		int[] numbers = new int[10];
		int largest = 0, smallest = 0, i;
		
		Scanner input = new Scanner(System.in);
		
		for (i = 0; i < numbers.length; i++)
		{
			System.out.print("Please enter an integer: " );
			numbers[i] = input.nextInt();
			
			if ( i == 0 ) {
				largest = numbers[i];
				smallest = numbers[i];
			
			} else if ( numbers[i] > largest ) {
				largest = numbers[i];
			
			} else if ( numbers[i] < smallest ) {
				smallest = numbers[i];
			}	
			
		}
		
		System.out.println( "\nThe first value in the array is " + numbers[0]
				+ "\nThe 5th number in the array is " + numbers[4]
				+ "\nThe largest number in the array is " + largest
				+ "\nThe smallest number in the array is " + smallest );
	
		input.close();
	
	}

}

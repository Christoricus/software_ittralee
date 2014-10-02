//FlippingJames.java
//James McGarr
//Scroll all the way down to read the question

import java.util.Scanner;
import java.util.Arrays;

public class FlippingJames{
	public static void main(String args[])
	{
		String result="";
		Scanner in        = new Scanner(System.in);
		int input[]       = new int[in.nextInt()];          // prompt for integer input and create array
		int sortedInput[] = new int[input.length];          // create new parallel array  (array with same size as first)
		for (int i=0; i<input.length; i++)
			input[i]      = in.nextInt();                   // prompt for and read in values for first array
		System.arraycopy(input,0,sortedInput,0,input.length); // copy the values from the first array into the second parallel array
		Arrays.sort(sortedInput);                           // arrange the numbers in the second array from lowest number to highest
		
	    for (int i=input.length-1; i>-1; i--)               // loop as many times as the length on the arrays
	    {
	    	
	    	if (input[0] == sortedInput[i] && i!=0)         // working backwards, if the value in [i] of the sorted array matchs the value of [0] in the array we're flipping, and if it is not the last loop... 
	    	{
	    		flipAt(input,i);                            // flip the currently out of order first array where the main loop has counted down to at that time. If this statement is true, it will only ever flip at 'i' which is not the number of digits it is flipping, but the index of the integer which will be swapped with position [0]
	    		System.out.print((i+1) + " ");
	    	}
	    			
	    	if (input[i]!=sortedInput[i])                   // If the loop has counted down to a position where the ordered list does not match the list we are flipping then
	    	{
	    		System.out.print((findIndexFor(input,sortedInput[i])+1) + " ");         // The index plus 1 of where the array values will be flipped is printed
	    		flipAt(input,findIndexFor(input,sortedInput[i]));                       // and then the array is flipped
	        	i++;                                                                    // this 'if' statement only handles a special case, which is where we want to bring the number we want to place at position [i], in the unsorted array, to the beginning position [0], so afterwards we can flip it over to where we want, which is where 'i' is currently at. That will be done by the previous 'if' statement, but after this 'i' will be moved so we have to move it back with 'i++'. (the loop is counting down so to reverse it by 1 we just increase the value of 'i' by one)
	    	}                                                                           
	    }
	    
	    
	    
	}
	public static void flipAt(int[] array, int flipIndex)   // This method flips the numbers over from the beginning up to and including the index supplied
	{
		int z=flipIndex;
		int tempNum=0;
		
		for (int i=0; i<(flipIndex+1)/2; i++)
		{
			tempNum = array[z];
			array[z] = array[i];
			array[i] = tempNum;
			z--;
		}
	}
	public static int findIndexFor(int[] array, int value)  // This method finds an integer value in an array and returns its index
	{
		for (int i=0; i<array.length; i++)
			if(array[i] == value)
				return i;
				
		return -1;
	}
}











/*


[optional] Flipping Numbers
Given a list of N unique integers, 2 _ N _ 25000, produce a sequence of flips"
so that the end result is the list, sorted in ascending order. A k-flip takes the first k
numbers and reverses their order in the list. For example given the list (2; 6; 4; 1; 9),
a k-flip where k = 4 would result in the list (1; 4; 6; 2; 9).
Your task is to determine a list of k values which represent the sequence of flips
that will result in list being sorted.
Input
The first line of input contains the integer N which represents the number of integers
in the list. The next line of input contains N space-separated integers.
Output
Your program should output the sequence of k values which represent the flips that
turn the input list in to a sorted list. Each of these values should be separated by
a space and the output should be terminated by a new line character.

Sample Input 1
5
1 4 6 2 9
Sample Output 1
3 4 2

*/
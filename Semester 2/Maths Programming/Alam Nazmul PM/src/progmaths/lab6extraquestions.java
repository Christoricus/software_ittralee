package progmaths;
import java.util.Scanner;

public class lab6extraquestions {

	static Scanner input = new Scanner(System.in);
	public static void main( String[] args )
	{

		//Asking for array input
		System.out.print( "Please enter the array length: ");
		int n = input.nextInt();

		
		
		
		int[] numbers = new int[n];

		for(int i = 0; i < n; i++ )
		{
			System.out.print( "Please enter number " + (i+1) + ": ");
			numbers[i] += input.nextInt();
		}

		//Sorting the array using bubble sort
		//Courtesy http://www.algolist.net/Algorithms/Sorting/Bubble_sort

		boolean swapped = true;
		int j = 0;
		int tmp;

		while (swapped) 
		{

			swapped = false;

			j++;

			for (int i = 0; i < numbers.length - j; i++) 
			{                                       

				if (numbers[i] > numbers[i + 1]) 
				{                          

					tmp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = tmp;
					swapped = true;

				}

			}
		}

		//Printing out
		/* The numbers I entered are {1, 2, 3, 4, 5}
		 * The media is = 3
		 * the mode is = 1
		 * The largest number is 5
		 * The smallest number is 1
		 * The sum of array is 15
		 * The average is 3
		 * The Standard Deviation is 1.5811388300841898
		 */
		System.out.println( "\n\n\t===============Expected Output===============");
		System.out.println( "\nThe median is: " + findMedian(numbers) );
		System.out.println( "\nThe mode is: " + findMode(numbers) );
		System.out.println( "\nThe largest number is: " + largestNum(numbers) );
		System.out.println( "\nThe smallest number is: " + smallestNum(numbers) );
		System.out.println( "\nThe array adds up to: " + additionArray(numbers) );

		System.out.println( "\n\n\t===============Subtracting a Fixed Number===============");
		
		float average =  (float) additionArray(numbers)/n;  // average with the array.length		
		System.out.println( "\nThe average is: " + average );
		System.out.println( "\nThe (array[i] - constant) summation is: " + subtractionArray(numbers, average) );
		System.out.println( "\nThe (array[i] - constant) squared is: " + squaredArray(numbers, average) );
		System.out.println( "\nThe standard deviation is: " + standardDeviation(numbers, n) );

	}

	//Finding the median
	public static double findMedian(int[] array) {
		int midValue = array.length/2;

		if (array.length%2 == 1) { //if odd array length
			return array[midValue];

		} else {
			return (array[midValue-1] + array[midValue]) / 2.0;
		}
	}

	//Finding the mode
	public static double findMode(int[] array) {
		int max = 0, maxCount = 0;

		for (int i = 0; i < array.length; ++i) {
			int count = 0;
			for (int j = 0; j < array.length; ++j) {
				if (array[j] == array[i]) ++count;
			}
			if (count > maxCount) {
				maxCount = count;
				max = array[i];
			}
		}

		return max;
	}

	//Finding the largest number
	public static int largestNum(int[] array)
	{
		int largest = 0;

		for(int i = 0; i < array.length; i++)
		{
			if(i == 0) 
			{
				largest = array[i];

			} else if ( largest < array[i] )  
				largest = array[i]; 
		}

		return largest;

	}

	//Finding the smallest number
	public static int smallestNum(int[] array)
	{
		int smallest = 0;

		for(int i = 0; i < array.length; i++)
		{
			if(i == 0) 
			{
				smallest = array[i];

			} else if ( smallest > array[i] )  
				smallest = array[i]; 
		}

		return smallest;

	}

	//Adding the array
	public static float additionArray(int[] array)
	{
		float sum = 0;

		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}

		return sum;

	}

	//Subtracting the array
	public static float subtractionArray(int[] array, float num)
	{
		float subtract = 0, sum = 0;

		for(int i = 0; i < array.length; i++)
		{
			subtract = array[i] - num;

			sum += subtract;
		}

		return sum;

	}

	//Squaring every time
	public static float squaredArray(int[] array, float num)
	{
		float subtract = 0, sum = 0, squared = 0;

		for (int i = 0; i < array.length; i++)
		{
			subtract = array[i] - num;

			squared = subtract*subtract;

			sum += squared;

		}

		return sum;

	}

	
	//Finding the standard deviation
	public static double standardDeviation(int[] array, float num)
	{
		float average = additionArray(array)/ num;
		float sumSquared = squaredArray(array, average);
				
		return (double) Math.pow(sumSquared/(num-1) , 0.5);
		

	}

}

package progmaths;
import java.util.Scanner;

public class lab6extracredit {

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
		System.out.println( "\n\nThe median is: " + findMedian(numbers) );
		System.out.println( "\nThe mode is: " + findMode(numbers) );

	}

	public static double findMedian(int[] array) {
		int midValue = array.length/2;
		
		if (array.length%2 == 1) { //if odd array length
			return array[midValue];
					
		} else {
			return (array[midValue-1] + array[midValue]) / 2.0;
		}
	}

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




}

package progmaths;
import java.util.Arrays;
import java.util.Scanner;

public class lab8 {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		int numOfNumbers;

		System.out.print("Please input the number of numbers: ");
		numOfNumbers =  input.nextInt();

		double[] myArray = new double[numOfNumbers];

		/* Length of my array is 5
		 * myArray is = [3.0, 7.0, 9.0, 8.0, 2.0]
		 * Max Value is = 9.0
		 * Minimum Value is = 2.0
		 * Reverse of myArray is = [2.0, 8.0, 9.0, 7.0, 3.0]
		 * The number I am adding to the new array is 6.0
		 * * myNewArray is [3.0, 7.0, 9.0, 8.0, 2.0, 9.0]
		 * myNewArray after I removed the first index is [7.0, 9.0, 8.0, 2.0, 9.0]
		 * The first number of the array is: 7.0
		 * When I search for 5 within myArray = found --> boolean = true;
		 * When I search for 6 within myArray = not found --> boolean = false;
		 */
		displayArray(myArray);
		System.out.println("The max value of the array is: " + findMax(myArray)	);
		System.out.println("The min value of the array is: " + findMin(myArray)	);
		System.out.println( "The reverse of the array is: " + Arrays.toString(reverseArray(myArray)) );

		System.out.println("\n======ADDING ANOTHER NUMBER TO THE ARRAY======"); //Have to reverse back to normal from here
		System.out.print("What number would you like to add: ");
		double extraNum = input.nextDouble();
		myArray = addAnotherNumber(reverseArray(myArray), extraNum);
		System.out.println("The array after adding another number: " + Arrays.toString(myArray));

		System.out.println("\n======REMOVING THE FIRST NUMBER FROM THE ARRAY======");
		myArray =  removeFirstNum(myArray);
		System.out.println("The array after removing the first index: " + Arrays.toString(myArray) );

		System.out.println( "\nThe first number of the array is: " + getFirstNum(myArray) );	

		System.out.println("\n======SEARCHING WITHIN THE ARRAY======");
		System.out.print("Please input the number you are searching for: ");
		double keyword = input.nextDouble();

		if ( binarySearch(myArray, keyword)) {
			System.out.println("The number you entered " + keyword + " is found.");
		} else
			System.out.println("Sorry - the number you entered " + keyword + " is not found.");



	}



	public static void displayArray(double[] arraysToDisplay)
	{
		for ( int i = 0; i < arraysToDisplay.length; i++ )
		{
			System.out.print("Please input number " + (i+1) + ": ");
			arraysToDisplay[i] = input.nextDouble();

		}

		//Printing out
		System.out.println("\nMy array to display is: " + Arrays.toString(arraysToDisplay) );

	}


	public static double findMax(double[] maxArray)
	{
		double max = 0.0d;

		for (int i = 0; i < maxArray.length; i++)
		{
			if ( i == 0 ) {
				max = maxArray[i];

			} else if ( maxArray[i] > max )
				max = maxArray[i];
		}

		return max;
	}


	public static double findMin(double[] minArray)
	{
		double min =  minArray[0];

		for (int i = 0; i < minArray.length; i++)
		{
			if ( minArray[i] < min )
				min = minArray[i];
		}

		return min;

	}


	public static double[] reverseArray(double[] arrayReversed)
	{
		double temp;

		for ( int i = 0; i < arrayReversed.length/2; i++ )
		{
			temp = arrayReversed[i];
			arrayReversed[i] = arrayReversed[ (arrayReversed.length-1) -i ];
			arrayReversed[ (arrayReversed.length-1) -i ] = temp;
		}

		return arrayReversed;

		/* Alternative solution
	 double[] newArray = new double[arrayReversed.length];
	 int index = 0;

	 for (int i = arrayReversed.length-1; i >= 0; i--)
	 {
	 	newArray[i] = arrayReversed[index];
	 	index++;
	 }

	 return newArray;
		 */

	}


	public static double[] addAnotherNumber(double[] oldArray, double newNum)
	{
		double[] newArray = new double[oldArray.length+1];


		for (int i = 0; i < oldArray.length; i++)
		{
				newArray[i] = oldArray[i];
		}
		
		newArray[oldArray.length] = newNum;
		
		return newArray;

	} 

	public static double[] removeFirstNum(double[] oldArray)
	{
		double[] newArray = new double[oldArray.length-1];

		for (int i = 0; i < oldArray.length-1; i++)
		{
			newArray[i] = oldArray[i+1];
		}

		return newArray;
	}


	public static double getFirstNum(double[] array)
	{
		return array[0]; 

		//have to write this way cuz the array was reversed in the main
		//Otherwise return array[array.length-1];
	}


	public static boolean binarySearch(double[] array, double key)
	{
		boolean found = false;
		for (int i = 0; i < array.length; i++)
		{
			if ( array[i] ==  key )
				found = true;

		}
		return found;

	}


}

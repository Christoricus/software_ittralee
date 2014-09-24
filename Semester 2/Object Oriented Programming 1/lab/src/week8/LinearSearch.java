package week8;
import java.util.Scanner;

/* In this program a linear serach of an array is performed and if the key value
 * is found the corresponding parallel array is looked up for associated information.
 */

public class LinearSearch {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		int[] stockIDs = new int[5];
		float[] prices = new float[5];
		int searchID, subscript;
		
		readArray(stockIDs, prices);
		
		System.out.print("\n\nEnter the product ID number you want the price for: ");
		searchID = input.nextInt();
		
		subscript = linearSearch(stockIDs, searchID);
		
		if (subscript != -1) {
			System.out.println( "The product ID number " + searchID + " has been found and"
					+ " it's price is EUR" + prices[subscript] );
		} else
			System.out.println( "Sorry - the product ID number " + searchID + " has not been found!");

	}
	
	//Reading in the arrays
	public static void readArray(int[] idNums, float[] prices)
	{
		int i;
		
		System.out.println("Please enter the product ID number and prices for " +
		idNums.length + " stock items\n");
		
		for (i = 0; i < idNums.length; i++)
		{
			System.out.print("\nPlease enter the ID number for product " + (i+1) + ": ");
			idNums[i] = input.nextInt();
			
			System.out.print("Please enter the price for this product: ");
			prices[i] = input.nextFloat();
		}
	}
	
	//Searching for a specific value within the array
	public static int linearSearch(int[] idNums, int key)
	{
		int i;
		for (i = 0; i < idNums.length; i++)
		{
			if (idNums[i] == key)
				return i;
		}
		return -1;
	}

}

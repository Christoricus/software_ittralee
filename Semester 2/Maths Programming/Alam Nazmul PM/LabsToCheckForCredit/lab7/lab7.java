package progmaths;
import java.util.Scanner;

public class lab7 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Please enter the number of numbers: ");
		int num = input.nextInt();
		
		double[] array = new double[num];
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("Please enter number " + (i+1) + ": ");
			array[i] = input.nextDouble();
		}
		
		//Printing out
		/* My data is 3	6	8	1	8	3	9
		 *  The average I am expecting = 5.428571429
		 *  The Standard Deviation I am expecting = 3.10145895
		 */
		System.out.println("\n\n============STANDARD DEVIATION CALCULATOR============");

		System.out.println("\nThe mean of the array is: " + averageOf(array));
		System.out.println("\nThe standard deviation is: " + stdDeviationOf(array));
	}
	
	//Finding the mean of the array -- (sum of array/num of numbers) 
	public static double averageOf(double[] data)
	{
		double sum = 0;
		for (int i = 0; i < data.length; i++)
		{
			sum += data[i];
			
		}
		return (double) (sum/data.length);
	}
	
	public static double stdDeviationOf(double[] data)
	{
		
		double sum = 0, variance = 0, newNum = 0;
		
		double mean = averageOf(data); //Work out the Mean
		
		for (int i =  0; i < data.length; i++)
		{
			newNum = Math.pow( (data[i] - mean ), 2 );  //Then for each number: subtract the Mean and square the result
		    sum += newNum;	//Add them up

		}
	    
		/* Finding the variance of Standard Deviation -- sum/(array.length-1)
		 * OR, to find the variance of Population Standard Deviation - sum/array.length
		 */
		
		variance = (double) sum/(data.length-1); //Then work out the mean of those squared differences.
		
		return (double) Math.sqrt(variance); //Get the standard deviation
	}
}

//Q3a.java
/*This program reads in an arbitrary number of weight values using a data-sentinel controlled while
 *loop and displays a number of results based on the values entered*/

import java.util.Scanner;

public class Q3a {
	public static void main(String args[])
		{					
			float weight,total=0,smallest=0;
			int i=0,over70=0;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the weight of person " + (i+1) + " (-1 to exit): ");
			weight = input.nextFloat();
			
			while(weight!=-1)
				{
					total += weight;
					
					if(weight>70)
						over70++;
						
					if(i==0)
						smallest = weight;
					else if(weight<smallest)
						smallest = weight;
						
					i++;
					System.out.print("Please enter the weight of person " + (i+1) + " (-1 to exit): ");
					weight = input.nextFloat();	
				}
	
			System.out.println("\n\nNumber of weight values entered: " + i + 
				               "\nNumber of weight values exceeding 70kg: " + over70 +
				               "\nSmallest weight value entered: " + smallest + "kg" +
				               "\nAverage of weight values: " + String.format("%.2fkg",total/i));
				
		}
}	




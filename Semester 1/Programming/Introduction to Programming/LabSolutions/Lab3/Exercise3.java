//Exercise3.java
/*This program reads in an area in acres and converts it to hectares*/

import java.util.Scanner;

public class Exercise3 {
	 public static void main(String args[])
		{
			float acres;
			final float CONVERSION_FACTOR = 0.4046f;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter an area in acres: ");
						
			acres = input.nextFloat();
					
			System.out.println("\n\nThis is equivalent to " + 
			           String.format("%.3f",CONVERSION_FACTOR*acres) + " hectares");
					
		}
}
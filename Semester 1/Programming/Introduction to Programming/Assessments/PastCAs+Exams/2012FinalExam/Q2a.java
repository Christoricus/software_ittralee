//Q2a.java
/*The following program determines the total cost of keeping a car in a parking lot
 for a certain amount of time, based on a table of values*/

import java.util.Scanner;

public class Q2a{
	public static void main(String args[])
		{
			float time,cost=0;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the amount of time in hours you spent parking: ");
			
			time = input.nextFloat();

			if (time < 0)
			    System.out.println("\nError: you have entered an invalid time value ... exiting program");
			else if (time <= 1)
			    cost = time * 0.60f;
			else if (time <= 3)
			    cost = 1 * 0.60f + (time - 1) * 0.50f;
			else
			    cost = 1 * 0.60f + 2 * 0.50f + (time - 3) * 0.40f;
			  
            if(time >= 0)
    			System.out.println("\nTotal cost of parking for " + time + " hours is EUR" + String.format("%.2f",cost));


		}
}


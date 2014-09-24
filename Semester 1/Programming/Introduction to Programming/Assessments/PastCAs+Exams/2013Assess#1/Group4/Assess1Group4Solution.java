//Assess1Group4Solution.java
/*This program determines determines the total cost of keeping a car in a parking lot
  for a certain amount of time, based on a table of values*/

import java.util.Scanner;

public class Assess1Group4Solution{
	public static void main(String args[])
		{
			float time,cost;
			final float RATE1 = 0.60f, RATE2 = 0.50f, RATE3 = 0.40f;
	
			Scanner input = new Scanner(System.in);
			
			System.out.println("=================================\n" +
				               "\tCar Park Calculator\n" +
				               "=================================\n\n");

            System.out.print("Please enter the amount of time in hours you spent parking: ");
            time = input.nextFloat();
            
              
            if(time<0)
            	System.out.println("\nError: you have entered an invalid time value ... exiting program");
            else
	            {
	            	if (time <= 1)
        				cost = time*RATE1;
        			else if(time<=3)
        				cost = 1*RATE1 + (time-1)*RATE2;
        			else
        				cost = 1*RATE1 + 2*RATE2 + (time-3)*RATE3;
	            		
	            	
	            	System.out.println("\n\nTotal cost of parking for " + time + " hours is EUR" + 
	            		               String.format("%.2f",cost));
	            }
		
		}
}


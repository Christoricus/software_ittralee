//Assess1Group1Solution.java
/*This program reads in the slopes of 2 lines and determines a number of facts
 *about the lines based on the values supplied*/

import java.util.Scanner;

public class Assess1Group1Solution{
	public static void main(String args[])
		{
			float slope1,slope2;
			
			Scanner input = new Scanner(System.in);
			
            System.out.print("Please enter the slope of the first line: ");
            slope1 = input.nextFloat();
            
            System.out.print("Please enter the slope of the second line: ");
            slope2 = input.nextFloat();
           
            System.out.println("\n\n=========================================\n" +
            	               "\tProgram Results\n" +
            	               "=========================================\n\n");
            	               
           
			if(slope1 == slope2) 
			    System.out.println("The slopes you entered are the same so the lines must be parallel");
			else if(slope1*slope2 == -1) 
				System.out.println("The product of the slopes is -1 so the lines must be perpendicular");
			else
				System.out.println("The lines involved here intersect but are not perpendicular to each other"); 
			 
			    
			if(slope1 == 0)
				if(slope2 == 0)
					System.out.println("\n\nBoth lines are parallel to the x-axis");
				else
					System.out.println("\n\nOnly the first line is parallel to the x-axis");
			else
				if(slope2 == 0)
					System.out.println("\n\nOnly the second line is parallel to the x-axis");
				else
					System.out.println("\n\nNeither line is parallel to the x-axis");
					
		}
}


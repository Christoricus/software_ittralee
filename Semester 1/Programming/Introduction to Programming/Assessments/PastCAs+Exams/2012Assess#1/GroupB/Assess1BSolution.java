//Assess1BSolution.java
/*This program is a simple simulation of a potatoe grading machine which determines whether a
 potatoe is good or bad and if good, it determines the average diameter of the potatoe and its grade*/

import java.util.Scanner;

public class Assess1BSolution{
	public static void main(String args[])
		{
			float minDiameter,maxDiameter,avgDiameter;
			String condition;
			char grade;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the condition of the potatoe - (g)ood or (b)ad: ");
			condition = input.nextLine();

			if (condition.equals("g"))
				{	
				    System.out.print("\n\nPlease enter the minimum diameter of the potatoe: ");
				    minDiameter = input.nextFloat();
				    
				    System.out.print("Please enter the maximum diameter of the potatoe: ");
				    maxDiameter = input.nextFloat();
				
				    avgDiameter = (minDiameter + maxDiameter)/2;
				
				    if (avgDiameter <= 24.99f)
				          grade = 'D';
				    else if (avgDiameter <= 49.99f) 
				          grade = 'C';
				    else if (avgDiameter <= 74.99f)
				          grade = 'B';
				    else
				          grade = 'A';

				
				    System.out.println("\n\nThe average diameter of the potatoe is " + 
				    	      String.format("%.2f",avgDiameter) + "mm and so its grade is " + grade);
				}			
			else
				    System.out.println("\nThe condition of this potatoe is bad ..... exiting program now");
			

		}
}


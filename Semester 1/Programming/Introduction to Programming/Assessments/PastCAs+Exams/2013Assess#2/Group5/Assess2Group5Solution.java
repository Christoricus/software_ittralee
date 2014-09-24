//Assess2Group5Solution.java
/*This program reads in an arbitrary number of exam marks and determines a number of statistics based on the values
 *entered. Each mark is partially validated also*/

import java.util.Scanner;

public class Assess2Group5Solution{
	public static void main(String args[])
		{
			int mark,numProcessed=1,totalMarks=0,atLeast70=0,highest=0,lowest=100,below40=0;
			
			Scanner input = new Scanner(System.in);
			
			
			do{
				System.out.print("Please enter the mark for student " + numProcessed + ": ");
            	mark = input.nextInt();
            	
            	while(mark<0 || mark>100)
	            	{ 		
	        			System.out.print("Invalid mark! Please re-enter mark for student " + numProcessed + ": ");
	        			mark = input.nextInt();		
	            	}
            	
            	
        		if(mark>highest)
        			highest=mark;
        		
        		if(mark<lowest)
        			lowest=mark;
        			
        		totalMarks+=mark;
        		
        		if(mark>=70)
        			atLeast70++;
        			
        		if(mark<40)
        			below40++;
        			
        		numProcessed++;
	            					
	            System.out.println("\n");		
			}while(numProcessed<=5);
			
			
			System.out.println("\n\n============================\n" +
				               "\tProgram Results\n" +
				               "============================\n\n" +
				               "\nThe average of the valid marks entered is " + String.format("%.2f",totalMarks/5f) +
				               "\nThe largest valid mark entered is " + highest + 
				               "\nThe smallest valid mark entered is " + lowest +
				               "\nThe percentage of valid marks that were at least 70 is " + (atLeast70*20) + "%" +
				               "\nThe number of valid marks that were below 40 is " + below40);
        			
		}
}


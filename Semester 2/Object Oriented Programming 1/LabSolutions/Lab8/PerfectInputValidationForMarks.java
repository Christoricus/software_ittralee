//ImprovedInputValidationForMarks.java
/*This program uses a do-while loop which processes exactly 5 exam marks
 *supplied by the user. The program determines the highest mark along with
 *the average mark (to the nearest whole number). It performs perfect 
 *validation on the exam marks*/

import java.util.Scanner;

public class PerfectInputValidationForMarks {
	public static void main(String args[])
		{
			int i=1,mark=0,totalMarks=0,highestMark=0,j;
			String markAsString;
			double markAsDouble;
			boolean valid;
					
			Scanner input = new Scanner(System.in);
			
			do{
				System.out.print("Please enter the mark of student " + i + ": ");
				markAsString = input.nextLine();
				
				valid = false;
				
				while(!valid)
					{
						for(j=0;j<markAsString.length();j++)
							if(!Character.isDigit(markAsString.charAt(j)))
								break;
								
						if(j==markAsString.length() && j!=0) 
							{
							   markAsDouble = Double.parseDouble(markAsString);
							   
							   if(markAsDouble>=Integer.MIN_VALUE && markAsDouble<=Integer.MAX_VALUE)
								   {
								   		mark = (int)markAsDouble;
								   		
								   		if(mark>=0 && mark<=100)
							   				valid = true;
							   			else
								   			{
								   				System.out.print("Invalid! Please enter the mark of student " + i + ": ");
												markAsString = input.nextLine();	 
								   			}
								   }
							   else
								   {
								   		System.out.print("Invalid! Please enter the mark of student " + i + ": ");
										markAsString = input.nextLine();	 
								   }	
							}
						else
						{
							System.out.print("Invalid! Please enter the mark of student " + i + ": ");
							markAsString = input.nextLine();	
						}
							
					}
				
								
				if(mark>highestMark)
					highestMark = mark;
					
				totalMarks += mark;
				
				System.out.println("\n");
				
				i++;		
				
			}while(i<=5);		

			System.out.println("\n\nHighest mark was: " + highestMark +
						       "\nAverage mark was: " + String.format("%.0f",totalMarks/5f));											
		}		
}



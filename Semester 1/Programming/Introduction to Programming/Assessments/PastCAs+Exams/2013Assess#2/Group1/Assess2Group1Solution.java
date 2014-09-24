//Assess2Group1Solution.java
/*This program reads in the details for an arbitrary group of employees and
 *determines some statistics based on the data supplied*/

import java.util.Scanner;

public class Assess2Group1Solution{
	public static void main(String args[])
		{
			String name, highestName="";
			float salary,highestSalary=0,totalSalary=0;
			int numProcessed=0,over30000=0;
				
			Scanner input = new Scanner(System.in);
			
            System.out.print("Please enter the name of employee " + (numProcessed+1) + " (q to quit): ");
            name = input.nextLine();
            
            while(!name.equals("q"))
	            {
            		System.out.print("Please enter the salary of employee " + (numProcessed+1) + ": ");
            		salary = input.nextFloat();
            		
            		while(salary<0)
	            		{
	            			System.out.print("\nInvalid salary!! Please re-enter the salary of employee " + (numProcessed+1) + ": ");
            				salary = input.nextFloat();
	            		}
            		
            		if(numProcessed==0)
	            		{
	            			highestName = name;
	            			highestSalary = salary;
	            		}
	            	else if(salary>highestSalary)
		            	{
		            		highestName = name;
	            			highestSalary = salary;
		            	}
		            	
		            totalSalary+=salary;
		            
		            if(salary>=30000)
		            	over30000++;
	            	
	            	numProcessed++;
	            	
	            	System.out.print("\n\n\nPlease enter the name of employee " + (numProcessed+1) + " (q to quit): ");
	            	input.nextLine();
           			name = input.nextLine();     					
	            }
              
            if(numProcessed>0)
	            {
	            	System.out.println("\n\n*************************************\n" +
            	         "\tEmployee Stats\n" +
            	         "**************************************\n\n");
            	               
			
					System.out.println("Details of highest paid employee: \nName: " + highestName + 
						"\nSalary: " + highestSalary +
					    "\n\nAverage employee salary: EUR" + String.format("%.0f",totalSalary/numProcessed) +
					    "\nPercentage of employees earning at least EUR30,000: " + 
					    String.format("%.2f",(float)over30000/numProcessed*100));
	            }
	        else
	        	System.out.println("\nYou entered no employee details");			
		}
}


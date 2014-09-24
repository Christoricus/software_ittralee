/* This program asks for the name of the employee and his/her salary in arbitrary amount of times.
 * It then stops the the program by inputting 'q'
 * The output gives the highest paid employee's name and salary, the average salary of all the employees
 * and the percentage of employee who are earning >= 30,000 EUR per annum.
 */

package Assess2013Two;
import java.util.Scanner;

public class Group1Solution {
	
	public static void main(String[] args)
	{
		int count=0, over30=0, numProcessed=0;
		float salary=0f, highest=0f, averageSalary=0f, totSalary=0f, percentSalary=0f;
		String name, highestName="";
		
		Scanner input = new Scanner(System.in);
		
		do
		{
			
			System.out.print("\nPlease enter the name of the employee " + (count+1) + " (q to quit): ");
			name = input.nextLine();
			
			if(name.equals("q"))
				break;
			
			System.out.print("Please enter the salary of employee " + (count+1) + ": ");
			salary = input.nextFloat();
			
			while(salary < 0){
				System.out.print("\nInvalid salary!! Please re-enter the salary of employee " + (count+1) + ": ");
				salary = input.nextFloat();
			}
			
			if(salary > highest)
			{
				highest = salary;
				highestName = name; //add this to keep track of person having the highest salary
			}
			
			if(salary >= 30_000f)
			{
				over30++;
			}
			
			numProcessed++;
			
			totSalary += salary;	
			
			
			count++;
			
			input.nextLine(); //needed because a String input follows a numeric input if loop repeats
		
		}while(!name.equals("q"));
		
	
		if(count < 1)
			System.out.println("\nYou entered no employee details.");
		else
		{
			//move the calculations down here for efficiency
			averageSalary = totSalary/numProcessed;
			percentSalary = (over30*100)/numProcessed;
			
			System.out.println("\n\n**********************************\r\tEmployee Stats\r**********************************" +
						"\n\nDetails of highest paid Employee: " +
						"\nName: " + highestName + "\nSalary: " + String.format("%.2f",highest) + 
						"\n\nAverage employee salary: EUR" + String.format("%.0f",averageSalary) +
						"\nPercentage of employee earning at least EUR30,000: " + String.format("%.2f",percentSalary));
		}
	
		input.close();
	}
}

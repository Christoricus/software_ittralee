//PS2Qd.java
/*A program that asks the user to enter 2 salary values and determines if they are both
 *valid. If they are then their average will be calculated, otherwise an error message
 *will be given*/
 
import java.util.Scanner;

public class PS2Qd {

	public static void main(String args[]) 	
	{
		float salary1,salary2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first salary: ");
		salary1 = input.nextFloat();
		
	    System.out.print("Please enter the second salary: ");
		salary2 = input.nextFloat();
		
		
		if(salary1 >= 0 && salary2 >= 0)
			System.out.println("\nThe average salary is EUR " + String.format("%.2f",(salary1+salary2)/2));
		else
			System.out.println("At least one of the salary values entered is negative ... " + 
				" quitting program now!");
			
	}
}
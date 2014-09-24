//ProblemSolving5Insurance.java
/*Program that reads in the gender and age of a driver as well as the value of their car and whether
 or not they have incurred a speeding ticket. It uses this information to determine the total cost
 of their premium*/


import java.util.Scanner;

public class ProblemSolving5Insurance{
	public static void main(String args[])
	{
		String gender,ticket;
		double value,premium;
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the gender of the driver ('m' or 'f'): ");
		gender = input.nextLine();
	
        System.out.print("Please enter the age of the driver: ");
        age = input.nextInt();
        
        System.out.print("Please enter the value of the car: ");
        value = input.nextDouble();
        
        System.out.print("Please enter whether the driver has ever received a speeding\n" + 
        "ticket ('y' or 'n'): ");
        input.nextLine();
        ticket = input.nextLine();

        premium = value * 0.03; // set premium to 3% of the car's value

		if (gender.equals("m") && age < 25)
		    premium = premium * 1.11; // increase premium by 11%
		
		else if (gender.equals("f") && age < 21)
		    premium = premium * 1.06; // increase premium by 6%
		    
		
		if (ticket.equals("y"))
			 premium = premium + 250;
		
		System.out.printf("\n\nCost of premium is EUR%.2f",premium);

			
		System.out.println("\n\n\n");
				                 		
	}
}


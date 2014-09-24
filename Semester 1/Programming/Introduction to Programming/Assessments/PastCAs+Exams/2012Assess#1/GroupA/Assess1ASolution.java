//Assess1ASolution.java
/*This program reads in the gross income, tax credits, cut-off point and pension payments
 of a person and uses these to determine the PAYE owed for a months work
 There is also a little fool-proofing code in the program.*/

import java.util.Scanner;

public class Assess1ASolution{
	public static void main(String args[])
		{
			float grossIncome,cutoffPoint,pensionPayments,taxCredits, PAYE;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("*********Calculating the monthly PAYE owed by a person***********" + "\n\n");

            System.out.print("Please enter the gross income of the person: ");
            grossIncome = input.nextFloat();
           
			if (grossIncome < 0) 
			    System.out.println("\nYou have entered an invalid gross income value ... program now exiting");
			else
				{
					System.out.print("Please enter the cut-off point of the person: ");
					cutoffPoint = input.nextFloat();
					
			
				    if (cutoffPoint < 0) 
				        System.out.print("\nYou have entered an invalid cut-off point value ... program now exiting");
				    else
					    {
					        System.out.print("Please enter the pension payments of the person: ");
					        pensionPayments = input.nextFloat();
					        
					        System.out.print("Please enter the tax credits of the person: ");
					        taxCredits = input.nextFloat();
					
					
					        if (grossIncome > cutoffPoint) 
					            PAYE = cutoffPoint * 0.20f + (grossIncome - cutoffPoint - pensionPayments) * 0.42f - taxCredits;
					        else
					            PAYE = (grossIncome - pensionPayments) * 0.20f - taxCredits;
					        
					
					        System.out.println("\nThe PAYE owed by the person is EUR" + String.format("%.2f",PAYE));
					
			   			}
				}
		}
}


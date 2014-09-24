//Assess1CSolution.java
/*This program is a simple simulation of an ATM where the user is allowed to make a withdrawal,
 * display their balance on screen and exit the system*/

import java.util.Scanner;

public class Assess1CSolution{
	public static void main(String args[])
		{
			int PIN, choice;
			float withdrawalAmount,balance=1000;
			
			Scanner input = new Scanner(System.in);

			System.out.print("Please enter your PIN: ");
			PIN = input.nextInt();

			if (PIN == 1234)
				{
					System.out.println("\n\n\t\t*********Welcome to the ATM System***********\n\n\n\n" +
							           "\t\t1. Make a withdrawal" +
							           "\n\t\t2. Display balance on screen" +
							           "\n\t\t3. Exit the system\n\n\n");
			          
			
					System.out.print("Please enter your choice: ");
					choice = input.nextInt();
					
					if (choice == 1)
						{
							System.out.print("\n\nPlease enter the amount you wish to withdraw: ");
							withdrawalAmount = input.nextFloat();
					
					        if (withdrawalAmount <= balance)
					            System.out.println("You have made a successful withdrawal. Your new balance is €" +
					                 String.format("%.2f",balance-withdrawalAmount));
					        else
					            System.out.println("You are attempting to withdraw more than your current balance! " +
					            	"Exiting system now ...."); 
						}
				    else if (choice == 2) 
					        System.out.println("\n\nYour current balance is €" + String.format("%.2f",balance));
					else
					        System.out.println("\n\nThank you for using the ATM  ..... goodbye");
					        
				}
			else
			    System.out.println("\n\nYou have entered an invalid PIN! Exiting system now ....");
	
		}
}


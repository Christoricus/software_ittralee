//Exercise4.java
/*This program uses a do-while loop to simulate the actions of an ATM*/

import java.util.Scanner;

public class Exercise4{
	 public static void main(String args[])
		{
			float balance=1000, deposit, withdrawal;
			char choice;
			
			Scanner input = new Scanner(System.in);
			
			do{
				System.out.print("****************ITT ATM*****************" +
					               "\n\n\nPlease choose from the following transaction types:" +
					               "\n\n'D' is deposit\n'W' is withdrawal\n'X' is Exit the system" +
					               "\n\nPlease enter your choice: ");
					               
			    choice = input.nextLine().charAt(0);
			    
					               
				switch(choice)
					{
						case 'D':
							System.out.print("\nPlease enter the amount you wish to deposit: ");
							deposit = input.nextFloat();
							balance += deposit;
							System.out.println("\n\nYour balance is now " + String.format("%.2f",balance));
							break;
							
						case 'W':
							System.out.print("\nPlease enter the amount you wish to withdraw: ");
							withdrawal = input.nextFloat();
							balance -= withdrawal;
							System.out.println("\n\nYour balance is now " + String.format("%.2f",balance));
							break;
						case 'X':
							System.out.println("\n\nThanks for using the system ... goodbye");
								
					}
				
				if(choice == 'W' || choice == 'D')
					{
						System.out.print("Please hit return to continue .....");
						input.nextLine();
						input.nextLine();
						System.out.println("\n\n\n\n");	
					}
						
			}while(choice != 'X');
		
		}
}
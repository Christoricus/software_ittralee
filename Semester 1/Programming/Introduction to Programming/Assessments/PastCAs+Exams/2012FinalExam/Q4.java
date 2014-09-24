//Q4.java
/*This program presents the user with a number of menu-options to enable them to perform
 currency conversions. A for loop is used for the main iteration process. The program
 includes some input validation to make the program more fool-proof*/

import java.util.Scanner;

public class Q4 {
	public static void main(String args[])
		{
			int choice,i;
			float euro,pounds;
			
			Scanner input = new Scanner(System.in);
			
			for(i=0;i<10;i=i) //this sets up an infinite for loop as i never changes
			{
			
			    System.out.print("\n\n\n\t\t========Currency Converter========" + 
			           "\n\n\t1. Convert Euro to British Pounds" +
			           "\n\n\t2. Convert British Pounds to Euro" +
			           "\n\n\t3. Quit\n\n\n\tEnter your choice: ");
			           
			    choice = input.nextInt();
			
			    while (choice < 1 || choice > 3)
				    {		    
				        System.out.print("Invalid choice - must be 1,2 or 3. Please re-enter: ");
				        choice = input.nextInt();
				    }
			    
			
			    switch(choice)
			    { 
			        case 1:
			            System.out.print("\n\nPlease enter amount in Euro: ");
			            euro = input.nextFloat();
			
			            while(euro<0)
				            {
				                System.out.print("\nInvalid Euro amount - please re-enter: ");
				                euro = input.nextFloat();
				            }
			
			            System.out.println("\nEUR" + euro + " is equivalent to " +
			                  String.format("%.2f",euro*0.919161) + " British Pounds");
			            	  
			            System.out.print("Press return to continue .....");
			            input.nextLine();
			            input.nextLine();
			            break;
			        case 2:
			            System.out.print("\n\nPlease enter amount in British Pounds: ");
			            pounds = input.nextFloat();
			
			            System.out.println("\n" + pounds + " British Pounds is equivalent to EUR" + 
			                  String.format("%.2f",pounds/0.919161));
			
			            System.out.print("Press return to continue .....");
			            input.nextLine();
			            input.nextLine();
			            break;
			        case 3:
			        	System.out.println("\nThank you for using the currency converter system. Goodbye.");
			    }
			    
			    if(choice==3) //breaks us out of the for loop when the user enters 3 as their choice
			    	break; 
			}
														
		}		
}


//Assess2CSolution.java
/* This program presents the user with a number of menu-options to enable them to perform
 weight conversions. A do-while loop is used for the main iteration process. The program
 includes input validation throughout to make the program a little more fool-proof*/


import java.util.Scanner;

public class Assess2CSolution{
	public static void main(String args[])
		{
			int choice;
			float ounces,pounds;
			
			Scanner input = new Scanner(System.in);
			
			
			do{
				System.out.print("\t\t*****Weight Converter*****\n\n\n\t\t" + 
                                   "1. Convert Ounces to Pounds and Ounces\n\t\t" +
                                   "2. Convert Pounds to Kilos\n\t\t" +
          						   "3. Quit\n\n\n\tPlease enter your choice: ");

				choice = input.nextInt();
				
				System.out.println("\n\n");
				
				while(choice<1 || choice>3)
					{
						System.out.print("Invalid choice!! Must be 1-3. Please re-enter: ");
						choice = input.nextInt();
					}
					
				switch(choice)
					{
						case 1:
							System.out.print("\n\nPlease enter a quantity in ounces: ");
							ounces = input.nextFloat();
							
							while(ounces<0)
								{
									System.out.print("Invalid quantity, please re-enter: ");
									ounces = input.nextFloat();
								}
								
							System.out.println("\n" + ounces + "oz is equivalent to " + ((int)ounces/16) + "lbs " + (ounces%16) + "oz");
							
							break;
							
						case 2:
							System.out.print("\n\nPlease enter a quantity in pounds: ");
							pounds = input.nextFloat();
							
							while(pounds<=0)
								{
									System.out.print("Invalid quantity, please re-enter: ");
									pounds = input.nextFloat();
								}
								
							System.out.println("\n" + pounds + "lbs is equivalent to " + String.format("%.3f",(pounds*2.2)) + "kg ");
							
							break;
					}
				
				if(choice!=3)
					{
						System.out.print("\n\nPlease hit return to continue: ");
						input.nextLine();
						input.nextLine();
						System.out.println("\n\n\n\n\n\n\n\n\n\n");
					}
				
				
			}while(choice!=3);
           	
			System.out.println("\n\nThanks for using the conversion system .... goodbye");	
		}
}


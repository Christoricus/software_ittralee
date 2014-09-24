//Exercise1.java
/*This program validates the users choice for a menu-based program and
 *also validates the radius and height values perfectly for the cylinder*/

import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[])
		{	
			char choice;
			String choiceAsString;
			Scanner input = new Scanner(System.in);

		    do {
				 displayMenu();
				 System.out.print("\n\n\nEnter your choice: ");
				 choiceAsString = input.nextLine().toUpperCase();

				 while(!choiceAsString.equals("A") && !choiceAsString.equals("B") 
				 	   && !choiceAsString.equals("C"))
					 {
					 	System.out.print("\nInvalid! Please re-enter your choice (A-C): ");
					    choiceAsString = input.nextLine().toUpperCase(); 
					 }
			
			     choice = choiceAsString.charAt(0);
			
				 switch (choice)
				 {
				     case 'A':
							cylinderArea();
							break;
				     case 'B':
							semicircleArea();
							break;
				     case 'C':
							break;
				     
				 }
		    } while (choice != 'C');
		    System.out.println("\n\nThanks for using the system - goodbye!\n\n");
		}

	public static void displayMenu()
		{
			System.out.print("\n\n\n\tA. Find area of cylinder");
			System.out.print("\n\tB. Find area of semicircle");
			System.out.print("\n\tC. Quit \n\n\n\n\n\n\n");	
		}

	public static void cylinderArea()
		{
			float radius,height;
			String radiusAsString,heightAsString;
			boolean valid=false;
			int numberOfDots=0,i;
			double radiusAsDouble=0,heightAsDouble=0;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("\n\nPlease enter the radius of the cylinder: ");
			radiusAsString = input.nextLine();
			
			while(!valid)
				{
					for(i=0;i<radiusAsString.length();i++)
						if((!Character.isDigit(radiusAsString.charAt(i)) && radiusAsString.charAt(i)!='.' ) ||
						   numberOfDots>1)
							break;
						else if(radiusAsString.charAt(i) == '.')
							numberOfDots++;
							
					if(i==radiusAsString.length() && i!=0 && numberOfDots<=1 && !radiusAsString.equals("."))
						{
							radiusAsDouble = Double.parseDouble(radiusAsString);
								
							if(radiusAsDouble >= -Float.MAX_VALUE && radiusAsDouble <= Float.MAX_VALUE)
								valid = true;
							else
								{
									System.out.print("\n\nInvalid! Please re-enter the radius of the cylinder: ");
									radiusAsString = input.nextLine();
								}			
						}
					else
						{
							System.out.print("\n\nInvalid! Please re-enter the radius of the cylinder: ");
							radiusAsString = input.nextLine();
						}
					numberOfDots=0;	
								
				}
			
			radius = (float)radiusAsDouble;
			
			//next block of code modified to validate the height
				
			valid= false; //need to reset this to false
			
			System.out.print("\nPlease enter the height of the cylinder: ");
			heightAsString = input.nextLine();
			
			
			while(!valid)
				{
					for(i=0;i<heightAsString.length();i++)
						if((!Character.isDigit(heightAsString.charAt(i)) && heightAsString.charAt(i)!='.' ) ||
						   numberOfDots>1)
							break;
						else if(heightAsString.charAt(i) == '.')
							numberOfDots++;
							
					if(i==heightAsString.length() && i!=0 && numberOfDots<=1 && !heightAsString.equals("."))
						{
							heightAsDouble = Double.parseDouble(heightAsString);
								
							if(heightAsDouble >= -Float.MAX_VALUE && heightAsDouble <= Float.MAX_VALUE)
								valid = true;
							else
								{
									System.out.print("\n\nInvalid! Please re-enter the height of the cylinder: ");
									heightAsString = input.nextLine();
								}			
						}
					else
						{
							System.out.print("\n\nInvalid! Please re-enter the height of the cylinder: ");
							heightAsString = input.nextLine();
						}
					numberOfDots=0;	
								
				}
			
			height = (float)heightAsDouble;
			
		    //the rest of this code is the same as before
		    
			System.out.println("\nArea of cylinder is " + String.format("%.2f m2",3.14*radius*radius*height));
		
			System.out.println("\n\nPlease hit return to continue ...... ");
			input.nextLine(); //consumes the \n ignored by nextFloat()
			input.nextLine(); //consumes the <CR> entered by the user
			System.out.println("\n\n\n\n\n\n");
		}

	public static void semicircleArea()
		{
			float radius;
			Scanner input = new Scanner(System.in);
			System.out.print("\n\nPlease enter the radius of the semicircle: ");
			radius = input.nextFloat();
			System.out.println("\nArea of semicircle is " + String.format("%.2f m2",3.14*radius*radius/2));
			
			System.out.println("\n\nPlease hit return to continue ...... ");
			input.nextLine();
			input.nextLine();
			System.out.println("\n\n\n\n\n\n");
		}

}			
			
			
			
			
			
			
			
			
			
			
			
		
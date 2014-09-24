//Exercise2.java
/*This program validates an arbitrary amount of PPS numbers and keeps a list of the valid ones*/

import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[])
		{	
			String PPS,validPPS="";
			boolean valid;
			int i;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a PPS number (return to exit): ");
			PPS = input.nextLine();
			
			while(!PPS.equals(""))
				{
					valid = false;
					while(!valid)
						{
							if((PPS.length()==8 || PPS.length()==9))
								{
									for(i=0;i<7;i++)
										if(!Character.isDigit(PPS.charAt(i)))
											break;
											
									if(i==7 && ((PPS.length()==8 && Character.isUpperCase(PPS.charAt(7))) ||
										(PPS.length()==9 && Character.isUpperCase(PPS.charAt(7)) &&
										 Character.isUpperCase(PPS.charAt(8)))))
										 	valid = true;
									else
										{
											System.out.print("Invalid! Please re-enter PPS number (return to exit): ");
											PPS = input.nextLine();
										}
								}
							else if(PPS.equals(""))
								break;
							else
								{
									System.out.print("Invalid! Please re-enter PPS number (return to exit): ");
									PPS = input.nextLine();
								}		
				
						}
					if(!PPS.equals(""))
						{
							validPPS += PPS + "\n";
							System.out.print("Please enter another PPS number (return to exit): ");
							PPS = input.nextLine();
						}
				}
			if(!validPPS.equals(""))	
				System.out.println("\n\nThe list of valid PPS numbers entered are:\n\n" + validPPS);
			else
				System.out.println("\n\nYou entered no valid PPS numbers!");
	
		}
}			
			
			
			
			
			
			
			
			
			
			
			
		
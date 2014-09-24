//Exercise2.java
/*This program uses a counter controlled while loop to give the user
 *a maximum of 3 attempts to enter the correct username/password
 *combination for gaining access to a system*/

import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[])
		{
			String username,password;
			int attempts=3;
			
			Scanner input = new Scanner(System.in);			
			
			while(attempts >= 1)
				{
					System.out.print("Please enter your username: ");
					username = input.nextLine();
					
				    System.out.print("Please enter your password: ");
					password = input.nextLine();
					
				    attempts--;
				    	
		            if(username.equals("t00012345")&&password.equals("java"))
						{
							System.out.println("\nWelcome to the system!");
							break;
						}
					else
						{
							if(attempts >= 1)
								System.out.println("\nInvalid username/password combination. " + 
									 attempts + " attempts remaining\n");
							else
								System.out.println("\nInvalid username/password combination. " + 
									 "IP address noted. Banned from re-entering for 24 hours");			
						}
						
								
				}		
								
		}		
}



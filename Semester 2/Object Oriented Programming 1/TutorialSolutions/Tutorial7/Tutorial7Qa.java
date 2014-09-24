//Tutorial7Qa.java
/*This program generates a random number between 1 and 100 and gives the user a maximum of 5 guesses at it. 
 *Then the outcome is displayed*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tutorial7Qa {
	public static void main(String args[])
		{	
			 int randomNumber, guessNumber, i=1;
			 boolean match=false;
			 
			 randomNumber = (int)(Math.random()*100) + 1;
			 JOptionPane.showMessageDialog(null,randomNumber);
			 
			 Scanner input = new Scanner(System.in);
			 
			 while(i<=5)
				 {
				 	System.out.print("Please enter your guess: ");
			 	 	guessNumber = input.nextInt();
			 	 	
			 	 	if(guessNumber == randomNumber)
				 	 	{
				 	 	  match = true;
				 	 	  break;
				 	 	}
				 	i++;	
				 }
				 
			 if(match)
			 	System.out.println("\n\nYou guessed the random number after " + i + " attempts");
			 else
			 	System.out.println("\n\nYou didn't guess the random number, which was " + randomNumber);
			 	
		}
}
				 
//Tutorial7Qb.java
/*This program generates a random number between 1 and 100 and gives the user a maximum of 5 guesses at it. 
 *This time the user is told after each guess whether they should go "higher" or "lower" with the next guess if
 *they are wrong. When the main loop finishes, the outcome is displayed*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tutorial7Qb {
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
				 	if(i!=5)
				 		if(guessNumber < randomNumber)
				 			System.out.print("Incorrect! You need to go higher.");
				 		else 
				 			System.out.print("Incorrect! You need to go lower.");
				 	i++;	
				 }
				 
			 if(match)
			 	System.out.println("\n\nYou guessed the random number after " + i + " attempts");
			 else
			 	System.out.println("\n\nYou didn't guess the random number, which was " + randomNumber);
			 	
		}
}
				 
	
			
		


	
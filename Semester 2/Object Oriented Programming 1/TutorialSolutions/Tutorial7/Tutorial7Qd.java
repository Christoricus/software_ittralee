//Tutorial7Qd.java
/*This program generates a random number between 1 and 100 and gives the user a maximum of 5 guesses at it. 
 *The user is told after each guess whether they should go "higher" or "lower" with the next guess if
 *they are wrong. When the main loop finishes, the user receives a customised message. In this version of the
 *program, the user's input is validated to ensure it is a whole number in the range 1-100 inclusive*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tutorial7Qd {
	public static void main(String args[])
		{	
			 int randomNumber, guessNumber, i=1;
			 boolean match=false;
			 String message="", guessAsString;
			 
			 randomNumber = (int)(Math.random()*100) + 1;
			 JOptionPane.showMessageDialog(null,randomNumber);
			 
			 Scanner input = new Scanner(System.in);
			 
			 while(i<=5)
				 {
				 	System.out.print("Please enter your guess: ");
			 	 	guessAsString = input.nextLine();
			 	 	
			 	 	while(guessAsString.length()<1 || (guessAsString.length()>2 && !guessAsString.equals("100")) ||
			 	 		  !Character.isDigit(guessAsString.charAt(0)) || guessAsString.equals("0") ||
			 	 		  (guessAsString.length()==2 && !Character.isDigit(guessAsString.charAt(1))))
			 	 		  {
			 	 		  	 System.out.print("Invalid! Please re-enter your guess: ");
			 	 			 guessAsString = input.nextLine();
			 	 		  }
			 	 	
			 	 	guessNumber = Integer.parseInt(guessAsString);	
			 	 	
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
			 	if(i == 1)
			 		message = "Congratulations! You have guessed the number after just 1 guess! Are you psychic?";
			 	else if(i == 2)
			 		message = "Congratulations! You have guessed the number after just 2 guesses! Excellent attempt!";
			 	else if(i == 3)
			 		message = "Congratulations! You have guessed the number after 3 guesses! Very good effort!";
			 	else if(i == 4)
			 		message = "Congratulations! You have guessed the number after 4 guesses! Good effort!";
			 	else
			 		message = "Congratulations! You have guessed the number after 5 guesses! Just about got there!";
			 	
			 else
			 	message = "Commiserations! The actual target number was " + randomNumber + ". You might win next time!";
			 
			 System.out.println("\n\n" + message);
			 	
		}
}
				 
			 
			
			 		
			 		
			 
			 
			
			
			
			
			
		


	
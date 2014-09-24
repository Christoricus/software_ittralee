//PS3Qe.java
/*This program uses a user-defined method to return a randomly generated String value
 *to simulate the game of rock, paper, scissors*/

import javax.swing.JOptionPane;

public class PS3Qe {
	public static void main(String args[])
		{	
			String userChoice,computerChoice,message;
			
			userChoice = JOptionPane.showInputDialog("Please enter your choice (rock,paper,scissors): ");
			
			computerChoice = computerChoice(); //generate the computers choice randomly
			
			message = "The computer's choice was " + computerChoice + " so ";
			
			if(!computerChoice.equals(userChoice)) //there was a winner
				if(computerChoice.equals("rock") && userChoice.equals("scissors") || 
			       computerChoice.equals("scissors") && userChoice.equals("paper") ||
			       computerChoice.equals("paper") && userChoice.equals("rock")) //computer wins
					 JOptionPane.showMessageDialog(null,message + "the game was won by the computer","Computer Wins!",JOptionPane.INFORMATION_MESSAGE);
			    else //user wins
			    	 JOptionPane.showMessageDialog(null,message + "the game was won by the user","User Wins!",JOptionPane.INFORMATION_MESSAGE);
			else //there was a draw
				JOptionPane.showMessageDialog(null,message + "the game was a draw","Game Drawn!",JOptionPane.INFORMATION_MESSAGE);

				
		}

	public static String computerChoice()
		{
			int randomNumber =  (int)(Math.random()*3) + 1;
			
			if(randomNumber == 1)
				return "rock";
			else if(randomNumber == 2)
				return "paper";
			else
				return "scissors";
		}

}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
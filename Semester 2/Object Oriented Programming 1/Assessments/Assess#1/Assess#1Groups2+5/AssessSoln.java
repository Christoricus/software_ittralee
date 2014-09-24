//AssessSoln.java
/*This program uses a user-defined method to determine the level of ESP a user has based on 
 *guessing some randomly-generated numbers.*/

import javax.swing.JOptionPane;

public class AssessSoln {
	public static void main(String args[])
		{	
			JOptionPane.showMessageDialog(null,"Your ESP level is " + ESPDetector(),"ESP Result",
				                          JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);		
		}
		
	public static String ESPDetector()
		{
			int randomNumber,userNumber,matches=0;
			String userNumberAsString;
			
			for(int i=1;i<=5;i++)
				{
				  randomNumber = (int)(Math.random()*5 + 1);
				  
				  userNumberAsString = JOptionPane.showInputDialog("Test " + i + " - Try to guess the random number " +
				  	                                               "\ngenerated between 1 and 5");
				  	                                               
				  userNumber = Integer.parseInt(userNumberAsString);
				  
				  if(userNumber == randomNumber)
				  	  matches++;
				  	
				}
				
			if(matches < 2)
				return "None";
			else if(matches == 2)
				return "Moderate";
			else if(matches == 3)
				return "Strong";
			else
				return "Extreme";		
					
		}			
}
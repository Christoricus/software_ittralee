//Exercise3.java
/*This program uses a user-defined method to determine whether or not the character entered
 *by the user is a digit or not*/

import javax.swing.JOptionPane;

public class Exercise3 {
	public static void main(String args[])
		{
		
			char character;
			String characterAsString;

			characterAsString = JOptionPane.showInputDialog("Please enter a keyboard " + 
			"character");
			
			character = characterAsString.charAt(0);			
											
			if(myIsDigit(character))
			      JOptionPane.showMessageDialog(null,"You entered a digit","Digit Test",
			      JOptionPane.PLAIN_MESSAGE);
			else
				  JOptionPane.showMessageDialog(null,"You did not enter a digit","Digit Test",
				  JOptionPane.PLAIN_MESSAGE);
				  
			System.exit(0);

		}

	public static boolean myIsDigit(char character)
	    {
		    if(character >= '0' && character <= '9')
		         return true;
		    else
		         return false;
	    }
	

}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
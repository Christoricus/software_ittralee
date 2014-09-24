//Exercise3.java
/*This program uses a pre-defined method from the Character class called isDigit() to
 *determine whether the character entered by the user was a digit or not*/

import javax.swing.JOptionPane;

public class Exercise3 {
	public static void main(String args[])
		{
			String characterAsString;
			char character;
			
			characterAsString = JOptionPane.showInputDialog("Please enter any character");
			character = characterAsString.charAt(0);
			
			if(Character.isDigit(character))
				JOptionPane.showMessageDialog(null,"You entered a digit","Digit test",
				JOptionPane.PLAIN_MESSAGE);
			else
				JOptionPane.showMessageDialog(null,"You did not enter a digit","Digit test",
				JOptionPane.PLAIN_MESSAGE);
						
            System.exit(0);											
		}		
}



//Tutorial3Qd.java
/*A program that uses a user-defined method called sameCharacter() to determine whether
 *the 2 characters entered by the user are identical*/

import javax.swing.JOptionPane;

public class Tutorial3Qd {
	public static void main(String args[]) 	
	{
	  String char1AsString,char2AsString;
	  char ch1,ch2;
	  
	  char1AsString = JOptionPane.showInputDialog("Please enter a single keyboard character");
	  ch1 = char1AsString.charAt(0);
	  
	  char2AsString = JOptionPane.showInputDialog("Please enter another single keyboard character");
	  ch2 = char2AsString.charAt(0);
	  
	  if(sameCharacter(ch1,ch2))
	  	JOptionPane.showMessageDialog(null,"The 2 characters you entered were identical",
	  	                              "Identical!",JOptionPane.INFORMATION_MESSAGE);
	  else
	  	JOptionPane.showMessageDialog(null,"The 2 characters you entered were different",
	  	                              "Different!",JOptionPane.INFORMATION_MESSAGE);
	  
	  System.exit(0);
	  	
	}
	
	public static boolean sameCharacter(char first,char second)
	{
		if(first==second)
			return true;
		else
			return false;
			
		//could also just code it as
		 
		//return (first==second);
		
	}
}
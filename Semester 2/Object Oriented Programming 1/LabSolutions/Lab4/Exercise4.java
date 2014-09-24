//Exercise4.java
/*This program uses a pre-defined method from the String class called equalsIgnoreCase() to
 *determine whether the username entered by the user is valid or not*/

import javax.swing.JOptionPane;

public class Exercise4 {
	public static void main(String args[])
		{
			String username, password;
			
			username = JOptionPane.showInputDialog("Please enter your username");
			password = JOptionPane.showInputDialog("Please enter your password");
			
			if(username.equalsIgnoreCase("Joe Bloggs") && password.equals("t123456"))
				JOptionPane.showMessageDialog(null,"Welcome to the system","Authentication",
				JOptionPane.PLAIN_MESSAGE);
			else
				JOptionPane.showMessageDialog(null,"Invalid username and/or password",
				"Authentication",JOptionPane.PLAIN_MESSAGE);
						
            System.exit(0);											
		}		
}



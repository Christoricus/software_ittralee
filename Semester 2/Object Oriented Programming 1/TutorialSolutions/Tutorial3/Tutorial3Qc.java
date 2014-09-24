//Tutorial3Qc.java
/*A program that uses a user-defined method called getUserName() to read in a
 *user-supplied name*/

import javax.swing.JOptionPane;

public class Tutorial3Qc {
	public static void main(String args[]) 	
	{
		String name;
		name = getUserName();
	    JOptionPane.showMessageDialog(null,"The name you entered was " + name,"",JOptionPane.PLAIN_MESSAGE);
	    System.exit(0);
		
	}
	
	public static String getUserName()
	{
		String name;
		name = JOptionPane.showInputDialog("Please enter your name");
		return name;
	}
}
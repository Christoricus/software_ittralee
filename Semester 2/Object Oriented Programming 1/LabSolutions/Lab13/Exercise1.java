//Exercise1.java
/*This program illustrates the use of some of the message constants for the
 *JOptionPane message dialog component*/

import javax.swing.JOptionPane;

public class Exercise1 {
	public static void main(String args[]) 
		{	 	
			 JOptionPane.showMessageDialog(null,"This message dialog uses an error message icon",
			 "Error!",JOptionPane.ERROR_MESSAGE);
			 
			 JOptionPane.showMessageDialog(null,"This message dialog uses a warning message " + 
			 "icon","Warning!",JOptionPane.WARNING_MESSAGE);
			 
			 JOptionPane.showMessageDialog(null,"This message dialog uses a question message " + 
			 "icon","Question!",JOptionPane.QUESTION_MESSAGE);
			 		
			 System.exit(0);		
		}
}






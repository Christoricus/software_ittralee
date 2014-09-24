//Exercise2.java
/*This program illustrates the use of some of the message constants for the
 *JOptionPane confirmation dialog component*/

import javax.swing.JOptionPane;

public class Exercise2 {
	public static void main(String args[]) 
		{	 	
			 int choice;
			 
			 choice = JOptionPane.showConfirmDialog(null,"Take your pick - yes, no or cancel");
			 
			 if(choice == JOptionPane.YES_OPTION)
			 	JOptionPane.showMessageDialog(null,"You chose yes","YES",
			 	JOptionPane.PLAIN_MESSAGE);
			 else if (choice == JOptionPane.NO_OPTION)
			 	JOptionPane.showMessageDialog(null,"You chose no","NO",
			 	JOptionPane.PLAIN_MESSAGE);
			 else if (choice == JOptionPane.CANCEL_OPTION)
			 	JOptionPane.showMessageDialog(null,"You chose cancel","CANCEL",
			 	JOptionPane.PLAIN_MESSAGE);
			 else  //must have just closed the window otherwise
			 	JOptionPane.showMessageDialog(null,"You closed the window without selecting",
			 	"CLOSE",JOptionPane.PLAIN_MESSAGE);
			 			 		
			 System.exit(0);		
		}
}






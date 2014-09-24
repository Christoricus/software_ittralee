//AssessSoln.java
/*This GUI program displays a list of names entered by the user*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AssessSoln{

	JTextField nameField;
	String nameList="";
	
	public AssessSoln()
		{	 
			 JFrame jFrameWindow = new JFrame("Name Collector");
			 			 			 
			 FlowLayout flowLayout = new FlowLayout();
			 
		     jFrameWindow.setLayout(flowLayout);
		     		     	     		 
			 jFrameWindow.setSize(300,100);
			 
			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
     		 JLabel promptLabel = new JLabel("Name:");
     		 				 
 			 jFrameWindow.add(promptLabel);
 			 
 			 promptLabel.setToolTipText("Enter the name of the student concerned into the text-field");
 			 
 			 nameField = new JTextField(20);
 			 			 		 
 			 jFrameWindow.add(nameField);	
 			 		 		 				 
			 TextFieldEventHandler handler = new TextFieldEventHandler();
			 
			 nameField.addActionListener(handler);
			 			 	 	 
			 jFrameWindow.setVisible(true);
		}	
	
	public static void main(String args[])
		{	 		
			 AssessSoln guiApp = new AssessSoln();
		}	 	 			 
			 		
	private class TextFieldEventHandler implements ActionListener{

		public void actionPerformed(ActionEvent e)
			{
				String name;
				int choice;
				
				name = nameField.getText();
				
				if(name.equals(""))
					{
						JOptionPane.showMessageDialog(null,"You must enter something into the " +
						"textfield!","Error",JOptionPane.ERROR_MESSAGE);
					}	
				else
					{
						nameList += name + "\n";
						choice = JOptionPane.showConfirmDialog(null,"Do you wish to enter more student names?");
						nameField.setText("");
						
						if(choice != JOptionPane.YES_OPTION)
						{
							
						    JOptionPane.showMessageDialog(null,"The list of names you entered is:\n\n" + 
						    nameList,"Result",JOptionPane.INFORMATION_MESSAGE);
						    System.exit(0);
						}
						    	
					}				
			}
	}
	
}







//AssessSoln.java
/*This GUI program determines and displays the velocity of an object
 *based on user-supplied kinetic-energy and mass values*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AssessSoln{

	JTextField KEField,massField;
	
	public AssessSoln()
		{	 
			 JFrame jFrameWindow = new JFrame("Velocity Calculator");
			 			 			 
			 FlowLayout flowLayout = new FlowLayout();
			 
		     jFrameWindow.setLayout(flowLayout);
		     		     	     		 
			 jFrameWindow.setSize(300,100);
			 
			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
     		 JLabel KELabel = new JLabel("Kinetic Energy:");
     		 				 
 			 jFrameWindow.add(KELabel);
 			 
 			 KEField = new JTextField(5);
 			 			 		 
 			 jFrameWindow.add(KEField);
 			 
 			 JLabel massLabel = new JLabel("Mass:");
     		 				 
 			 jFrameWindow.add(massLabel);
 			 
 			 massField = new JTextField(5);
 			 			 		 
 			 jFrameWindow.add(massField);
 			 		 		 				 
			 TextFieldEventHandler handler = new TextFieldEventHandler();
			 
			 massField.addActionListener(handler);
			 			 	 	 
			 jFrameWindow.setVisible(true);
		}	
	
	public static void main(String args[])
		{	 		
			 AssessSoln guiApp = new AssessSoln();
		}	 	 			 
			 		
	private class TextFieldEventHandler implements ActionListener{

		public void actionPerformed(ActionEvent e)
			{
				String KEAsString,massAsString;
				double KE,mass;
				
				KEAsString = KEField.getText();
				massAsString = massField.getText();
				
				if(KEAsString.equals("") || massAsString.equals(""))
					{
						JOptionPane.showMessageDialog(null,"You must enter something into both of these " +
						"textfields!","Error",JOptionPane.ERROR_MESSAGE);
					}	
				else
					{
						KE = Double.parseDouble(KEAsString);
						mass = Double.parseDouble(massAsString);
						
						if(KE<0 || mass <0)
							{
								JOptionPane.showMessageDialog(null,"Neither kinetic energy or mass can be negative!",
								"Error",JOptionPane.ERROR_MESSAGE);
					        }
					    else
					   		{
					   		    JOptionPane.showMessageDialog(null,"Velocity is " + String.format("%.3f",Math.pow((2*KE/mass),0.5))+"m/s",
								"Velocity",JOptionPane.INFORMATION_MESSAGE);
								KEField.setText("");
								massField.setText("");
					        } 
					        	    	
					}				
			}
	}
	
}







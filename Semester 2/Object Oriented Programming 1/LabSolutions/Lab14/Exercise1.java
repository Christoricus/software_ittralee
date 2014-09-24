//Exercise1.java
/*This program makes some modifications the JTextFieldOnJFrame.java program*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Exercise1{
	JTextField jTextField;
	
	public Exercise1()
		{
			 JFrame jFrameWindow = new JFrame("Adding a JTextField to a JFrame");		 
			 
			 FlowLayout flowLayout = new FlowLayout();

		     jFrameWindow.setLayout(flowLayout);
		     	     		 
			 jFrameWindow.setSize(400,100);

			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			 JLabel jLabel = new JLabel("Please enter your address:");
				 
 			 jFrameWindow.add(jLabel);
 			 
 			 jTextField = new JTextField(20);
 			 
 			 jTextField.setForeground(Color.GREEN);
 			 
 			 		 
 			 jFrameWindow.add(jTextField);
 			 
 			 TextFieldEventHandler handler = new TextFieldEventHandler();
 			 
 			 jTextField.addActionListener(handler);
 			 
			 jFrameWindow.setVisible(true);
		}
	
	
	
	public static void main(String args[])
		{	 		
			 Exercise1 guiApp = new Exercise1();
		}	 	 			 
			 	
		
	private class TextFieldEventHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
			{
				String address = jTextField.getText();
				JOptionPane.showMessageDialog(null,"Your address is " + address,"",
				JOptionPane.INFORMATION_MESSAGE);
			}
	}
}







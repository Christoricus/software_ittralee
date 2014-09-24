//Q3.java
/*This program changes the colour of the text in a text-field using buttons in
 *a GUI*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Q3{

	JTextField tNumberField;
	JButton redButton,blueButton;
	
	public Q3()
		{
			 JFrame jFrameWindow = new JFrame("Text Colours");			 
			 
			 FlowLayout flowLayout = new FlowLayout();

		     jFrameWindow.setLayout(flowLayout);
		     	     		 
			 jFrameWindow.setSize(200,100);

			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			 JLabel tNumberLabel = new JLabel("T-number:");
				 
 			 jFrameWindow.add(tNumberLabel);
 			 
 			 tNumberField = new JTextField(10);
 			 		 
 			 jFrameWindow.add(tNumberField);	 
 			 
 			 blueButton = new JButton("blue");
 			 redButton = new JButton("red");
 			 
 			 jFrameWindow.add(blueButton);
 			 jFrameWindow.add(redButton);
 			 
			 ButtonEventHandler handler = new ButtonEventHandler();
 			 
 			 blueButton.addActionListener(handler);
 			 redButton.addActionListener(handler);
 			 
			 jFrameWindow.setVisible(true);
		}
	
	public static void main(String args[])
		{	 		
			 Q3 guiApp = new Q3();
		}	 	 			 			 	
		
	private class ButtonEventHandler implements ActionListener{

		public void actionPerformed(ActionEvent e)
			{
				
				if(tNumberField.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null,"You must enter a value into the " +
						"textfield","Error",JOptionPane.ERROR_MESSAGE);
					}					
				else
					{
						if(e.getSource() == redButton)
								tNumberField.setForeground(Color.RED);
						else
						   	    tNumberField.setForeground(Color.BLUE);	
					}				
			}
	}
	
}







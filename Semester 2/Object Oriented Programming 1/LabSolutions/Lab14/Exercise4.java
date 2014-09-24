//Exercise4.java
/*This program performs conversions from pounds to kilos and from kilos to pounds using
 *a GUI*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Exercise4{

	JTextField poundsField;
	JTextField kilosField;
	
	public Exercise4()
		{
			 JFrame jFrameWindow = new JFrame("Weight Converter");			 
			 
			 FlowLayout flowLayout = new FlowLayout();

		     jFrameWindow.setLayout(flowLayout);
		     	     		 
			 jFrameWindow.setSize(300,100);

			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			 JLabel poundsLabel = new JLabel("Pounds:");
				 
 			 jFrameWindow.add(poundsLabel);
 			 
 			 poundsField = new JTextField(8);
 			 		 
 			 jFrameWindow.add(poundsField);
 			 
 			 JLabel kilosLabel = new JLabel("Kilos:");
				 
 			 jFrameWindow.add(kilosLabel);
 			 
 			 kilosField = new JTextField(8);
 			 
 			 jFrameWindow.add(kilosField);
 			 
 			 JButton convertButton = new JButton("Convert");
 			 
 			 jFrameWindow.add(convertButton);
 			 
			 ButtonEventHandler handler = new ButtonEventHandler();
 			 
 			 convertButton.addActionListener(handler);
 			 
			 jFrameWindow.setVisible(true);
		}
	
	
	
	public static void main(String args[])
		{	 		
			 Exercise4 guiApp = new Exercise4();
		}	 	 			 
			 	
		
	private class ButtonEventHandler implements ActionListener{

		public void actionPerformed(ActionEvent e)
			{
				String poundsAsString,kilosAsString;
				double kilos,pounds;
				
				if((poundsField.getText().equals("") && kilosField.getText().equals(""))
				|| (!poundsField.getText().equals("") && !kilosField.getText().equals("")))
					{
						JOptionPane.showMessageDialog(null,"You must enter a value into one " +
						"field and one field only","Error",
						JOptionPane.ERROR_MESSAGE);
						
						poundsField.setText("");
						kilosField.setText("");
					}					
				else
					{
						if(poundsField.getText().equals(""))
							{
								kilosAsString = kilosField.getText();
								
								kilos = Double.parseDouble(kilosAsString);
								
								pounds = kilos * 2.2;
									
								poundsField.setText("" + String.format("%.4f",pounds));
							}
						else
							{
								poundsAsString = poundsField.getText();
								
								pounds = Double.parseDouble(poundsAsString);
								
								kilos = pounds / 2.2;
								
								kilosField.setText("" + String.format("%.4f",kilos));
							}	
						
					}	
				
			}
	}
	
}







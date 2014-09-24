//Exercise3.java
/*This program builds on the functionality of the JButtonOnJFrame.java program*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Exercise3{

	JTextField nameField;
	JTextField ageField;
	String nameOldest;
	JFrame jFrameWindow;
	int totalProcessed=0,totalAge=0,oldestAge=0,youngestAge=0;
	String names[] = new String[100];
	int ages[] = new int[100];
	
	public Exercise3()
		{
			 jFrameWindow = new JFrame("Enter Details");			 
			 
			 FlowLayout flowLayout = new FlowLayout();

		     jFrameWindow.setLayout(flowLayout);
		     	     		 
			 jFrameWindow.setSize(300,100);

			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			 JLabel nameLabel = new JLabel("Name:");
				 
 			 jFrameWindow.add(nameLabel);
 			 
 			 nameField = new JTextField(15);
 			 
 			 TextFieldEventHandler tfHandler = new TextFieldEventHandler();
 
 			 nameField.addActionListener(tfHandler);
 			 
 			 jFrameWindow.add(nameField);
 			 
 			 JLabel ageLabel = new JLabel("Age:");
				 
 			 jFrameWindow.add(ageLabel);
 			 
 			 ageField = new JTextField(3);
 			 
 			 jFrameWindow.add(ageField);
 			 
 			 JButton submitButton = new JButton("Submit");
 			 
 			 jFrameWindow.add(submitButton);
 			 
			 ButtonEventHandler handler = new ButtonEventHandler();
 			 
 			 submitButton.addActionListener(handler);
 			 
			 jFrameWindow.setVisible(true);
		}
	
	
	
	public static void main(String args[])
		{	 		
			 Exercise3 guiApp = new Exercise3();
		}	 	 			 
			 	
		
	private class ButtonEventHandler implements ActionListener{

		public void actionPerformed(ActionEvent e)
			{

				String ageAsString;

				float averageAge;
				int choice;
				String namesAboveAverageAge = "";
				
				names[totalProcessed] = nameField.getText();
				
				if(!names[totalProcessed].equals(""))
					{
						ageAsString = ageField.getText();
						ages[totalProcessed] = Integer.parseInt(ageAsString);
						totalAge += ages[totalProcessed];

						
						if(ages[totalProcessed] > oldestAge)
							{
								oldestAge = ages[totalProcessed];
								nameOldest = names[totalProcessed];
							}
						
						if(totalProcessed == 0)
							{
								youngestAge = ages[totalProcessed];
							}
						else if(ages[totalProcessed] < youngestAge)
							youngestAge = ages[totalProcessed];
							
						totalProcessed++;
						
					}
				
				nameField.setText("");
				ageField.setText("");	
				
				choice = JOptionPane.showConfirmDialog(null,"More details to enter?","",
				JOptionPane.YES_NO_OPTION);
				
				if(choice == JOptionPane.NO_OPTION)
					{
						jFrameWindow.setVisible(false);
						if(totalProcessed != 0)
							{
								averageAge = (float)totalAge/totalProcessed;
								
								for(int i = 0; i < totalProcessed; i++)
									{
										if(ages[i] > averageAge)
											{
												namesAboveAverageAge += names[i] + ", ";
											}
									}
								
			
								JOptionPane.showMessageDialog(null,"Average age: " +
								averageAge + "\nOldest person: " + nameOldest + "\nYoungest" +
								" age: " + youngestAge + "\n\nThe following people are above" +
								" the average age: \n\n" + namesAboveAverageAge,"Statistics",
								JOptionPane.INFORMATION_MESSAGE);
							}
						else
							{						
								JOptionPane.showMessageDialog(null,"You entered no details" + 
								"\nThanks for using the system - goodbye!","Statistics",
								JOptionPane.INFORMATION_MESSAGE);		
							}
						System.exit(0);
					}	
				
			}
	}
	private class TextFieldEventHandler implements ActionListener{

		public void actionPerformed(ActionEvent e)
			{
				ageField.requestFocus();
			}
	}	
	
}







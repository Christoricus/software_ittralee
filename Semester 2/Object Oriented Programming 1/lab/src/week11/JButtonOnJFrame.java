package week11;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class JButtonOnJFrame {
	
	JTextField nameField;
	JTextField ageField;
	String nameOldest;
	JFrame frame;
	int totalProcessed = 0, totalAge = 0, oldestAge = 0;
	
	public JButtonOnJFrame()
	{
		frame = new JFrame("Enter Details");
		FlowLayout layout = new FlowLayout();
		
		frame.setLayout(layout);
		frame.setSize(300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel nameLabel = new JLabel("Name:");
		frame.add(nameLabel);
		nameField =  new JTextField(15);
		frame.add(nameField);
		
		JLabel ageLabel =  new JLabel("Age:");
		frame.add(ageLabel);
		ageField =  new JTextField(3);
		frame.add(ageField);
		
		JButton submitButton =  new JButton("Submit");
		frame.add(submitButton);
		
		ButtonEventHandler handler = new ButtonEventHandler();
		submitButton.addActionListener(handler);
		
		frame.setVisible(true);
		frame.setResizable(false);
		
	}
	
	public static void main(String[] args)
	{
		//JButtonOnJFrame guiApp =  new JButtonOnJFrame();
		new JButtonOnJFrame();
	}
	
	
	private class ButtonEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String name;
			String ageAsString;
			int age = 0;
			float averageAge;
			int choice;
			
			name =  nameField.getText();
			
			if (!name.equals(""))
			{
				ageAsString = ageField.getText();
				age = Integer.parseInt(ageAsString);
				totalAge += age;
				totalProcessed++;
				
				if (age > oldestAge)
				{
					oldestAge = age;
					nameOldest = name;
				}
			}
			
			nameField.setText("");
			ageField.setText("");
			
			choice = JOptionPane.showConfirmDialog(null, "More details to enter?", "", JOptionPane.YES_NO_OPTION);
			
			if (choice == JOptionPane.NO_OPTION)
			{
				frame.setVisible(false);
				
				if (totalProcessed != 0)
				{
					averageAge = (float) totalAge/totalProcessed;
					JOptionPane.showMessageDialog(null, "Average age: " + averageAge + "\nOldest Person: "
							+ nameOldest, "Statistics", JOptionPane.INFORMATION_MESSAGE);
				} else
					JOptionPane.showMessageDialog(null, "You entered no details" + "\nThanks for using the system"
							+ " - goodbye!", "Statistics", JOptionPane.INFORMATION_MESSAGE );
				
				
				System.exit(0);
			
			}
		}
	}

}

package week11;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;


public class Lab14Exercise3 {

	JTextField nameField;
	JTextField ageField;
	JFrame frame;
	
	String[] nameAverage =  new String[10];
	int[] ageAverage = new int[10];
	
	String nameOldest, namesAboveAverage = "";
	int totalProcessed, totalAge, oldestAge, youngestAge;

	public Lab14Exercise3()
	{
		frame = new JFrame("Enter Details");
		FlowLayout layout = new FlowLayout();

		frame.setLayout(layout);
		frame.setSize(350, 100);
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

		EventHandler handler1 = new EventHandler();


		ButtonEventHandler handler = new ButtonEventHandler();
		nameField.addActionListener(handler1);
		submitButton.addActionListener(handler);

		frame.setVisible(true);
		frame.setResizable(false);

	}

	public static void main(String[] args)
	{
		//Lab14Exercise3 guiApp =  new Lab14Exercise3();
		new Lab14Exercise3();
	}

	private class EventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//if ( e.getSource() == nameField) //redundant
			ageField.requestFocus();
		}
	}


	private class ButtonEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String name;
			String ageAsString;
			int age = 0;
			float averageAge = 0f;
			int choice;

			name =  nameField.getText();

			if (!name.equals(""))
			{
				ageAsString = ageField.getText();
				age = Integer.parseInt(ageAsString);
				totalAge += age;
				totalProcessed++;

				nameAverage[totalProcessed] = name;
				ageAverage[totalProcessed] = age;

				if ( totalProcessed == 1 ) {
					oldestAge = age;
					youngestAge = age;
					nameOldest = name;
				} else if ( age > oldestAge ) {
					oldestAge = age;
					nameOldest = name;
				} else if ( age < youngestAge ) {
					youngestAge = age;
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
					//int totAverage = 0;

					averageAge = (float) totalAge/totalProcessed;
					for ( int i = 0; i < ageAverage.length; i++)
					{

						if ( ageAverage[i] >  averageAge ) {
							namesAboveAverage += nameAverage[i] + ", ";
							//totAverage++;
						}

					}			

					JOptionPane.showMessageDialog(null, "Average age: " + averageAge + "\nOldest Person: "
							+ nameOldest + "\nYoungest age: " + youngestAge + "\n\nThe following people are above the average age \n"
							+ namesAboveAverage, "Statistics", JOptionPane.INFORMATION_MESSAGE);

				} else
					JOptionPane.showMessageDialog(null, "You entered no details" + "\nThanks for using the system"
							+ " - goodbye!", "Statistics", JOptionPane.INFORMATION_MESSAGE );


				System.exit(0);

			}
		}
	}


}

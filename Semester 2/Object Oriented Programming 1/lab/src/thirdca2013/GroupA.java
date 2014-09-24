package thirdca2013;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GroupA {

	//Global Variables
	JTextField nameField;
	JFrame frame;
	String allNames = "";

	public GroupA()
	{
		frame = new JFrame("Name Collector");
		frame.setSize(300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);

		JLabel name = new JLabel("Name:");
		frame.add(name);

		nameField = new JTextField(15);
		frame.add(nameField);

		nameField.setToolTipText("Enter the name of the student concerned in the text-field");

		JTextFieldHandler handler = new JTextFieldHandler();
		nameField.addActionListener(handler);

		frame.setVisible(true);

	}

	public static void main(String[] args)
	{
		new GroupA();
	}

	private class JTextFieldHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String name =  nameField.getText();
			int choice;
			
			if (name.equals(""))
			{
				JOptionPane.showMessageDialog(null, "You must enter something into the textfield!",
						"Error", JOptionPane.ERROR_MESSAGE);

			} else {

				allNames += name + "\n";

				choice = JOptionPane.showConfirmDialog(null, "Do you wish to enter more names?", "Select an Option"
						, JOptionPane.YES_NO_CANCEL_OPTION );

				if ( choice != JOptionPane.YES_OPTION )
				{
					frame.setVisible(false);
					
					JOptionPane.showMessageDialog(null, "The list of names you entered is: \n"
							+ allNames, "Result", JOptionPane.INFORMATION_MESSAGE );

					System.exit(0);
				
				} else
					nameField.setText("");

			}
		}
	}

}

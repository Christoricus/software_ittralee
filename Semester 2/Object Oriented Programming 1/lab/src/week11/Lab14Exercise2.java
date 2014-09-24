package week11;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Lab14Exercise2 {

	JTextField user;
	JPasswordField pass;

	Lab14Exercise2()
	{
		//Create the frame
		JFrame frame = new JFrame("Authentication");
		FlowLayout layout = new FlowLayout();

		//Set the window
		frame.setLayout(layout);
		frame.setSize(450, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Set labels
		JLabel username = new JLabel("Username: ");
		JLabel password = new JLabel("Password: ");

		//Set input field
		user = new JTextField(10);
		pass = new JPasswordField(10);

		//Add the labels and input fields to the frame
		frame.add(username);  //add username label
		frame.add(user);	//add username input field
		frame.add(password); //add password label
		frame.add(pass);	//add password input field




		//Handling the event
		JTextFieldEventHandler handler =  new JTextFieldEventHandler();
		user.addActionListener(handler);
		pass.addActionListener(handler);

		//Set the window to visible and not resizable
		frame.setVisible(true);
		frame.setResizable(false);

	}

	//Create the GUI app in the main
	public static void main(String[] args)
	{

		new Lab14Exercise2();

	}

	private class JTextFieldEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if ( e.getSource() == user ) //If user presses enter focus in to password input field
				pass.requestFocus();
			
			else
			{
				String username = user.getText();
				char[] password = pass.getPassword();
				String pass = new String(password);

				if (username.equals("Joe Bloggs") && pass.equals("123abc"))
					JOptionPane.showMessageDialog(null, "Welcome to the system " + username 
							, "Authenticated", JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null, "Invalid username/password combination" 
							, "Not Authenticated", JOptionPane.ERROR_MESSAGE);
			}

		}
	}

}

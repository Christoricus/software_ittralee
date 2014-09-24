//Exercise2.java
/*This program uses a text-field and a password-field to retrieve a username/password 
 *combination from the user and decide if it is valid*/

//using the shorthand * to save us lots of typing time
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Exercise2{
	//the "global" object references (needed by actionPerformed())
	JTextField usernameField;
	JPasswordField passwordField;
	
	public Exercise2()
		{
			 JFrame jFrameWindow = new JFrame("Authentication");			 
			 
			 FlowLayout flowLayout = new FlowLayout();

		     jFrameWindow.setLayout(flowLayout);
		     	     		 
			 jFrameWindow.setSize(400,100);

			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			 JLabel usernameLabel = new JLabel("Username:");
				 
 			 jFrameWindow.add(usernameLabel);
 			 
 			 usernameField = new JTextField(10);
 			 
 			 jFrameWindow.add(usernameField);
 			 
 			 JLabel passwordLabel = new JLabel("Password:");
				 
 			 jFrameWindow.add(passwordLabel);
 			 
 			 passwordField = new JPasswordField(10);
 			 
 			 jFrameWindow.add(passwordField);
 			 
 			 TextFieldEventHandler handler = new TextFieldEventHandler();
 			 
 			 //must register an ActionListener for each field here
 			 usernameField.addActionListener(handler);
 			 passwordField.addActionListener(handler);
 			 
			 jFrameWindow.setVisible(true);
		}
	
	
	
	public static void main(String args[])
		{	 		
			 Exercise2 guiApp = new Exercise2();
		}	 	 			 
			 	
		
	private class TextFieldEventHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
			{
				//if the text-field triggered the event
				if(e.getSource() == usernameField)
					{
						//set the focus to the password field
						passwordField.requestFocus();
					}
				//if the password field triggered the event (this could be an if-else)
				if(e.getSource() == passwordField)
					{
						//interestingly, getPassword() returns a char[] rather than a String
						char[] passwordCharacters = passwordField.getPassword();
						
						//converting the char[] to a String
						String passwordText = new String(passwordCharacters);
						
						if(usernameField.getText().equals("Joe Bloggs") && 
						passwordText.equals("123abc"))
							JOptionPane.showMessageDialog(null,"Welcome to the system " +
							usernameField.getText(),"Authenticated",
							JOptionPane.INFORMATION_MESSAGE);
						else
							JOptionPane.showMessageDialog(null,"Invalid username/password " +
							"combination","Not authenticated",JOptionPane.INFORMATION_MESSAGE);
					}				
				
			}
	}
}







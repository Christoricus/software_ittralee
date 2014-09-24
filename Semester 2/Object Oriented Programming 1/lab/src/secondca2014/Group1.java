package secondca2014;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class Group1 {

	public static void main(String[] args)
	{
		String username = "", password = "";
		boolean valid = false;
		int j, digitCount = 0;

		JTextArea textArea = new JTextArea();
		Font myFont = new Font("monospaced", Font.PLAIN, 11);

		textArea.setFont(myFont);

		textArea.setText("The valid username/password combinations are: \n\n");

		for (int i = 1; i <= 5; i++)
		{
			//username = JOptionPane.showInputDialog("Please enter username " + i);
			//password = JOptionPane.showInputDialog("Please enter password " + i);

			valid = false;

			while (!valid)
			{
				username = JOptionPane.showInputDialog("Please enter username " + i);
				
				if ( !username.equals("") && username.length() <= 25) 
				{

					password = JOptionPane.showInputDialog("Please enter password " + i);

					if (password.length() > 7 && password.length() < 16 )
					{
						for (j = 0; j < password.length(); j++)
						{
							if ( !Character.isDigit(password.charAt(j)) && !Character.isLetter(password.charAt(j))
									&& digitCount < 3 )
								break;

							else if ( Character.isDigit(password.charAt(j)))
								digitCount++;
						}

						if (j == password.length())
						{
							if ( digitCount >= 3 )
								valid = true;
							else
								password = JOptionPane.showInputDialog("Invalid! Must have atleast 3 digits- please re-enter password " + i);

						} else 
							password = JOptionPane.showInputDialog("Invalid! Must only contain letters/digits- please re-enter password " + i);

						//reset digit count to 0
						digitCount = 0;


					} else
						password = JOptionPane.showInputDialog("Invalid password length! Please re-enter password " + i);

				
				} else
					username = JOptionPane.showInputDialog("Invalid username! Please re-enter username " + i);

			} // end of validating while loop


			textArea.append( String.format("%-25s %s \n", username, password ));

		} //end of counter for loop 


		JOptionPane.showMessageDialog(null, textArea, "Valid Combinations", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);

	}

}

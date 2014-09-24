package week7;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class EmailAddressValidation {
	
	public static void main(String[] args)
	{
		String email, validEmail = "";
		
		JTextArea textArea = new JTextArea();
		Font myFont = new Font("monospaced", Font.PLAIN, 16 );
		
		textArea.setFont(myFont);
		
		for (int i = 1; i <= 5; i++)
		{
			email = JOptionPane.showInputDialog("Please enter your IT Tralee email address " + i);
			
			
			while( !isValidEmail(email) )
			{
				email = JOptionPane.showInputDialog("Invalid! Please enter your IT Tralee email address " + i);

			}
			
			validEmail += email + "\n";
			
			
			
		}
		textArea.append(validEmail);
		
		JOptionPane.showMessageDialog( null, textArea
				, "Valid Emails", JOptionPane.INFORMATION_MESSAGE );
		
		
		System.exit(0);
		
	}
	
	public static boolean isValidEmail(String email)
	{
		boolean valid = false;
		int j, dotLocation = 0;
		String firstname, lastname, firstnameLastname;
		
		firstnameLastname = email.substring(0, email.length()-12 );
		dotLocation = firstnameLastname.indexOf('.');
		
		if (email.endsWith("@ittralee.ie"))
		{
			if (dotLocation != -1)
			{
				
				firstname = firstnameLastname.substring(0, dotLocation);
				lastname = firstnameLastname.substring(dotLocation+1, email.length()-12);
				
				if (!firstname.equals("") && Character.isUpperCase(firstname.charAt(0)))
				{
					for (j = 1; j < firstname.length(); j++)
					{
						if ( !Character.isLowerCase(firstname.charAt(j)))
							break;
					}
					
					if ( j == firstname.length() 
							&& !lastname.equals("") && Character.isUpperCase(lastname.charAt(0)))
					{
						for ( j = 1; j < lastname.length(); j++)
						{
							if ( !Character.isLowerCase(lastname.charAt(j)))
								break;
						}
						
						if (j == lastname.length())
							valid = true;
					}
					
				}
				
			}								
			
		} // end of "@ittralee.ie" if statement
		
		return valid;
		
	}

}

package week2;
import javax.swing.JOptionPane;

public class Lab4Exercise4 {
	
	public static void main( String[] args )
	{
		String username = "Joe Bloggs";
		String password = "t123456";
		String message = "";
		
		String usrname = JOptionPane.showInputDialog( "Please enter your username" );
		String pass = JOptionPane.showInputDialog( "Please enter your password" );
		
		if( username.equalsIgnoreCase(usrname) && password.equals(pass) )
		{
			message = "Welcome to the system";
		} else {
			
			message = "Invalid username/password";
		}
		
		JOptionPane.showMessageDialog( null
				, message
				, "Authentication"
				, JOptionPane.PLAIN_MESSAGE );
	
		System.exit(0);
	}
	

}

package week4;
import javax.swing.JOptionPane;

public class Lab7Exercise4 {

	public static void main( String[] args )
	{
		String number, message;
		do {
			number = JOptionPane.showInputDialog( "Please enter an integer" );
			if( number == "" ) { break; }
			
			int num = Integer.parseInt( number );

			if( !isEven( num ) ) { message = "You entered an odd number"; }
			else { message = "You entered an even number"; }

			JOptionPane.showMessageDialog( null
					, message
					, "Even Test"
					, JOptionPane.INFORMATION_MESSAGE );


		} while( number != ""  );

		System.exit(0);

	}

	public static boolean isEven( int num )
	{
		return (num % 2 == 0);
	}

}

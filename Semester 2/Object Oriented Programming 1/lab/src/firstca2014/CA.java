// CA.java
/* Nazmul Alam
 * T00152975
 * This program calculates the octet between a number from 0 and 255;
 */

package firstca2014;
import javax.swing.JOptionPane;

public class CA {

	public static void main( String[] args )
	{
		String message;

		String ocetAsString = JOptionPane.showInputDialog( "Please enter an octet value" );


		if( !validOctet( ocetAsString ) ) { message = "You entered an invalid octet"; }

		else { message = "You entered a valid octet"; }


		JOptionPane.showMessageDialog( null
				, message
				, "Octet Validation Result" 
				, JOptionPane.INFORMATION_MESSAGE );


		System.exit(0);


	}

	public static boolean validOctet( String s )
	{


		boolean valid = false;  

		if( s.length() > 0 && s.length() <= 3) {

			boolean foundCharacter = false;
			String b="";

			for( int i = 0; i < s.length(); i++ )
			{
				char a = s.charAt(i);
				//foundCharacter = foundCharacter ||  !Character.isDigit(a);
				foundCharacter =  !Character.isDigit( a );
				
				
				//System.out.println( String.valueOf( foundCharacter ) );
			}

			//System.out.print( String.valueOf( foundCharacter ) );
			if ( foundCharacter )
			{ // invalid }
				valid = false;
			}

			else 
			{
				// valid
				int octet = Integer.parseInt( s );

				if( octet > 0 && octet < 256 ) { valid = true; }

			}
			 
			/*
			for( int i = 0; i < s.length(); i++ )
			{
				char a = s.charAt(i);
				//foundCharacter = foundCharacter ||  !Character.isDigit(a);
				if( Character.isDigit( a ) ) {
					b += a;
				}
				
				if(b.length()==s.length())
				{
					int octet = Integer.parseInt( s );

					if( octet > 0 && octet < 256 ) { valid = true; }

				
			}
		*/

		}
		return valid;

	}

}

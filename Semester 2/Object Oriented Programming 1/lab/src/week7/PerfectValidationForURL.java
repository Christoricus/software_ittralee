package week7;
import javax.swing.JOptionPane;

public class PerfectValidationForURL {
	
	public static void main(String[] args)
	{
		boolean valid;
		String URL, validURLs = "";
		int i;
		
		URL = JOptionPane.showInputDialog("Please enter a URL (x to exit): ");
		
		while (!URL.equalsIgnoreCase("x"))
		{
			valid = false;
			
			while (!valid)
			{
				if (URL.startsWith("www.") && URL.endsWith(".com"))
				{
					for (i = 4; i < URL.length()-4; i++)
					{
						if ( !Character.isDigit(URL.charAt(i)) && !Character.isLetter(URL.charAt(i)) )
							break;
					}
					
					if (i == URL.length()-4 && i != 4)
					{
						valid = true;
						
					} else
						URL = JOptionPane.showInputDialog("Invalid! Please re-enter a URL (x to exit): ");

					
				} else if (URL.equalsIgnoreCase("x"))
					break;
				else
					URL = JOptionPane.showInputDialog("Invalid! Please re-enter a URL (x to exit): ");

				
			} //end of validating while loop
			
			if (!URL.equalsIgnoreCase("x"))
			{
				validURLs += URL + "\n";
				URL = JOptionPane.showInputDialog("Please enter another URL (x to exit): ");

			}
		
		} //end of while of -- terminated by x
		
		
		//display the output
		if (!validURLs.equalsIgnoreCase("x"))
		{
			JOptionPane.showMessageDialog(null, "The list of valid URLs entered are: \n\n" + validURLs
					, "Valid URL", JOptionPane.INFORMATION_MESSAGE );
		} else
			JOptionPane.showMessageDialog(null, "There were no valid URLs!", "Valid URL", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
		
	}

}

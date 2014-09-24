package week7;
import javax.swing.JOptionPane;

public class Lab10Exercise1 {
	
	public static void main(String[] args)
	{
		boolean valid, perfect = false;
		String time, message = "";
		int j, hours = 0, minutes = 0, colon = 0;
		
		for (int i = 1; i <= 5; i++) //12:34
		{
			time = JOptionPane.showInputDialog("Iteration " + i + ": Please enter a time in the form of hh:mm");
			
			valid = false;
			
			while (!valid)
			{
				if (time.length() == 5 && !time.equals("") && time.charAt(2) == ':')
				{
					colon = 1;
					for (j = 0; j < time.length(); j++ )
					{
				
						if (!Character.isDigit(time.charAt(j)) && (!Character.isLetter(time.charAt(j)) || colon > 1) )
						{
							perfect = false;
							break;						
						} else
							perfect = true;
					}
					
					hours = Integer.parseInt(time.substring(0, 2));
					minutes = Integer.parseInt(time.substring(2));
					
					if (j == time.length() && perfect && (hours >= 0 && hours <= 24) 
							&& (minutes >= 0 && minutes <= 59) )
					{
						valid = true;
					
					} else
						time = JOptionPane.showInputDialog("Iteration " + i + ": Invalid! Please enter a time in the form of hh:mm");				
					
				} else
					time = JOptionPane.showInputDialog("Iteration " + i + ": Invalid! Please enter a time in the form of hh:mm");
				
				colon = 0; //resetting colon to 0
			}
			
			if(hours <= 11 ) 
				message = "Good Morning";
			else if (hours <= 17 ) 
				message = "Good Afternoon";
			else
				message = "Good Evening";
			
			JOptionPane.showMessageDialog(null, message, "Time Validator", JOptionPane.INFORMATION_MESSAGE);
			
		} // end of for loop -- iterates 5 times
		
		
		System.exit(0);
	}

}

package week7;
import javax.swing.JOptionPane;

public class Lab10Exercise4 {
	
	public static void main(String[] args)
	{
		String s, yearString, sixtys = "";
		//int count = 1; //get away without this
		int year = 0;
		
		s = JOptionPane.showInputDialog("Please enter a date dd-mm-yyyy (x to exit)");
		
		while ( !s.equalsIgnoreCase("x"))
		{
			while ( !isValidDateOfBirth(s) && !s.equals("x")) //added extra test here
			{
				s = JOptionPane.showInputDialog("Invalid! Please re-enter a date dd-mm-yyyy (x to exit)");
			}
			
			if (!s.equalsIgnoreCase("x"))
			{
				yearString = s.substring(6,s.length()); //moved this code from above to here
				year = Integer.parseInt(yearString);
				
				if ( year > 1959 && year < 1970 )
					sixtys += s + "\n";
					
				s = JOptionPane.showInputDialog("Please enter another date dd-mm-yyyy (x to exit)");

			} else //if ( s.equalsIgnoreCase("x")) ... just a redundant test here
				break;
			
			
			//count++;
		}
		
		JOptionPane.showMessageDialog(null, "The 1960s dates are: \n\n" + sixtys, "1960s Dates", JOptionPane.INFORMATION_MESSAGE );
		
		System.exit(0);
		
	}
	
	public static boolean isValidDateOfBirth(String s)
	{
		boolean valid = false;
		String day, month, year;       //dd-mm-yyyy = 10
		int pos1, pos2;
		int date, months, years;
		
		pos1 = s.indexOf('-');
		pos2 = s.lastIndexOf('-');
		
		if (s.length() == 10 && pos1 == 2 && pos2 == 5 ) //changed some of the tests here
		{
			day = s.substring(0, pos1);
			month = s.substring(pos1+1, pos2); //changed to pos2
			year = s.substring(pos2+1, s.length());
			
			if ( Character.isDigit(day.charAt(0)) && Character.isDigit(day.charAt(1))  // day
					&& Character.isDigit(month.charAt(0)) && Character.isDigit(month.charAt(1)) //month
					&& Character.isDigit(year.charAt(0)) && Character.isDigit(year.charAt(1)) //year
					&& Character.isDigit(year.charAt(2)) && Character.isDigit(year.charAt(3)) )
			{
				date = Integer.parseInt(day);
				months = Integer.parseInt(month);
				years = Integer.parseInt(year);
				
				if ( date > 0 && date <= 31 // you can do a little more validation here to make sure that invalid dates such as 31/04/1999 are rejected
						&& months > 1 && months <= 12
						&& years > 0 && years <= 9999 ) {
					
					valid = true;
				}
			}
		}
		
		return valid;
	}

}

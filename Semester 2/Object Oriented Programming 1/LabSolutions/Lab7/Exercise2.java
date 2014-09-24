//Exercise2.java
/*This program uses a user-defined method to determine the number of days in a particular
 *month*/

import javax.swing.JOptionPane;

public class Exercise2 {
	public static void main(String args[])
		{
		
			int monthNumber;
			String monthNumberAsString;

			monthNumberAsString = JOptionPane.showInputDialog("Please enter the number of a" + 
			" month (1-12)");
			
			monthNumber = Integer.parseInt(monthNumberAsString);
											
			if(numberDaysIn(monthNumber) != 0)
			      JOptionPane.showMessageDialog(null,"There are " + numberDaysIn(monthNumber) + 
			      " days in this month");
			else
				  JOptionPane.showMessageDialog(null,"\n\nInvalid - you must enter a month " +
				  "number between 1 and 12!");
				  
		    System.exit(0);

		}

	public static int numberDaysIn(int monthNum)
		{
			switch (monthNum)
			  {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					return 31;
				case 2:
					return 28;
				case 4:
				case 6:
				case 9:
				case 11:
					return 30;		
				default:
					return 0;
			  }
		}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
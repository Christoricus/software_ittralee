//AssessSoln.java
/* This program reads in and processes exactly 3 time values from the user in the form
 hh:mm and fully validates the time values. It also generates an appropriate message based
 on the time value.*/


import javax.swing.JOptionPane;

public class AssessSoln {
	public static void main(String args[])
		{
			int i=0,hoursPart;
			String timeAsString,hoursPartAsString;
			char firstChar,secondChar,thirdChar,fourthChar,fifthChar;
			boolean valid = false;
		
			for(i=1;i<=3;i++)
			{
				timeAsString = JOptionPane.showInputDialog("Please enter time value " + i);
				
				while(!valid)
				{

				// Although the introduction of the variables below make the solution a little less efficient,
                // hopefully they help to make it a little easier to understand, especially the formulation of
                // the validation expression later
                
					if(timeAsString.length()==5)
					{
						
						firstChar = timeAsString.charAt(0);  //get the first character in the time
						secondChar = timeAsString.charAt(1); //and the second
						thirdChar = timeAsString.charAt(2);  //and so on ...
						fourthChar = timeAsString.charAt(3);
						fifthChar = timeAsString.charAt(4);
					
					/* We now need to ensure that the first character has an ASCII value between that for '0' and '2' inclusive.
	                   Also, the second character must have an ASCII value between that for '0' and '3' inclusive if the value
	                   for the first character is '2', otherwise it can be anything between that for '0' and '9' inclusive.
	     			   The ASCII value for the fourth character must be within the range of ASCII codes for '0' to '5' inclusive
	                   and that for the fifth character must be within the range of ASCII codes for '0' to '9' inclusive.
	                   Finally, the third character must be a ':' and there must be exactly 5 characters in the time value*/
					
					
						if (firstChar<'0' || firstChar>'2' || (firstChar=='2' && (secondChar<'0' || secondChar>'3'))
							 || !Character.isDigit(secondChar) || thirdChar!=':' || fourthChar<'0' || fourthChar>'5'
							 || !Character.isDigit(fifthChar))
							 	timeAsString = JOptionPane.showInputDialog("Invalid time! Please re-enter time value " + i);
						else
								valid = true;
					}
					else
					{
						timeAsString = JOptionPane.showInputDialog("Invalid time! Please re-enter time value " + i);
					}
				}
				valid = false;	//must reset this before next iteration of the while loop or there'll be no validation
					 
				hoursPartAsString = timeAsString.substring(0,2);//extract the first 2 characters of the time
				hoursPart = Integer.parseInt(hoursPartAsString);
				
				if(hoursPart >= 0 && hoursPart < 12)
					JOptionPane.showMessageDialog(null,"Good Morning!","",JOptionPane.INFORMATION_MESSAGE);
				else if(hoursPart >= 12 && hoursPart < 18)
					JOptionPane.showMessageDialog(null,"Good Afternoon!","",JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null,"Good Evening!","",JOptionPane.INFORMATION_MESSAGE);
					 
			}
			System.exit(0);
		}
}
  
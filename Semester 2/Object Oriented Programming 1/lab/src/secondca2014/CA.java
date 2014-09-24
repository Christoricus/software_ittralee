//Nazmul Alam - T00152975
/* The Input Validation Test to check if the the date entered is validated
 * The outlined criteria below must validate
 *	It must be exactly 10 characters in length
 *	The 3rd and 6th characters must both be dashes
 *	The first 2 characters must both be digits
 *	The 4th and 5th characters must both be digits
 *	The month part must convert to an integer in the range 1-12
 *	The day part must convert to an integer in the range 1-31
 *	The maximum value for the day part must correspond to the month part for the date of birth concerned. To validate this condition you must use the fact that there are 31 days in months 1,3,5,7,8,10,12, 30 days in months 4,6,9 and 11 and for simplicity here we will take it that month 2 has 28 days.
 *
 */

package secondca2014;
import javax.swing.JOptionPane;

public class CA {


	public static void main(String[] args)
	{
		boolean valid = false;
		int pos1, pos2, date = 0, month = 0;
		String dob, dayAsString = "", monthAsString = "";

		dob = JOptionPane.showInputDialog("Please enter the date of birth in the form dd-mm-yyyy");

		while(!valid)  // dd-mm-yyyy
		{
			if (dob.length() == 10)
			{
				pos1 = dob.indexOf('-');
				pos2 = dob.lastIndexOf('-');

				if ( pos1 == 2  && pos2 == 5)
				{
					dayAsString = dob.substring(0, pos1);
					monthAsString = dob.substring(pos1+1, pos2);

					if ( Character.isDigit(dayAsString.charAt(0)) && Character.isDigit(dayAsString.charAt(1)) )
					{
						if ( Character.isDigit(monthAsString.charAt(0)) && Character.isDigit(monthAsString.charAt(1)) )
						{
							date = Integer.parseInt(dayAsString);  // Convert date to int
							month = Integer.parseInt(monthAsString);  //convert month to int

							if ( month > 0 && month <= 12)
							{

								/*		
								if ( (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12
										 || month != 4 || month != 6 || month != 9 || month != 11 || month != 2 ) && date > 0 && date <= 31 )  // validating months with 31 days
								{

									if (  (month != 1 || month != 3 || month != 5 || month != 7 || month != 8 || month != 10 || month != 12
											|| month == 4 || month == 6 || month == 9 || month == 11)  
											&& date > 0 && date <= 30  )  //validating months with 30 days

									{
										if ( (month != 1 || month != 3 || month != 5 || month != 7 || month != 8 || month != 10 || month != 12
												|| month != 4 || month != 6 || month != 9 || month != 11 || month == 2) && date > 0 && date <= 28 ) //validating february
										{
											valid = true;

										} else
											dob = JOptionPane.showInputDialog("Invalid! Must have 28 days in February - Please re-enter");


									} else
										dob = JOptionPane.showInputDialog("Invalid! Must have 30 days in any of the month - Please re-enter");


								} else
									dob = JOptionPane.showInputDialog("Invalid! Must have 31 days in any of the month - Please re-enter");
								 */
								if ( ( (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && date > 0 && date <= 31 )
										||  ( ( month == 4 || month == 6 || month == 9 || month == 11)  && date > 0 && date <= 30  )  
										|| ( month == 2 && date > 0 && date <= 28 ) )    // validating months with 31 days
								{

									valid = true;

								} else
									dob = JOptionPane.showInputDialog("Invalid! Number of  days is incorrect for month - Please re-enter");



								/*

								if ( (month != 4 && date <= 31) || (month != 6 && date <= 31) || (month != 9 && date <= 31) || (month != 11 && date <= 31) )

								{

									if ( (month != 1 && date <= 30) || (month != 3 && date <= 30) || (month != 5 && date <= 30) || (month != 7 && date <= 30)
											|| (month != 8 && date <= 30) || (month != 10 && date <= 30) || (month != 12 && date <= 30))
									{

										if ( month != 2 && date <= 31 )
										{
											valid = true;

										} else
											dob = JOptionPane.showInputDialog("Invalid! Must have 28 days in February - Please re-enter");


									} else
										dob = JOptionPane.showInputDialog("Invalid! Must have 30 days in any of the month - Please re-enter");


								} else
									dob = JOptionPane.showInputDialog("Invalid! Must have 31 days in any of the month - Please re-enter");

								 */
								//Right till here


							} else
								dob = JOptionPane.showInputDialog("Invalid! Month should be <= 12 - Please re-enter");


						} else
							dob = JOptionPane.showInputDialog("Invalid! Month part must be digits - Please re-enter");

					} else
						dob = JOptionPane.showInputDialog("Invalid! Day part must be digits - Please re-enter");

				} else
					dob = JOptionPane.showInputDialog("Invalid! Must have dashes in the correct locations - Please re-enter");

			} else
				dob = JOptionPane.showInputDialog("Invalid! Must have exactly 10 characters - Please re-enter");


			if(valid)
				JOptionPane.showMessageDialog(null, "The valid date of birth you supplied is: " + dob
						, "Valid Date of Birth", JOptionPane.INFORMATION_MESSAGE );

		} // end of validating while loop

		System.exit(0);

	}

}

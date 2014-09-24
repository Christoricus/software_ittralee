//Groups3_4Assess2Soln.java
/*This program partially validates the date of birth value entered getting the user to re-enter until a valid
 *one is supplied. It then displays the valid date of birth once the validation loop has terminated*/

import javax.swing.JOptionPane;

public class Groups3_4Assess2Soln {
	public static void main(String args[])
		{	
			String dateOfBirth;
			boolean valid=false;
				
			dateOfBirth = JOptionPane.showInputDialog("Please enter the date of birth in the form dd-mm-yyyy");

			while(!valid)
				{
					if(dateOfBirth.length()==10)
						{
							if(dateOfBirth.charAt(2)=='-' && dateOfBirth.charAt(5)=='-')
								{
									if(Character.isDigit(dateOfBirth.charAt(0)) && Character.isDigit(dateOfBirth.charAt(1)))
										{
											int dayPart = Integer.parseInt(dateOfBirth.substring(0,2));
											
											if(dayPart<=31)
												{
													if(Character.isDigit(dateOfBirth.charAt(3)) && Character.isDigit(dateOfBirth.charAt(4)))
														{	
															int monthPart = Integer.parseInt(dateOfBirth.substring(3,5));
															
															if(monthPart<=12)
															{
																if((monthPart == 1 || monthPart == 3 || monthPart == 5 || monthPart == 7 || monthPart == 8 || monthPart == 10 || 
																   monthPart == 12) || (monthPart == 4 || monthPart == 6 || monthPart == 9 || monthPart == 11) &&
																   dayPart<=30 || monthPart == 2 && dayPart<=28)
																	   	  valid = true;
																else
																   	dateOfBirth = JOptionPane.showInputDialog("Invalid! Too many days for this month value - Please re-enter");
															}
															else
																dateOfBirth = JOptionPane.showInputDialog("Invalid! Month value must be <= 12 - Please re-enter");
														}
													else
														dateOfBirth = JOptionPane.showInputDialog("Invalid! Month part must both be digits - Please re-enter");
										   		}
											else
												dateOfBirth = JOptionPane.showInputDialog("Invalid! Must have <= 31 days in any month - Please re-enter");
										}
									else
										dateOfBirth = JOptionPane.showInputDialog("Invalid! Day part must both be digits - Please re-enter");	
								}
							else
								dateOfBirth = JOptionPane.showInputDialog("Invalid! Must have dashes in the correct locations - Please re-enter");
						}
					else
						dateOfBirth = JOptionPane.showInputDialog("Invalid! Must have exactly 10 characters - Please re-enter");
				}
		
		 JOptionPane.showMessageDialog(null,"The valid date of birth you supplied is: " + dateOfBirth,"Valid Date of Birth",
				                          	  JOptionPane.INFORMATION_MESSAGE);
				                          	  	
		 System.exit(0);		
		}						
}
// SamDowling
/**
 * a program that verifys if the user 
 * entered a valid date in the format dd-mm-yyyy.
 */
package secondca2014;
import javax.swing.JOptionPane;

public class SamDowling
{

  public static void main(String[] args)
  {
  	boolean valid=false;
  	String message="Please enter the date of birth in the form dd-mm-yyyy";
  	String dob = JOptionPane.showInputDialog(message);
  	while(!valid)
  	{
	  	if(dob.length()==10)
			{
				if(dob.charAt(2)=='-'&&dob.charAt(5)=='-')
				{
					if(dob.substring(0,2).matches("\\d{2}"))
					{
						if(dob.substring(3,5).matches("\\d{2}"))
						{
							if(Integer.parseInt(dob.substring(3,5)) <= 12)
							{
								switch(Integer.parseInt(dob.substring(3,5)))
								{
									case 1:
									case 3:
									case 5:
									case 7:
									case 8:
									case 10:
									case 12:
										if(Integer.parseInt(dob.substring(0,2)) <= 31)
										{
											valid = true;
										}
										else
											message = "Invalid! Too many days for this month value  - Please re-enter";
										break;
									
									case 4:
									case 6:
									case 9:
									case 11:
										if(Integer.parseInt(dob.substring(0,2)) <= 30)
										{
											valid = true;
										}
										else
											message = "Invalid! Too many days for this month value  - Please re-enter";
										break;
									
									case 2:
										if(Integer.parseInt(dob.substring(0,2)) <= 28)
										{
											valid = true;
										}
										else
											message = "Invalid! Too many days for this month value  - Please re-enter";
										break;
										
									default:
										message = "Invalid! Month value must be <= 12 - Please re-enter";
								}
							}
							else
								message = "Invalid! Month value must be <= 12 - Please re-enter";
						}
						else
							message = "Invalid! Month part must both be digits - Please re-enter";
					}
					else
						message = "Invalid! Day part must both be digits - Please re-enter";
				}
				else
					message = "Invalid! Must have dashes in the correct locations - Please re-enter";
			}
			else
				message = "Invalid! Must have exactly 10 character - Please re-enter";
			
			if(!valid)
				dob = JOptionPane.showInputDialog(message);
	  }
	 
	 JOptionPane.showMessageDialog(null,"The valid date of birth you supplied is: "+dob);
	 
	 System.exit(0);
  }
}

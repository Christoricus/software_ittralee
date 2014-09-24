//Assess1Sample2.java
/*A program that uses a user-defined method called LifePathNumber() to determine the 
 numerology-based life-path number of a person based on their date of birth*/

import javax.swing.JOptionPane;

public class Assess1Sample2 {
	public static void main(String args[]) 	
	{
		String dateOfBirth;
		
		dateOfBirth = JOptionPane.showInputDialog("Please enter your date of birth in the form dd/mm/yyyy");
				
		JOptionPane.showMessageDialog(null,"Your life-path number is " + lifePathNumber(dateOfBirth)
			    ,"Life-Path Number",JOptionPane.INFORMATION_MESSAGE);
			    
	    System.exit(0);
		
	}
	
	public static int lifePathNumber(String dob)
	{
		int daySum,monthSum,yearSum,finalSum;
		
		//adding the 2 digits in the day part
		daySum = (int)dob.charAt(0) - 48 + (int)dob.charAt(1) - 48;
		
		//adding the 2 digits in the month part
		monthSum = (int)dob.charAt(3) - 48 + (int)dob.charAt(4) - 48; 
	
		//adding the 4 digits in the year part
		yearSum = (int)dob.charAt(6) - 48 + (int)dob.charAt(7) - 48 + 
			      (int)dob.charAt(8) - 48 + (int)dob.charAt(9) - 48;
			      
		yearSum = yearSum/10 + yearSum%10; //in case there are 2 digits in yearSum
		
		finalSum = daySum + monthSum + yearSum;
	
		
		if(finalSum==11 || finalSum==22 || finalSum<10)
		   return finalSum;
		else
		{
		   finalSum = finalSum/10 + finalSum%10; 
		   finalSum = finalSum/10 + finalSum%10; //to handle the case where finalSum was originally 19
		   
		   return finalSum;
		}
		
					
	}
}
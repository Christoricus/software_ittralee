//Exercise4.java
/*This program reads in an arbitrary number of dates of birth and validates each one
 *through a user-defined method called isValidDateOfBirth(). It also displays any dates
 *of birth from the 1960s*/

import javax.swing.JOptionPane;

public class Exercise4 {
	public static void main(String args[])
		{
		    String dob,datesIn1960s="",yearAsString;
		    int year;
		       
		    dob = JOptionPane.showInputDialog("Please enter a date of birth in the form dd-mm-yyyy (x to exit): ");
		    
		    while(!dob.equals("x"))
			    {
			    	while(!dob.equals("x") && !isValidDateOfBirth(dob))
			    		 dob = JOptionPane.showInputDialog("Invalid! Please re-enter the date of birth in the form dd-mm-yyyy (x to exit): ");
			    		 
			    	if(!dob.equals("x"))
				    	{
				    		yearAsString = dob.substring(dob.length()-4,dob.length());
				    		
				    		year = Integer.parseInt(yearAsString);
				    		if(year>=1960 && year <=1969)
				    			datesIn1960s += dob + "\n";
				    	}
			    	dob = JOptionPane.showInputDialog("Please enter another date of birth in the form dd-mm-yyyy (x to exit): ");	
			    }
			 
			JOptionPane.showMessageDialog(null,"The dates in the 1960s are: \n\n" + datesIn1960s,"1960s Dates",
			                         JOptionPane.INFORMATION_MESSAGE);
		    		
		}
	
	public static boolean isValidDateOfBirth(String d)	
		{
	        boolean valid=false;
	        String dayAsString,monthAsString;
	        int day,month;
	       	
	       	if(d.length()==10)
		       	{
		       		if(Character.isDigit(d.charAt(0)) && Character.isDigit(d.charAt(1)) &&
		       		   d.charAt(2)=='-' && Character.isDigit(d.charAt(3)) &&
		       		   Character.isDigit(d.charAt(4)) && d.charAt(5)=='-' &&
		       		   Character.isDigit(d.charAt(6)) && Character.isDigit(d.charAt(7)) &&
		       		   Character.isDigit(d.charAt(8)) && Character.isDigit(d.charAt(9)))
		       		   	{
		       		   		dayAsString = d.substring(0,2);
		       		   		day = Integer.parseInt(dayAsString);
		       		   		
		       		   		if(day>=1 && day<=31)
			       		   		{
			       		   			monthAsString = d.substring(3,5);
		       		   				month = Integer.parseInt(monthAsString);
		       		   				System.out.println(day + " " + month);
		       		   				if(month>=1 && month<=12)
			       		   				{
			       		   					if(((month==4 || month==6 || month==9 || month==11) &&
			       		   						day<=30) || (month==2 && day<=28))
			       		   						valid=true;
			       		   					else if((month==1 || month==3 || month==5 || month==7 || month==8 ||
			       		   					   month==10 || month==12) && day<=31)
			       		   					   	valid=true;
			       		   					
			       		   				}
			       		   		}
		       		   	}
		       		   		
		       	}
	       		
			return valid;
		}				
}	




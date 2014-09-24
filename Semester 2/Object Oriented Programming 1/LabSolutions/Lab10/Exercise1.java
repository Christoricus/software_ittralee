//Exercise1.java
/*This program validates exactly 5 time values in the form hh:mm and gives the user
 *an appropriate greeting based on the time of day*/

import javax.swing.JOptionPane;

public class Exercise1 {
	public static void main(String args[])
		{	
			String time,message="";
			boolean valid;
			int hoursPart;
			
			
			for(int i=1;i<=5;i++)
			   {
					time = JOptionPane.showInputDialog("Iteration " + i + " - Please enter a time in the form hh:mm");
					
					while(time.equals("") || time.length()!= 5 || (time.charAt(0)<'0' || time.charAt(0)>'2') 
						  || (time.charAt(0)=='2' && time.charAt(1)>'3')
						  || !Character.isDigit(time.charAt(1))
						  || time.charAt(2)!=':' ||  (time.charAt(3)<'0' || time.charAt(3)>'5')
						  || !Character.isDigit(time.charAt(4)))
						  	  time = JOptionPane.showInputDialog("Iteration " + i + " - Invalid! " +
						  	  	     "Please re-enter a time in the form hh:mm");
			   

		            hoursPart = Integer.parseInt(time.substring(0,2));
		            
					if(hoursPart<12)
						message = "Good Morning!";
					else if(hoursPart<18)
						message = "Good Afternoon!";
					else
						message = "Good Evening!";
				        
		            JOptionPane.showMessageDialog(null,message,"Time Validator",JOptionPane.INFORMATION_MESSAGE);
				}
				
			System.exit(0);
	
		}
}			
			
			
			
			
			
			
			
			
			
			
			
		
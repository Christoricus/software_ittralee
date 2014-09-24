//Exercise1.java
/*This program reads in an arbitrary amount of t-numbers and validates each one perfectly
 *It then displays the amount of valid t-numbers entered along with a list of the valid ones*/

import javax.swing.JOptionPane;

public class Exercise1 {
	public static void main(String args[])
		{
			String tNumber,allTNumbers="";
		    int count=0;
					
		    tNumber = JOptionPane.showInputDialog("Please enter a t-number (return to exit)");
		    
		    while(!tNumber.equals(""))
		    	{
		          //the validation loop follows - the first part of the validation test is
		          //necessary in case the user hits return as we don't want the "Invalid!" message
		          //in that event
		    	  while(!tNumber.equals("") && (tNumber.length()!=9 || (tNumber.charAt(0) != 't' &&
		    	       tNumber.charAt(0) != 'T') || !Character.isDigit(tNumber.charAt(1)) ||
		    	       !Character.isDigit(tNumber.charAt(2)) || !Character.isDigit(tNumber.charAt(3)) ||
		    	       !Character.isDigit(tNumber.charAt(4)) || !Character.isDigit(tNumber.charAt(5)) ||
		    	       !Character.isDigit(tNumber.charAt(6)) || !Character.isDigit(tNumber.charAt(7)) ||
		    	       !Character.isDigit(tNumber.charAt(8))))
		    	  		      tNumber = JOptionPane.showInputDialog("Invalid! Please re-enter t-number (return to exit)");
		    	  
		    	  if(!tNumber.equals("")) //as long as this is true we must be dealing with a valid t-number
			    	  {
			    	  	 count++; //keep track of amount of valid t-numbers
		    	         allTNumbers += tNumber + "\n"; //keep a list of the valid t-numbers
		    	         tNumber = JOptionPane.showInputDialog("Please enter another t-number (return to exit)");
			    	  }			
	
		    	}
		    
		    if(count!=0)	
				JOptionPane.showMessageDialog(null,"Number of valid t-numbers entered: " + count +
						       "\nList of valid t-numbers: \n\n" + allTNumbers,"Valid t-numbers",
						       JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null,"You entered no valid t-numbers!","Valid t-numbers",
						       JOptionPane.INFORMATION_MESSAGE);											
		}		
}



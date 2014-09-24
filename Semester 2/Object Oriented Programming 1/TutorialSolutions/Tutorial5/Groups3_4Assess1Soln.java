//Groups3_4Assess1Soln.java
/*This program uses a boolean user-defined method to validate an IP address octet*/

import javax.swing.JOptionPane;

public class Groups3_4Assess1Soln {
	public static void main(String args[])
		{	
			String octet;
			
			octet = JOptionPane.showInputDialog("Please enter an octet value");
			
			if(validOctet(octet))	  	                                               
				JOptionPane.showMessageDialog(null,"You entered a valid octet","Octet Validation Result",
				                          	  JOptionPane.INFORMATION_MESSAGE);
		    else
		    	JOptionPane.showMessageDialog(null,"You entered an invalid octet","Octet Validation Result",
				                          	  JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);		
		}
		
	public static boolean validOctet(String octet)
		{
			int i,octetAsInt;
			
			if(octet.length()<1 || octet.length()>3)
				return false;
			else
				{
					for(i=0;i<octet.length();i++)
						if(!Character.isDigit(octet.charAt(i)))
						    return false;
						    		    
					octetAsInt = Integer.parseInt(octet);
					    	
					if(octetAsInt>=0 && octetAsInt<=255)
					    return true;
				    else
				    	return false;
				}			
		}			
}
//Q2.java
/*This program processes the details of an arbitrary number of computers*/

import javax.swing.JOptionPane;

public class Q2 {
	public static void main(String args[]) 
			{
				int hardDiskSpace=0,numProcessed=0,totalDiskSpace=0,i=0;
				String serialNumber,processorType,hardDiskSpaceAsString,
					   priceAsString;
			    boolean valid;
									
				serialNumber = JOptionPane.showInputDialog("Please enter the serial number " 
						       + "(return to exit)");
							 		  
			    while(!serialNumber.equals(""))
					 {
							valid = false;
					    	hardDiskSpaceAsString = JOptionPane.showInputDialog("Please enter the "
					    							+ "hard-disk space");
					    						    							
					    	while(!valid)
					    	  {
					    	  	  while(i < hardDiskSpaceAsString.length())
					    	  	    {
					    	  	  		if(hardDiskSpaceAsString.charAt(i) < '0' || 
					    	  		 	   hardDiskSpaceAsString.charAt(i) > '9')
					    	  		 			break;
					    	  		 	i++;
					    	  		}
					    	  		
					    	  	  if(i < hardDiskSpaceAsString.length() || i == 0)
					    	  	    {
					    	  	    	hardDiskSpaceAsString = JOptionPane.showInputDialog(
					    	  	    		"Invalid! Please re-enter hard-disk space");
					    				i = 0;
					    	  	    }
					    	  	  else
					    	  	    {
					    	  	    	hardDiskSpace = Integer.parseInt(hardDiskSpaceAsString);
					    	  	    	
					    	  	    	if (hardDiskSpace > 50 && hardDiskSpace < 5000)
					    	  	    		valid = true;
					    	  	    	else
					    	  	    	  {
					    	  	    	  	hardDiskSpaceAsString = JOptionPane.showInputDialog(
					    	  	    	  		"Invalid! Please re-enter hard-disk space");
					    			    	i = 0;
					    	  	    	  }
					    	  	    }
	  	   
					    	    }
					    													 
						    processorType = JOptionPane.showInputDialog("Please enter the " +
						    				"processor type ");
				
							priceAsString = JOptionPane.showInputDialog("Please enter the price ");
							
					    	numProcessed++;
					   	
					    	totalDiskSpace+=hardDiskSpace;
					   
					    	serialNumber = JOptionPane.showInputDialog("Please enter the serial "
					    				   + "number (return to exit)");					    				   
					    }
				
				if(numProcessed > 1)	        
					JOptionPane.showMessageDialog(null,"\n\nThe average disk space available on "
					+ "the computers processed is: " + String.format("%.0f",
					averageDiskSpace(totalDiskSpace,numProcessed)) 
				    ,"Computer Stats",JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null,"Thanks for using the system .... goodbye","Farewell!",
					            JOptionPane.INFORMATION_MESSAGE);
			    
			    System.exit(0);				  				     						  					  
		}
		
	public static float averageDiskSpace(int totalDiskSpace,int numProcessed)
		{
			return (float)totalDiskSpace/numProcessed;
		}
}
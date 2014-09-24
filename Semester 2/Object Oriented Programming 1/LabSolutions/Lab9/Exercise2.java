//Exercise2.java
/*This program gets the user to enter an arbitrary amount of positive or negative
 *whole numbers and validates each one perfectly. It then determines a number of
 *results based on the numbers entered.*/

import javax.swing.JOptionPane;

public class Exercise2{
	public static void main(String args[])
		{	
			int number,sum=0,over1000=0,negative=0,largest=0,smallest=0,even=0,i,numProcessed=0;
			String numberAsString;
			boolean valid;
			double numberAsDouble=0;
			
			
			numberAsString = JOptionPane.showInputDialog("Please enter a whole number (x to exit)");
			
			while(!numberAsString.equals("x"))
				{
					valid = false;
					
					while(!valid)
						{
						   	if(!numberAsString.equals("") && (Character.isDigit(numberAsString.charAt(0)) 
						   		 || numberAsString.charAt(0)=='-'))
						       {
						       	 for(i=1;i<numberAsString.length();i++)
						       	 	if(!Character.isDigit(numberAsString.charAt(i)))
						       	 		break;
						       	 		
						       	 if(i==numberAsString.length() && !numberAsString.equals("-"))
							       	 {
							       	 	numberAsDouble = Double.parseDouble(numberAsString);
							       	 	
							       	 	if(numberAsDouble>=Integer.MIN_VALUE && numberAsDouble<=Integer.MAX_VALUE)
							       	 		valid = true;
							       	 	else
							       	 		numberAsString = JOptionPane.showInputDialog("Invalid! Please re-enter a whole number (x to exit)");	
							       	 }
						       	 	
						       	 else
						       	 	numberAsString = JOptionPane.showInputDialog("Invalid! Please re-enter a whole number (x to exit)");	
						       }
						    else if(numberAsString.equals("x"))
						    	break;
						    else
						    	numberAsString = JOptionPane.showInputDialog("Invalid! Please re-enter a whole number (x to exit)");	
						}
					
						
				    if(!numberAsString.equals("x"))
				    	{
				    		number = (int)numberAsDouble;
	                        sum += number;
	                        numProcessed++;
	                        
	                        if(numProcessed==1)
		                        {
		                        	largest = number;
		                        	smallest = number;
		                        }
		                    else if(number>largest)
		                    	largest = number;
		                    else if(number<smallest)
		                    	smallest = number;
		                    	
		                    if(number<0)
		                    	negative++;
		                    else if(number>1000)	
		                        over1000++;
		                        
		                    if(number%2 == 0)
		                    	even++;
		                    	
		            		numberAsString = JOptionPane.showInputDialog("Please enter another whole number (x to exit)");
				    	}
				}
			
		    	
		    JOptionPane.showMessageDialog(null,"The average of the numbers entered is: " + 
		    									String.format("%.2f",(float)sum/numProcessed) +
		    	                               "\nThe largest of the numbers entered is: " + largest + 
		    	                               "\nThe smallest of the numbers entered is: " + smallest +
		    	                               "\nThe percentage of the numbers that were negative: " + 
		    	                               	 String.format("%.2f",(float)negative/numProcessed*100) +
		    	                               "\nThe percentage of the numbers that exceeded 1000: " + 
		    	                               	 String.format("%.2f",(float)over1000/numProcessed*100) +
		    	                               "\nThe number of even values: " + even,
		    	                               "Results",JOptionPane.INFORMATION_MESSAGE);
		}
}			
			
			
			
			
			
			
			
			
			
			
			
		
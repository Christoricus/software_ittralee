//Groups2_5Assess2Soln.java
/*This program validates a debit card number*/

import javax.swing.JOptionPane;

public class Groups2_5Assess2Soln {
	public static void main(String args[])
		{	
		    String debitCardNumber = JOptionPane.showInputDialog("Please enter a 16-digit debit card number");
			boolean valid = false;
			int i,j;
			
			while(!valid)
				{
					if(debitCardNumber.length()==16)
						{
							if(debitCardNumber.charAt(0)=='4')
								{
									for(i=1;i<16;i++)
										if(!Character.isDigit(debitCardNumber.charAt(i)))
											break;
											
									if(i==16)
										{
											int total=0,num;
											
											for(j=0;j<16;j++)
												{
													if(j%2==0)
														{
															num=Character.getNumericValue(debitCardNumber.charAt(j))*2;
															if(num>9)
																num=1+(num%10);
															total+=num;
														}
													else
														total+=Character.getNumericValue(debitCardNumber.charAt(j));
												}
												
											if(total%10==0)
												valid = true;
											else
												debitCardNumber = JOptionPane.showInputDialog("Invalid - failed the golden rule! Please re-enter");
										}
									else
										debitCardNumber = JOptionPane.showInputDialog("Invalid - must contain all digits! Please re-enter");
								}
							else
								debitCardNumber = JOptionPane.showInputDialog("Invalid - must begin with a 4! Please re-enter");
						}
					else
						debitCardNumber = JOptionPane.showInputDialog("Invalid debit card length! Please re-enter");
				}
						  	                                               
			JOptionPane.showMessageDialog(null,"The debit card number " + debitCardNumber + " is valid","Valid!",
				                          JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);						
	}			
}
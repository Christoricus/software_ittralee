//Tutorial4Qa.java
/*A program that uses a user-defined method called decimalToBinary() to determine the 
 binary equivalent of a user-supplied decimal whole number*/

import javax.swing.JOptionPane;

public class Tutorial4Qa {
	public static void main(String args[]) 	
	{
		String decimalAsString;
		int decimal;
		
		decimalAsString = JOptionPane.showInputDialog("Please enter a decimal whole number");
		decimal = Integer.parseInt(decimalAsString);
		
		JOptionPane.showMessageDialog(null,"The binary equivalent of " + decimal + " is " + 
			    decimalToBinary(decimal),"Decimal to Binary Conversion",JOptionPane.INFORMATION_MESSAGE);
	    System.exit(0);
		
	}
	
	public static String decimalToBinary(int decimal)
	{
		String binary="";
		int tempResult=decimal,remainder;
			
		while(tempResult>0)
		{
			remainder = tempResult%2;	
			binary = remainder + binary;
			tempResult = tempResult/2;
		}
						
		return binary;
		
	}
}
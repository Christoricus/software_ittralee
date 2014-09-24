//Tutorial4Qb.java
/*A program that uses a user-defined method called greaterString() which takes 2
 *String arguments and determines which is greater alphabetically based on their ASCII codes*/

import javax.swing.JOptionPane;

public class Tutorial4Qb {
	public static void main(String args[]) 	
	{
		String firstString,secondString;
		
		firstString = JOptionPane.showInputDialog("Please enter a first string");
		secondString = JOptionPane.showInputDialog("Please enter a second string");
		
		JOptionPane.showMessageDialog(null,"The greater of the 2 strings alphabetically is: " + 
			   greaterString(firstString,secondString),"String comparison",JOptionPane.INFORMATION_MESSAGE);
			   
	    System.exit(0);
		
	}
	
	public static String greaterString(String a,String b)
	{
		int shorterStringLength,i;
		String greater="";
		
		if(a.equals(b))
			return "neither - both strings you entered are identical alphabetically";
		
		//must establish the length of the shorter string for our loop as we don't want
		//to attempt to extract a character beyond the length of the shorter string
		//as doing so would result in a program crash at runtime
			
		if(a.length()<=b.length())
			shorterStringLength = a.length();
		else
			shorterStringLength = b.length();
		
		for(i=0;i<shorterStringLength;i++)
		{
			if(a.charAt(i)>b.charAt(i))
			{
				greater = a;
				break;
			}
			
			else if(b.charAt(i)>a.charAt(i))
			{
				greater = b;
				break;
			}
						
		}
		
		//if both strings happened to be identical up to the length of the shorter string then
		//the value of greater will still be "", in which case just find out which string is longer
		//and this will be the greater string alphabetically e.g. "apple" and "applet"
		
		if(greater.equals(""))
			if(a.length() > b.length())
				greater = a;
			else
				greater = b;
			
				
		return greater;
	}
}
//Tutorial3Qb.java
/*A program that uses a user-defined method called vowelCount() to determine the number
 *of vowels contained in a piece of user-supplied text*/

import javax.swing.JOptionPane;

public class Tutorial3Qb {
	public static void main(String args[]) 	
	{
		String text;
		
		text = JOptionPane.showInputDialog("Please enter a piece of text");
		
		JOptionPane.showMessageDialog(null,"The number of vowels contained in this piece of text is " 
			        + vowelCount(text),"",JOptionPane.INFORMATION_MESSAGE);
	    System.exit(0);
		
	}
	
	public static int vowelCount(String txt)
	{
		String text = txt.toLowerCase();
		char ch;
		int count=0;
		for(int i=0;i<text.length();i++)
		{
			ch = text.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				count++;
		}
		return count;
	}
}
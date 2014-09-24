//Exercise3.java
/*This program uses a user-defined method called isWholeNumber() to determine whether a
 *string constitutes a whole number*/

import javax.swing.JOptionPane;

public class Exercise3 {
	public static void main(String args[])
		{
			String text;
			char character;
			
			text = JOptionPane.showInputDialog("Please enter a piece of text");
				
			if(isWholeNumber(text))
				JOptionPane.showMessageDialog(null,"The text you entered constitutes a whole number",
				                              "Number Tester",JOptionPane.INFORMATION_MESSAGE);
			else
		        JOptionPane.showMessageDialog(null,"The text you entered does not constitute a whole number",
				                              "Number Tester",JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);
		}
		
	public static boolean isWholeNumber(String s)
		{
			boolean result = false;
			int i=0;
			
			if(s.charAt(0)=='-' || Character.isDigit(s.charAt(0)))
				{
			    	for(i=1;i<s.length();i++)
			    		if(!Character.isDigit(s.charAt(i)))
				    		{
				    			break;
				    		}
			    		
					if(i==s.length() && !s.equals("-"))
					    result = true;
				}
		    		
		    return result;
		    		
		}			
}



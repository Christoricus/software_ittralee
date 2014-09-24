//Exercise2.java
/*This program uses a user-defined method called reverse() to return a user-supplied
 *string in reverse order*/

import javax.swing.JOptionPane;

public class Exercise2 {
	public static void main(String args[])
		{
			String text;
			
		    text = JOptionPane.showInputDialog("Please enter a piece of text");
								
			JOptionPane.showMessageDialog(null,"\n\nThe text reversed is " + reverse(text),
			                              "String Reversed",JOptionPane.INFORMATION_MESSAGE);
			                              
			System.exit(0);
		}
		
	public static String reverse(String txt)
		{
			String string = "";
			
			for(int i=0;i<txt.length();i++)
					string = txt.charAt(i) + string;		
					
			return string;
		}			
}



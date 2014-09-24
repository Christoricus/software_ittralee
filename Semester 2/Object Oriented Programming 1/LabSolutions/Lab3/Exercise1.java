//Exercise1.java
/*This program deals with creating a menu-based scenario using a 
switch statement and uses input and message dialogs for i/o*/

import javax.swing.JOptionPane;

public class Exercise1 {
	public static void main(String args[])
		{
			int choice;
			float a,b,c,r,h,s;
			String choiceAsString,aAsString,bAsString,cAsString,rAsString,hAsString;
			final float PI = 3.142f;
				
			String menu = "\t\t\t1.Calculate the area of a triangle " +
			"\n\t\t\t2.Calculate the volume of a cone\n\t\t\t" +
			"3.Quit\n\n\nPlease enter your choice (1-3): ";
				
			choiceAsString = JOptionPane.showInputDialog(menu);
				
			choice = Integer.parseInt(choiceAsString);
							
			switch(choice)
				{
					case 1:
					       aAsString = JOptionPane.showInputDialog("\n\nPlease enter the" +
					       " length of the first side: ");
					       a=Float.parseFloat(aAsString);
					       
					       bAsString = JOptionPane.showInputDialog("\n\nPlease enter the" +
					       " length of the second side: ");
					       b=Float.parseFloat(bAsString);
					       
					       cAsString = JOptionPane.showInputDialog("\n\nPlease enter the" +
					       " length of the third side: ");
					       c=Float.parseFloat(cAsString);
					       
					       s = (a+b+c)/2;
 
						   JOptionPane.showMessageDialog(null,"The area of the triangle is " +
						   String.format("%.3f metres squared",Math.sqrt(s*(s-a)*(s-b)*(s-c))), 
						   "Triangle Area", JOptionPane.INFORMATION_MESSAGE);
						   break;
					case 2:
					       rAsString = JOptionPane.showInputDialog("\n\nPlease enter the" +
					       " radius of the cone: ");
					       r=Float.parseFloat(rAsString);
					       
					       hAsString = JOptionPane.showInputDialog("\n\nPlease enter the" +
					       " height of the cone: ");
					       h=Float.parseFloat(hAsString);
					       
						   JOptionPane.showMessageDialog(null,"The volume of the cone is " +
						   String.format("%.3f metres cubed",1f/3*PI*r*r*h), 
						   "Cone Volume", JOptionPane.INFORMATION_MESSAGE);
						   break;
					case 3:
						   JOptionPane.showMessageDialog(null,"Thanks for using the system. " +
						   "Goodbye!","Farewell", JOptionPane.INFORMATION_MESSAGE);
					       break;
					default:
					       JOptionPane.showMessageDialog(null,"Sorry - you must have entered " +
					       "an invalid choice - must be between 1 and 3",
						   "Warning Message", JOptionPane.INFORMATION_MESSAGE);
				  }
			System.exit(0);
		}
			
}



//Group1Assess1Soln.java
/*This program reads in the lengths of the 3 sides of a triangle and uses a user-defined
 *method to determine and display its area and the category of the triangle*/

import javax.swing.JOptionPane;

public class Group1Assess1Soln {
	public static void main(String args[])
		{
			double a,b,c;
			String aAsString,bAsString,cAsString;
			
			aAsString = JOptionPane.showInputDialog("Please enter the length of the first side of the triangle");
			a = Double.parseDouble(aAsString);
			
			bAsString = JOptionPane.showInputDialog("Please enter the length of the second side of the triangle");
			b = Double.parseDouble(bAsString);
			
			cAsString = JOptionPane.showInputDialog("Please enter the length of the third side of the triangle");
			c = Double.parseDouble(cAsString);
			
			triangleDetails(a,b,c);
			
			System.exit(0);		
		}
		
	public static void triangleDetails(double a,double b,double c)
		{
			double s,area;
			String category;
			
			s = (a+b+c)/2;
			area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			
			if(a==b && a==c)
				category = "equilateral";
			else if(a==b && a!=c || a==c && a!=b || b==c && b!=a)
				category = "isosceles";
			else
				category = "scalene";
				
			JOptionPane.showMessageDialog(null,"The area of the triangle is " + String.format("%.3f",area) + 
				                          " squared units\nand it is a " + category + " triangle","Triangle Details",
				                          JOptionPane.INFORMATION_MESSAGE);
			
			
		}
			
}
//Q4.java
/*This program processes an array using 4 methods*/

import javax.swing.JOptionPane;

public class Q4 {
    public static void main(String args[])
       {
         	double heights[] = new double[10];
         	double averageHeight, smallest, tallest;
         
      		readInHeights(heights);
      		
      		averageHeight = averageHeight(heights);
      			
      		tallest = tallestHeight(heights);
      		
      		JOptionPane.showMessageDialog(null,"Average height: " + String.format("%.2fm",
      		averageHeight) + "\nTallest height: " + tallest + "m","Height Stats",
      		JOptionPane.INFORMATION_MESSAGE);
      		
      		displayOver1_7m(heights);
      		
      		System.exit(0);

	   }	

	public static void readInHeights(double h[])
	   {
	   		String heightAsString;
	   		
	      	for (int i = 0; i < h.length; i++)
	      		{	
					heightAsString = JOptionPane.showInputDialog("Enter height for student " 
					+ (i+1) + ": ");
					h[i] = Double.parseDouble(heightAsString);		
	      		}
	   }

	public static double averageHeight(double h[])
	   {
	   		double total = 0;
	      	for (int i = 0; i < h.length; i++)
	      		{	
					total += h[i];
	      		}
	      	return total/h.length;
	   }

	public static double tallestHeight(double h[])
	   {
	   		double tallest = h[0];
	      	for (int i = 1; i < h.length; i++)
	      		{	
					if(h[i] > tallest)
						tallest = h[i];
	      		}
	      	return tallest;
	   }
	
	public static void displayOver1_7m(double h[])
		{
			String text = "";
			text += "The list of heights over 1.7m is:\n";
			
 			for (int i = 0; i < h.length; i++)
 				if(h[i] > 1.7)
 					text += h[i] + " ";
 					
  			JOptionPane.showMessageDialog(null,text,"Heights over 1.7m",
  			JOptionPane.INFORMATION_MESSAGE);
		}
}       	
       	
       	
       	
       	
       	
       	
       	
       	
		
//Exercise1.java
/*This program processes an array using 5 methods*/

import javax.swing.JOptionPane;

public class Exercise1 {
    public static void main(String args[])
       {
         	float heights[] = new float[10];
         	float averageHeight, smallest, tallest;
         
      		readInHeights(heights);
      		
      		averageHeight = averageHeight(heights);
      		
      		smallest = smallestHeight(heights);
      		
      		tallest = tallestHeight(heights);
      		
      		JOptionPane.showMessageDialog(null,"Average height: " + String.format("%.2fm",
      		averageHeight) + "\nSmallest height: " + smallest + "m\nTallest height: " + 
      		tallest + "m","Height Stats",JOptionPane.INFORMATION_MESSAGE);
      		
      		displayOver1_7m(heights);
      		
      		System.exit(0);

	   }	

	public static void readInHeights(float h[])
	   {
	   		String heightAsString;
	   		
	      	for (int i = 0; i < h.length; i++)
	      		{	
					heightAsString = JOptionPane.showInputDialog("Enter height for student " 
					+ (i+1) + ": ");
					h[i] = Float.parseFloat(heightAsString);		
	      		}
	   }

	public static float averageHeight(float h[])
	   {
	   		float total = 0;
	      	for (int i = 0; i < h.length; i++)
	      		{	
					total += h[i];
	      		}
	      	return total/h.length;
	   }

	public static float smallestHeight(float h[])
	   {
	   		float smallest = h[0];
	      	for (int i = 1; i < h.length; i++)
	      		{	
					if(h[i] < smallest)
						smallest = h[i];
	      		}
	      	return smallest;
	   }

	public static float tallestHeight(float h[])
	   {
	   		float tallest = h[0];
	      	for (int i = 1; i < h.length; i++)
	      		{	
					if(h[i] > tallest)
						tallest = h[i];
	      		}
	      	return tallest;
	   }


	
	public static void displayOver1_7m(float h[])
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
       	
       	
       	
       	
       	
       	
       	
       	
		
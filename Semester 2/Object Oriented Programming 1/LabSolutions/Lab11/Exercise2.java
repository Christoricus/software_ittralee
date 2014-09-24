//Exercise2.java
/*This program creates an array of height values and determines the number of people
 *whose height was above 1.8m and the number whose height was below 1.6m*/

import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextArea;

public class Exercise2 {
      public static void main(String args[])
      { 
				float heights[] = new float[10];
	 			String heightAsString;
	 			int over1_8m = 0, under1_6m = 0;
	 			
	 			for (int i = 0; i < heights.length; i++)
	 				{
	 					heightAsString = JOptionPane.showInputDialog("Please enter the height " +
	 					"of person " + (i+1));
	 					heights[i] = Float.parseFloat(heightAsString);
	 					
	 					if(heights[i] > 1.8f)
	 						{
	 							over1_8m++;
	 						}
	 					
	 					if(heights[i] < 1.6f)
	 						{
	 							under1_6m++;
	 						}
	 				}

				JOptionPane.showMessageDialog(null,"The total number of people over 1.8m is " +
				over1_8m + "\nThe total number of people under 1.6m is " + under1_6m,
				"Height Stats",JOptionPane.PLAIN_MESSAGE);
	 			
	 			System.exit(0);
			}
}

             
                    
                           
                                  
                                                
       
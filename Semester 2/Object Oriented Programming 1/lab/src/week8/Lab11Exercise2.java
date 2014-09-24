package week8;
import javax.swing.JOptionPane;

public class Lab11Exercise2 {
	
	public static void main(String[] args)
	{
		float[] heights = new float[10];
		
		int over1_8 = 0, below1_6 = 0;
		String heightsAsString;
		
		for (int i = 0; i < 10; i++)
		{
			heightsAsString = JOptionPane.showInputDialog("Please enter the height of person " + (i+1));
			heights[i] = Float.parseFloat(heightsAsString);
			
			
			while (heights[i] < 0 || heights[i] > 3) //validating 
			{
				heightsAsString = JOptionPane.showInputDialog("Invalid! Please re-enter the height of person " + (i+1));
				heights[i] = Float.parseFloat(heightsAsString);
			}
			
			if (heights[i] > 1.8f) { 
				over1_8++; 
				
			} 
			
			if ( heights[i] < 1.6f ) {
				below1_6++;
			
			}
			
			
		} //end of for loop -- inputting heights 10 times
		
		JOptionPane.showMessageDialog(null, "The total number of people over 1.8m is " + over1_8
				+ "\nThe total number of people under 1.6m is " + below1_6
				, "Height Stats", JOptionPane.PLAIN_MESSAGE );
		
		System.exit(0);
	
	}

}

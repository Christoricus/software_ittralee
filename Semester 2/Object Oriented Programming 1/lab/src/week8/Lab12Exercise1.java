package week8;
import javax.swing.JOptionPane;

public class Lab12Exercise1 {
	
	public static void main(String[] args)
	{
		float[] heights =  new float[10];
		float averageHeight, tallest, smallest;
		
		readHeights(heights);
		
		averageHeight = averageHeight(heights);
		tallest = tallestStudent(heights);
		smallest = smallestStudent(heights);
		
		JOptionPane.showMessageDialog(null, "The average height: " + averageHeight + "m"
				+ "\nSmallest height: " + smallest + "m"
				+ "\nTallest height: " + tallest + "m", "Height Stats", JOptionPane.INFORMATION_MESSAGE);
		
		
		above17(heights);
		
		System.exit(0);
		
	}
	
	//Reading in the heights
	public static void readHeights(float[] f)
	{
		String height;
		
		for (int i = 0; i < f.length; i++)
		{
			height = JOptionPane.showInputDialog("Enter height for student " + (i+1));
			f[i] = Float.parseFloat(height);
		}
	}
	
	//Find out the average height
	public static float averageHeight(float[] f)
	{
		float total = 0;
		
		for (int i = 0; i < f.length; i++)
		{
			total += f[i];
		}
		
		return total/f.length;
	}
	
	//Finding out the tallest students height
	public static float tallestStudent(float[] f)
	{
		float tallest = 0;
		
		for (int i = 0; i < f.length; i++)
		{
			if ( f[i] > tallest )
				tallest = f[i];
		}
		
		return tallest;
	}
	
	//Finding out the smallest studetns height
	public static float smallestStudent(float[] f)
	{
		float smallest = 0;
		
		for (int i = 0; i < f.length; i++)
		{
			if ( i == 0 ) {
				smallest = f[i];
			
			} else if (f[i] < smallest ) {
				smallest = f[i];
				
			}
		}
		
		return smallest;
	}
	
	//Displaying a list of students with heights above 1.7 meters
	public static void above17(float[] f)
	{
		String above17 = "";
		above17 += "The list of students above 1.7m is: \n";
		
		for (int i = 0; i < f.length; i++)
		{
			if (f[i] > 1.7f)
				above17 += f[i] + ", ";
		}
		
		JOptionPane.showMessageDialog(null, above17, "Heights above 1.7m"
				, JOptionPane.INFORMATION_MESSAGE );
	}

}

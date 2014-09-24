package week8;
import javax.swing.JOptionPane;

public class MarksArray {
	
	public static void main(String[] args)
	{
		int[] marks =  new int[10];
		int total = 0, i;
		String text, markAsString;
		double average;
		
		for (i = 0; i < marks.length; i++)
		{
			markAsString = JOptionPane.showInputDialog("Enter mark for student " + (i+1));
			marks[i] = Integer.parseInt(markAsString);
			
			total += marks[i];
			
		}
		
		average = (double) total/marks.length;
		
		JOptionPane.showMessageDialog(null, "The average mark is: " 
				+ String.format("%.2f", average), "Average Mark", JOptionPane.INFORMATION_MESSAGE);
		
		
		//Finding out the marks above the average
		text = "List of marks above the average is: \n\n";
		
		for (i = 0; i < marks.length; i++)
		{
			if (marks[i] > average)
			{
				text += marks[i] + " ";
			}
		}
		
		JOptionPane.showMessageDialog(null, text, "Marks above average", JOptionPane.INFORMATION_MESSAGE);
	
	
		System.exit(0);
	}
}

package week8;
import javax.swing.JOptionPane;

public class Lab11Exercise4 {
	
	public static void main(String[] args)
	{
		int[] marks =  new int[10];
		String[] names = new String[10];
		String text, markAsString;
		int total = 0, i;
		double average;
		
		for (i = 0; i < marks.length; i++)
		{
			
			names[i] = JOptionPane.showInputDialog("Enter name of student " + (i+1));
			
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
				text += names[i] + " ";
			}
		}
		
		JOptionPane.showMessageDialog(null, text, "Marks above average", JOptionPane.INFORMATION_MESSAGE);
	
	
		System.exit(0);
	}
}

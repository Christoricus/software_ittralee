package week8;
import javax.swing.JOptionPane;

public class Lab11Exercise3 {
	
	public static void main(String[] args)
	{
		int[] marks =  new int[10];
		int total = 0, highest = 0, lowest = 0, i;
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
			
			//Finding out the highest/lowest mark
			if ( i == 0 ) {
				highest = marks[i];
				lowest = marks[i];
			
			} else if (highest < marks[i]) {  //98 < 100
				highest = marks[i];
			
			} else if (lowest > marks[i]) { //98 > 100
				lowest = marks[i];
			}
		
		}
		
		JOptionPane.showMessageDialog(null, text, "Marks above average", JOptionPane.INFORMATION_MESSAGE);
	
		
		JOptionPane.showMessageDialog(null, "The highest mark entered was " + highest
				+ "\nThe lowest mark entered was " + lowest
				, "Highest/Lowest Mark", JOptionPane.INFORMATION_MESSAGE);

	
		System.exit(0);
	}
}

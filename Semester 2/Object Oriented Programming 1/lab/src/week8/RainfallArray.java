package week8;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class RainfallArray {
	
	public static void main(String[] args)
	{
		int[] rainfall = {7, 12, 10, 4, 5, 3, 1, 4, 3, 7, 8, 10};
		int month, i, janToJuneRainfall = 0, winterRainfall;
		String text = "", monthAsString;
		
		Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
		JTextArea textArea = new JTextArea(14, 20);
		
		textArea.setFont(textAreaFont);
		textArea.setText(String.format("%-10s %-10s \n", "Month", "Rainfal"));
		
		for (i = 0; i < rainfall.length; i++)
		{
			text += String.format("%-10d %-10d \n", (i+1),  rainfall[i]);

		}
		
		textArea.append(text);
		
		JOptionPane.showMessageDialog(null, textArea, "Rainfall Stats", JOptionPane.PLAIN_MESSAGE);
		
		//Displaying the rainfall for a particular month (selected by user)
		monthAsString = JOptionPane.showInputDialog("Please enter a month number (1-12) ");
		month = Integer.parseInt(monthAsString);
		JOptionPane.showMessageDialog(null, "Rainfall for this month is: " + rainfall[month-1] + "mm"
				, "Rainfall Stats", JOptionPane.PLAIN_MESSAGE);
		
		//Calculating the total rainfall for winter
		winterRainfall = rainfall[0] + rainfall[1] + rainfall[2];
		JOptionPane.showMessageDialog(null, "Total rainfall for the winter month is: " + winterRainfall + "mm"
				, "Rainfall Stats", JOptionPane.PLAIN_MESSAGE);
		
		//Calculating the total rainfall for January to June
		for (i = 0; i <= 5; i++)
		{
			janToJuneRainfall += rainfall[i];
		}
		
		JOptionPane.showMessageDialog(null, "Total rainfall for January to June is: " + janToJuneRainfall + "mm"
				, "Rainfall Stats", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}
}

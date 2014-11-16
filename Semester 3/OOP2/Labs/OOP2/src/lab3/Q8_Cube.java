package lab3;
import java.awt.Font;

import javax.swing.*;

/* User-written method to find get the cube of a number (1 in this case)
 * Call the method cube(), take 1 integer parameter and return an integer
 * Use a for-loop to display a table between 1 and 15
 */
public class Q8_Cube {
	public static void main(String[] args)
	{
		JTextArea output = new JTextArea();
		Font outputFont = new Font("monospaced", Font.PLAIN, 14);	
		output.setFont(outputFont);
		//headings
		output.setText(String.format("%-15s%s\n%-15s%s\n", "Number", "Cube", "-----", "-----"));
		
		for (int i = 1; i < 16; i++)
		{
			output.append(i + "		" + cube(i) + "\n");
		}
		//output
		JOptionPane.showMessageDialog(null, output, "Cubed", JOptionPane.PLAIN_MESSAGE);
		
	}//ends main
	
	public static int cube(int a)
	{
		int answer = (int) Math.pow(a, 3);
		return answer;
	}
}

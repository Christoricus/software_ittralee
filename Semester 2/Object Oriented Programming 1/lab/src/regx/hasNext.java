package regx;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class hasNext {

	public static void main( String[] args )
	{
		
		String[] names = new String[5];
		
		populateArray(names);
		
		System.exit(0);
	}
	
	
	public static void populateArray(String[] array)
	{
		int totalCharacter = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			array[i] = JOptionPane.showInputDialog("Names " + (i+1) );
		}
		
		String longestName = array[0];
		
		for (int j = 0; j < array.length; j++)
		{
			String newName = array[j];
			
			if (longestName.length() > newName.length())
				longestName = array[j];
			
			totalCharacter += newName.length();
		}
		
		Arrays.sort(array);
		JOptionPane.showMessageDialog(null, "Longest" + longestName
				+ "\nAverage char: " + String.format("%.0d", (totalCharacter/array.length))
				+ "\nSorted names: \n" + Arrays.toString(array), "Results"
				, JOptionPane.INFORMATION_MESSAGE);
		
		
	}
}

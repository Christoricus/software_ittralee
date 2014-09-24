//Exercise5.java
/*This program uses a user-defined method to display a square "graphic"*/

import javax.swing.JOptionPane;

public class Exercise5 {
	public static void main(String args[])
		{	
			int width;
			String widthAsString;
			
			widthAsString = JOptionPane.showInputDialog("Please enter the width of your" +
			" square graphic ");
			
			width = Integer.parseInt(widthAsString);
			squareGraphic(width);
			
			System.exit(0);			
		}

	public static void squareGraphic(int width)
		{
			int i,j;
			
			String text = "";
			
			for(i = 1;i <= width;i++)
				{
				 for(j = 1;j <= width;j++)
					 text += "#    ";
				 text += "\n";
				}
			JOptionPane.showMessageDialog(null,text,"Square Graphic",JOptionPane.PLAIN_MESSAGE);	
		}

}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
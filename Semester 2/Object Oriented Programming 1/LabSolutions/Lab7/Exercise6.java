//Exercise6.java
/*This program uses a user-defined method to display a square "graphic". It uses a arbitrary
 *fill character rather than just a hash*/

import javax.swing.JOptionPane;

public class Exercise6 {
	public static void main(String args[])
		{	
			int width;
			String fillCharacter;
				
			String widthAsString;
			
			widthAsString = JOptionPane.showInputDialog("Please enter the width of your" +
			" square graphic ");
			
			width = Integer.parseInt(widthAsString);
			
			fillCharacter = JOptionPane.showInputDialog("Please enter the fill " +
			"character");
					
			squareGraphic(width,fillCharacter);
			
			System.exit(0);		
		}

	public static void squareGraphic(int side,String fill)
		{
			int i,j;
			
			String text = "";
			
			for(i = 1;i <= side;i++)
				{
				 for(j = 1;j <= side;j++)
					 text += fill + "    ";
				 text += "\n";
				}
			JOptionPane.showMessageDialog(null,text,"Square Graphic",JOptionPane.PLAIN_MESSAGE);	
		}

}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
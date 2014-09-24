//Exercise4.java
/*This program makes several modifications to the FirstJFrame.java program*/

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String args[])
		{	 		
			 JFrame jFrameWindow = new JFrame();
			 String titleBarText;
			 
			 jFrameWindow.setTitle("Exercise4.java");
			 jFrameWindow.setSize(250,250);
			 jFrameWindow.setVisible(true);
			 jFrameWindow.setLocation(150,150);
			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			 titleBarText = jFrameWindow.getTitle();
			 			 
			 JOptionPane.showMessageDialog(null,"Text obtained from the JFrame title bar is" +
			 "\n\n\"" + titleBarText + "\"","Title Bar Text",JOptionPane.INFORMATION_MESSAGE);
			 			 
		}
}






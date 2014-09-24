//Exercise6.java
/*This program uses some other JFrame and JLabel methods to do various things. These are
 *ones we have not referred to before from the Java API documentation*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JOptionPane;


public class Exercise6 {
	public static void main(String args[])
		{	 		
			 JFrame jFrameWindow = new JFrame("Adding a JLabel to a JFrame");
			 
			 FlowLayout flowLayout = new FlowLayout();
			 flowLayout.setAlignment(FlowLayout.LEFT);

		     jFrameWindow.setLayout(flowLayout);
		     	     		 
			 jFrameWindow.setSize(300,100);

			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			 JLabel jLabel = new JLabel("Java rules!");
			 jLabel.setForeground(Color.RED);
			 jLabel.setToolTipText("A very important fact!");
		 	 
 			 jFrameWindow.add(jLabel);
 			 
			 jFrameWindow.setVisible(true);
			 	 			 
			 int choice = JOptionPane.showConfirmDialog(null,"Do you wish to remove the " + 
			 "JLabel from the JFrame?");	
			 
			 if(choice == JOptionPane.YES_OPTION)
			 	{
			 		jFrameWindow.remove(jLabel);
			 		jFrameWindow.repaint();
			 	}

			 
		}
}






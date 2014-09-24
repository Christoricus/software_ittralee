//AssessSoln.java
/*This GUI application changes the background colour of the JFrame window using button events*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AssessSoln {
	JButton jButtonRed,jButtonGreen;
	JLabel jLabelRed,jLabelGreen;
	int redClicked=0,greenClicked=0;
	Container contentPane;
	
	public AssessSoln()
		{	 		
			 JFrame jFrameWindow = new JFrame("Colours Application");
			 
			 contentPane = jFrameWindow.getContentPane();
			 
			 FlowLayout flowLayout = new FlowLayout();

		     jFrameWindow.setLayout(flowLayout);
		     	     		 
			 jFrameWindow.setSize(300,150);
			 
			 jFrameWindow.setLocation(300,300);

			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			 jLabelRed = new JLabel("The red button was clicked 0 times");
			 jLabelGreen = new JLabel("The green button was clicked 0 times");
			 
			 jButtonRed = new JButton("red");
			 jButtonGreen = new JButton("green");
		 	 
		 	 jFrameWindow.add(jButtonRed);
 			 jFrameWindow.add(jButtonGreen);
		 	 
 			 jFrameWindow.add(jLabelRed);
 			 jFrameWindow.add(jLabelGreen);
 			 
 			 jButtonRed.addActionListener(new ButtonEventHandler());
 			 jButtonGreen.addActionListener(new ButtonEventHandler());
 			 
			 jFrameWindow.setVisible(true);			 
		}
	
	public static void main(String args[])
		{
			AssessSoln guiApp = new AssessSoln();
		}
			
	private class ButtonEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == jButtonRed)
					{
						contentPane.setBackground(Color.RED);
						jLabelRed.setText("The red button was clicked " + ++redClicked + " times");
					}
				else
					{
						contentPane.setBackground(Color.GREEN);
						jLabelGreen.setText("The green button was clicked " + ++greenClicked + " times");
					}
			}
	}
}






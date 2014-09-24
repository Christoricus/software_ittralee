package thirdca2013;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GroupBC {
	
	//Global Variables
	int redClicked;
	int greenClicked;
	JButton red;
	JButton green;
	JLabel redText;
	JLabel greenText;
	Container contentPane;
	
	public GroupBC()
	{
		JFrame frame = new JFrame("Colours Application");
		contentPane = frame.getContentPane();
		
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
		
		red = new JButton("Red");
		frame.add(red);
		green = new JButton("Green");
		frame.add(green);
		
		redText = new JLabel("The red button was clicked " + redClicked + " times");
		frame.add(redText);
		greenText = new JLabel("The green button was clicked " + greenClicked + " times");
		frame.add(greenText);
		
		
		ButtonHandler handler = new ButtonHandler();
		red.addActionListener(handler);
		green.addActionListener(handler);
		
		frame.setVisible(true);
	}
	
	public static void  main(String[] args)
	{
		new GroupBC();
	}
	
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if ( e.getSource() == red ) {
				
				contentPane.setBackground(Color.RED);
				redText.setText("The red button was clicked " + ++redClicked + " times");
				//redClicked++;
				
			} else {
				
				contentPane.setBackground(Color.GREEN);
				greenText.setText("The red button was clicked " + ++greenClicked + " times");
				//greenClicked++;
				
			}
		}
	}

}

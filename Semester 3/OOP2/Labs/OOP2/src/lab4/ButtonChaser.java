package lab4;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ButtonChaser extends JFrame {
	JButton button;
	
	public ButtonChaser() {
		setTitle("The Button Chaser Application");
		setSize(275, 170);
		setLocationRelativeTo(null);
		//get a handle to the contents add to the container
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		//setDefaultCloseOperation();
		
		button = new JButton("Press Me");
		cPane.add(button);
		button.addActionListener(new EventHandler());
		
		addWindowListener(new EventHandler()); //Listen to the window;
		
		button.setMnemonic('P');
	}
	
	private class EventHandler extends WindowAdapter implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			/*if (e.getSource() ==  button) 
				button.setLocation(Math.random(), Math.random());
				*/
		}
		
		public void windowClosing(ActionEvent e) {
			System.exit(0);
		}
	} //end of private inner class
	
	public static void main(String[] args) {
		ButtonChaser btn = new ButtonChaser();
		btn.setVisible(true);
	}
}

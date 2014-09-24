package thirdca2013;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GroupD {
	
	//Global Variables
	JTextField kineticField, massField;
	
	public GroupD()
	{
		JFrame frame = new JFrame("Velocity Calculator");
		frame.setSize(300, 100);
		
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel kineticLabel = new JLabel("Kinetic Energy:");
		frame.add(kineticLabel);
		kineticField = new JTextField(5);
		kineticField.setToolTipText("Please enter kinetic energy");
		frame.add(kineticField);
		
		JLabel massLabel = new JLabel("Mass:");
		frame.add(massLabel);
		massField = new JTextField(5);
		massField.setToolTipText("Please enter mass");
		frame.add(massField);
		
		kineticField.addActionListener(new TextFieldHandler());
		massField.addActionListener(new TextFieldHandler());
		
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args)
	{
		new GroupD();
	}
	
	private class TextFieldHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String kinetic;
			String mass;
			double E;
			double m;
			double velocity = 0f;
			
			if (e.getSource() == kineticField )
				massField.requestFocus();
			
			else { 
				
				kinetic = kineticField.getText();
				mass = massField.getText();
				
				if ( kinetic.equals("") || mass.equals("") )
					JOptionPane.showMessageDialog(null, "Neither fields should be empty!",
							"Error", JOptionPane.ERROR_MESSAGE);
				
				else {
					
					E = Double.parseDouble(kinetic);
					m = Double.parseDouble(mass);
					
					if ( E > 0f && m > 0f ) 
					{
						velocity = Math.sqrt(2*E/m);
						JOptionPane.showMessageDialog(null, "Velocity is " + String.format("%.3f", velocity)
								+ "m/s", "Velocity", JOptionPane.INFORMATION_MESSAGE);
						
						kineticField.setText("");
						massField.setText("");
					
					} else
						JOptionPane.showMessageDialog(null, "Neither fields should be negative!",
								"Error", JOptionPane.ERROR_MESSAGE);				
				
				}
				
			}
		}
	}

}

package thirdca2014;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Group1 {

	//Global Variables
	JButton generateCaptcha;
	JLabel captchaLabel;
	JTextField captchaField;

	public Group1()
	{
		JFrame frame = new JFrame("Captcha Generator");
		frame.setSize(300, 100); //Mac OS needs 350,100 to view the frame properly
		FlowLayout layout =  new FlowLayout();
		//layout.setAlignment(FlowLayout.LEFT);

		frame.setLayout(layout);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		generateCaptcha = new JButton("Generate captcha");
		frame.add(generateCaptcha);

		captchaLabel = new JLabel("Not generated");
		frame.add(captchaLabel);

		JLabel label = new JLabel("Enter captcha:");
		frame.add(label);

		captchaField = new JTextField(10);
		frame.add(captchaField);

		generateCaptcha.addActionListener(new EventHandler());
		captchaField.addActionListener(new EventHandler());

		frame.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Group1();
	}

	private class EventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			char[] generate = new char[10];
			String captcha;

			if ( e.getSource() == generateCaptcha ) {
				for (int i = 0; i < 10; i++)
				{
					int R = (int) (Math.random() * (48 - 123)) + 48;
					
					while ( R > 57 && R < 65 || R > 90 && R < 97) {
						R = (int) (Math.random() * (48 - 123)) + 48;
					}
					generate[i] += (char) R;
				}


			}
			
			captcha = new String(generate);
			captchaLabel.setText(captcha);	
			String userInputtedCaptcha = captchaField.getText();

			if ( e.getSource() == captchaField ) {
				if (userInputtedCaptcha.equals(captcha) ) {
					JOptionPane.showMessageDialog(null, "Perfect!", "Valid", JOptionPane.INFORMATION_MESSAGE);


				} else {
					JOptionPane.showMessageDialog(null, "Not Perfect!", "Not Valid", JOptionPane.INFORMATION_MESSAGE);
					captchaField.setText("");

				}
			}


		} //end of actionPerformed method

	} //end of EventHandler class

}

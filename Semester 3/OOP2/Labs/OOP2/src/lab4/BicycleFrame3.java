package lab4;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class BicycleFrame3 extends JFrame {

	JButton frown;
	JButton smile;

	public BicycleFrame3() {
		setTitle("Bicycle Shop");
		setSize(400, 200);
		setLocation(100, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		frown = new JButton("Frown");
		frown.setPreferredSize(new Dimension(100, 30));
		add(frown);

		smile = new JButton("Smile");
		smile.setPreferredSize(new Dimension(100, 30));
		add(smile);

		// Set window icon
		setIconImage(getToolkit().getImage(
				getClass().getResource("cycling.png")));
		// Set background colour
		getContentPane().setBackground(Color.GRAY);

		frown.addActionListener(new ButtonHandler());
		smile.addActionListener(new ButtonHandler());
	}

	private class ButtonHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == frown) {
				ImageIcon icon = new ImageIcon(getClass().getResource(
						"frown.png"));
				JOptionPane.showMessageDialog(null, "You clicked frown",
						"Frown", JOptionPane.PLAIN_MESSAGE, icon);

			} else if (e.getSource() == smile) {
				ImageIcon icon = new ImageIcon(getClass().getResource(
						"smile.png"));
				JOptionPane.showMessageDialog(null, "You clicked smile",
						"smile", JOptionPane.PLAIN_MESSAGE, icon);
			}

		}// end of actionPerformed method
	} // end of private inner class

	public static void main(String[] args) {
		BicycleFrame3 myShop = new BicycleFrame3();
		myShop.setVisible(true);
	}
}

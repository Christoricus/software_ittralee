package lab4;

import javax.swing.*;

import java.awt.event.*;

public class MyJFrameWindow extends JFrame {

	public MyJFrameWindow() {
		setTitle("My Own JFrame Application");
		setSize(300, 200);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		addWindowListener( new WindowAdapter() { //start of anonymous-inner class

			public void windowClosing(WindowEvent e) {

				int check = JOptionPane.showConfirmDialog(null,
						"Are you sure you want to close?", "Yes/No/Cancel",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

				if ( check == JOptionPane.YES_OPTION ) {
					System.exit(0);
				}

			}

			public void windowIconified(WindowEvent e) {

				JOptionPane.showMessageDialog(null, "Minimising the window");
			}

			public void windowDeiconified(WindowEvent e) {

				JOptionPane.showMessageDialog(null, "Restoring the window");
			}

		});//end of anonymous inner class
	}

	public static void main(String[] args) {
		MyJFrameWindow myWindow = new MyJFrameWindow();
		myWindow.setVisible(true);
	}
}

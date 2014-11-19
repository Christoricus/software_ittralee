package lab4;

import javax.swing.*;

import java.awt.event.*;

public class MyJFrameWindow2 extends JFrame {

	public MyJFrameWindow2() {
		setTitle("My Own JFrame Application");
		setSize(300, 200);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		addWindowListener(new WindowEventHandler());
	}

	private class WindowEventHandler extends WindowAdapter {

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
	
	}//end of inner private class

	public static void main(String[] args) {
		MyJFrameWindow2 myWindow = new MyJFrameWindow2();
		myWindow.setVisible(true);
	}
}

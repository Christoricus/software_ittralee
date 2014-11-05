import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/** Frame class which handles its own button events */
public class TwoButtonsHandler1 extends JFrame implements ActionListener {
  
	JButton okButton, cancelButton;
	/** driver: opens the window */
	public static void main(String args[]){
		TwoButtonsHandler1 win = new TwoButtonsHandler1();
		win.setVisible(true);
	}
	
	/** sets the title, size and location, creates and adds buttons, sets colours and layout*/
	public TwoButtonsHandler1(){
		   // customise the window
			setTitle("Window with 2 buttons");
			setSize(300,200);
			setLocation(250,200);
			Container cPane = getContentPane();
			cPane.setBackground(Color.cyan);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			// create and add buttons
			cPane.setLayout(new FlowLayout());
			okButton = new JButton("OK");
			cancelButton = new JButton("Cancel");
			cPane.add(okButton);
			cPane.add(cancelButton);
			// add listeners for the buttons: 'this' class
			okButton.addActionListener(this);
			cancelButton.addActionListener(this);
	} // end constructor
	
	/** every time you click a button, program jumps to this method */
	public void actionPerformed(ActionEvent e) {
		// getSource() returns the object that was clicked
		if (e.getSource() == okButton)
		   JOptionPane.showMessageDialog(null,"You clicked OK!");
		else
		   JOptionPane.showMessageDialog(null, "You clicked Cancel!");
	} // end actionPerformed
}// end TwoButtonsHandler1 class
  
  								

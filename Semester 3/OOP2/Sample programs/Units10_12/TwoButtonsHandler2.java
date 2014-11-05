import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/** Frame class with two inner button-handling classes
 *  No longer implements actionlistener itself 
 */
public class TwoButtonsHandler2 extends JFrame {
    // declare buttons outside of any method
	JButton okButton, cancelButton;
	/** driver creates and displays the window */
	public static void main(String args[]){
		TwoButtonsHandler2 win = new TwoButtonsHandler2();
		win.setVisible(true);
	}
	
	public TwoButtonsHandler2(){
		   // customise the window
			setTitle("Window with 2 buttons");
			setSize(300,200);
			setLocation(250,200);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		   // customise the content pane
			Container cPane = getContentPane();
			cPane.setBackground(Color.cyan);
			cPane.setLayout(new FlowLayout());
			// create and add buttons
			okButton = new JButton("OK");
			cancelButton = new JButton("Cancel");
			cPane.add(okButton);
			cPane.add(cancelButton);
			// add listeners for the buttons: separate private inner class for each
			okButton.addActionListener(new OKButtonHandler());
			cancelButton.addActionListener(new CancelButtonHandler());
	} // end constructor

  /** inner class which handles clicks on the ok button */
  private class OKButtonHandler implements ActionListener{
	// specific to OK button, so no need for an 'if' statement
	public void actionPerformed(ActionEvent e) {
		  JOptionPane.showMessageDialog(null,"You clicked OK!");
	} // end actionPerformed
  } // end OKButtonHandler inner class
  
  /** handles clicks on the cancel button */
  private class CancelButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		  JOptionPane.showMessageDialog(null,"You clicked Cancel!");
	} // end actionPerformed
  } // end CancelButtonHandler inner class
}// end TwoButtonsHandler2 class

  
  								

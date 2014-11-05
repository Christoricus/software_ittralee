import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/** Frame class with two buttons, but no action when clicked*/
public class TwoButtonsNoHandlers  extends JFrame {
  
	JButton okButton, cancelButton; // two buttons, so declare them outside all methods
	/** driver opens the window */
	public static void main(String args[]){
		
		TwoButtonsNoHandlers win = new TwoButtonsNoHandlers();
		win.setVisible(true);
	}
	
	/** configures the window and creates and adds the buttons */
	public TwoButtonsNoHandlers(){
		// configure the window
			setTitle("Window with 2 buttons");
			setSize(300,200);
			setLocation(250,200);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		// configure the content pane, where buttons will go
			Container cPane = getContentPane();
			cPane.setBackground(Color.cyan);
			cPane.setLayout(new FlowLayout());
		// declare, create and add two buttons to the content pane
			okButton = new JButton("OK");
			cancelButton = new JButton("Cancel");
			cPane.add(okButton);
			cPane.add(cancelButton);
	} // end constructor
}// end TwoButtonsNoHandlers class
  
  								

import javax.swing.*;
import java.awt.event.*;
/** Frame class which implements WindowListener interface
 */
public class ClosingWindow3 extends JFrame implements WindowListener {
  
	public static void main(String args[]){
		ClosingWindow3 win = new ClosingWindow3();
		win.setVisible(true);
	}
	
	public ClosingWindow3(){
			super("This is a JFrame window");
			setSize(275,170);
			setLocation(250,200);
			addWindowListener(this);// handling done in this class		
	} // end constructor
	
	public void windowClosing(WindowEvent e){
				System.out.println("Test message to console");
				System.exit(0);
	} // end windowClosing
			
	// empty implementations of all other Windowlistener methods
	public void windowActivated(WindowEvent e){ }	
	public void windowClosed(WindowEvent e){ }	
	public void windowDeactivated(WindowEvent e){ }	
	public void windowIconified(WindowEvent e){ }	
	public void windowDeiconified(WindowEvent e){ }	
	public void windowOpened(WindowEvent e){ }	
}// end ClosingWindow3 class
  
  								

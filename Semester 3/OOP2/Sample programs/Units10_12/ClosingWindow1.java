import javax.swing.*;
import java.awt.event.*;
/** Creates and displays a simple window by extending JFrame
 *  Displays a customised message on closing the window */
public class ClosingWindow1 extends JFrame {
  
  /** driver for ClosingWindow1: can be in a separate class */
  public static void main(String args[]){
	ClosingWindow1 win = new ClosingWindow1();
	win.setVisible(true);
   }
  
  // constructor
  public ClosingWindow1(){
	super("This is a JFrame window");
	setSize(275,170);
	setLocation(250,200);
	// take non-standard action when the window is closed
	addWindowListener(new WindowEventHandler());		
  }

  // specify the window-closing behaviour using an adapter class
  private class WindowEventHandler extends WindowAdapter {
	 public void windowClosing(WindowEvent e){
	      JOptionPane.showMessageDialog(null,"Closing the window");
	      System.exit(0);
	 } // end method
  }  // end WindowEventHandler inner class
}  		// end ClosingWindow1	class		
import javax.swing.*;
import java.awt.event.*;
/** Shows a window being created and uses an anonymous inner class
 */
public class ClosingWindow2 extends JFrame {
  
	public ClosingWindow2(){
			super("This is a JFrame window");
			this.setLocation(200,200);
						
	} // end constructor
	
	public static void main(String args[]){
		ClosingWindow2 win = new ClosingWindow2();
		win.setVisible(true);
		win.setSize(275,170);
			
		win.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				JOptionPane.showMessageDialog(null,"Closing Down");
				System.exit(0);
			} // end windowClosing
		  }// end anonymous inner class definition
		); //end of addWindowListener method argument
	} // end main
}// end ClosingWindow2 class
  
  								

import javax.swing.*;
/** Basic Frame class */
public class SimplestWindow extends JFrame {
  
	public static void main(String args[]){
		SimplestWindow win = new SimplestWindow();
		win.setVisible(true);
	} 
	
	public SimplestWindow(){
			this.setTitle("My Window");
			setSize(300,200);
			setLocation(250,200);
			// exit as the default closing operation
			// see the other possibilities in JFrame class
			setDefaultCloseOperation(EXIT_ON_CLOSE);
	} // end constructor
}// end SimpleWindow class
  
  								

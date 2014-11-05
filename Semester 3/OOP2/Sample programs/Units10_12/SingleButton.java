import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/** Shows the creation of a JButton inside a JFrame window */
public class SingleButton extends JFrame {
	// declare the button as an attribute of the class
	JButton button;
  	/** configures the window and creates and adds the button */
  	public SingleButton() {
			super("Demonstrating a JButton inside a JFrame window");
			// get a handle to the content pane, for adding components
			Container cPane = getContentPane();
			// set up the easiest layout manager to arrange components on it
			cPane.setLayout(new FlowLayout());
			// create the button
			button = new JButton("Press here");
			// add it to the content
			cPane.add(button);
			// make the system listen when button is clicked	
			button.addActionListener(new ButtonListener());	
			// size and display the window: these two commands essential	
			setSize(275,170);			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	/** driver creates the window */
	public static void main(String args[]){
			SingleButton b = new SingleButton();
			b.setVisible(true);
		}
		
	/** inner class to handle the button clicks */
	private class ButtonListener implements ActionListener {
	  /** display a dialog if button clicked */ 
	  public void actionPerformed(ActionEvent e)
	  	{
	  		JOptionPane.showMessageDialog(null,"You have pressed the button");
	  	}
    }// end buttonlistener inner class
    
  } // end SingleButton class

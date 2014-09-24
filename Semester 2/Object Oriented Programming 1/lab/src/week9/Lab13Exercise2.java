package week9;
import javax.swing.JOptionPane;

public class Lab13Exercise2 {
    
    public static void main(String[] args)
    {
	
	String message = "";
	int choice;
	
	choice = JOptionPane.showConfirmDialog(null, "Take your pick - yes/no/cancel"
		, "Yes/No/Cancel", JOptionPane.YES_NO_CANCEL_OPTION);
	
	
	if ( choice == JOptionPane.YES_OPTION )
	    message = "You chose yes";
	
	else if ( choice == JOptionPane.NO_OPTION )
	    message = "You chose no";
	
	else if ( choice == JOptionPane.CANCEL_OPTION )
	    message = "You chose cancel";
	
	else if ( choice == JOptionPane.CLOSED_OPTION )
	    message = "You closed the window without choosing anything";
	    
	
	JOptionPane.showMessageDialog(null, message, "Yes/no/cancel", JOptionPane.PLAIN_MESSAGE);
	
	System.exit(0);
    
    }

}

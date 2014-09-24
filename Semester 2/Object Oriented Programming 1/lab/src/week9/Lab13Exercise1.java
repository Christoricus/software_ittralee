package week9;
import javax.swing.JOptionPane;

public class Lab13Exercise1 {
    
    public static void main(String[] args)
    {
	JOptionPane.showMessageDialog(null, "This is an error message", "Error Message"
		, JOptionPane.ERROR_MESSAGE);
	
	JOptionPane.showMessageDialog(null, "This is an information message", "Information Message"
		, JOptionPane.INFORMATION_MESSAGE);
	
	JOptionPane.showMessageDialog(null, "This is a warning message", "Warning Message"
		, JOptionPane.WARNING_MESSAGE);
	
	JOptionPane.showMessageDialog(null, "This is a question message", "Question Message"
		, JOptionPane.QUESTION_MESSAGE);
	
	JOptionPane.showMessageDialog(null, "This is a plain message", "Plain Message"
		, JOptionPane.PLAIN_MESSAGE);
	
	System.exit(0);
    }

}

import javax.swing.*; 
import java.awt.*;  
/** demonstrates using a JTextarea within a message Dialog */
public class DialogDemoA {
   /** calculates the cost of buying lunch for lots of friends */
   public static void main( String args[] ) {
   	// create the text area, call it 'output' (nothing special about this)
     JTextArea output = new JTextArea();
    // set the cost of lunch, and the maximum number for the table
    // 'final' means the value is constant, and cannot be changed
    // further along in the program
     final double LUNCH_COST = 7.99;
     int maxLunches = 8;
     double cost; // temp variable
    // set the heading of the text area
     output.setText("Greetings, all mortals\n");
    // add a sub-heading, and a heading for the table
     output.append("Here's what buying lunch for your friends will cost\n\n");
     output.append("Number of lunches    Cost\n");	
    // now calculate each line of the table and add it to the display
     for (int num = 1; num <= maxLunches; num++){
    	cost = num * LUNCH_COST;
      	output.append("                   " + num + "                 " + cost + "\n");
     } // end for
    // Finally, display all the output together
     JOptionPane.showMessageDialog(null,output, "Cost of lunch is " + LUNCH_COST,
                                    JOptionPane.WARNING_MESSAGE);
    }// end main
}// end class


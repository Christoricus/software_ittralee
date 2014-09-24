import javax.swing.*; 
import java.awt.*;  
/** demonstrates using String.format() in a JTextarea 
 *  and how to include an icon: needs T17.gif
 **/
public class DialogDemoB {
   /** calculates the cost of buying lunch for lots of friends */
   public static void main( String args[] ){
   	// create the text area and a string to hold one line of output
    JTextArea output = new JTextArea();
    Font monoFont = new Font("Courier",Font.PLAIN,14);
    output.setFont(monoFont);
    String outputLine;
    // set the cost of lunch, and the maximum number for the table
    final double LUNCH_COST = 7.99;
    int maxLunches =10;
    double cost; // temp variable
    // set the heading of the text area
    output.setText("Greetings, all mortals\n");
    // add a sub-heading, and a heading for the table
    output.append("Here's what buying lunch for your friends will cost\n\n");
    // note the use of String.format to get control over spacing
    outputLine = String.format("%-20s %8s\n","Number of lunches","Cost");	
    output.append(outputLine);
    // now calculate each line of the table and add it to the display
    for (int num = 1; num <= maxLunches; num++){
    	cost = num * LUNCH_COST;
    	outputLine = String.format("%-20d %8.2f\n",num,cost);
    	output.append(outputLine);
    }
    // Finally, display all the output together
    ImageIcon burger = new ImageIcon("hamburger01.gif");
    JOptionPane.showMessageDialog(null,output, "Cost of lunch is " + LUNCH_COST,
                                    JOptionPane.PLAIN_MESSAGE, burger);
      
   }
}


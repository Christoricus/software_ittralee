import javax.swing.*;
import java.awt.*; // for Color
/** example of creating GUI objects, v4 */
public class UsingObjectsDemo4 {
   /** adds a button to f1 and a text field to f2 */
   public static void main( String args[] ) {
      JFrame f1 = new JFrame("First Frame" );
      f1.setSize(200,200);
      f1.setLocation(100,100);
      Container f1Pane = f1.getContentPane();  
      f1Pane.setBackground(Color.YELLOW);  
      JButton b1 = new JButton("Click me!");  // ADDED
      f1Pane.add(b1, "North");  // ADDED
      f1.setVisible(true);
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JFrame f2 = new JFrame("second Frame" );
      f2.setSize(200,200);
      f2.setLocation(500,500);
      Container f2Pane = f2.getContentPane();  
      f2Pane.setBackground(Color.GREEN);  
      JTextField field = new JTextField(12);  // ADDED
      f2Pane.add(field, "South");  // ADDED
      f2.setVisible(true);
      f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   } // end main
} // end class UsingObjectsDemo


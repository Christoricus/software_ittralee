import javax.swing.*;
import java.awt.*; // for Color and Container ADDED
/** example of creating GUI objects, v2 */
public class UsingObjectsDemo2 {
   /** sets a colour for the background of the content pane */
   public static void main( String args[] ) {
      JFrame f1 = new JFrame("First Frame" );
      f1.setSize(200,200);
      f1.setLocation(100,100);
      Container f1Pane = f1.getContentPane(); // ADDED
      f1Pane.setBackground(Color.YELLOW); // ADDED
      f1.setVisible(true);
      JOptionPane.showMessageDialog(f1,"I can anchor my dialog to this frame");
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   } // end main
} // end class UsingObjectsDemo


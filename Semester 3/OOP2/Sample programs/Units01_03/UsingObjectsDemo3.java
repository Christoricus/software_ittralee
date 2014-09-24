import javax.swing.*;
import java.awt.*; // for Color
/** example of creating GUI objects, v3 */
public class UsingObjectsDemo3 {
   /** has two Frame objects, f1 and f2 */
   public static void main( String args[] ) {
      JFrame f1 = new JFrame("First Frame" );
      f1.setSize(200,200);
      f1.setLocation(100,100);
      Container f1Pane = f1.getContentPane();
      f1Pane.setBackground(Color.YELLOW);
      f1.setVisible(true);
      JOptionPane.showMessageDialog(f1,"I can anchor my dialog to this frame");
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // block of code added
      JFrame f2 = new JFrame("second Frame" );
      f2.setSize(200,200);
      f2.setLocation(500,500);
      Container f2Pane = f2.getContentPane();
      f2Pane.setBackground(Color.GREEN);
      f2.setVisible(true);
      JOptionPane.showMessageDialog(f2,"or to this one");
      f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   } // end main
} // end class UsingObjectsDemo


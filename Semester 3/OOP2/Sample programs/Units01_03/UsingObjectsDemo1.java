import javax.swing.*;
/** example of creating GUI objects, v2 */
public class UsingObjectsDemo1 {
   /** sets a location for the frame */
   public static void main( String args[] ) {
      JFrame f1 = new JFrame("First Frame" );
      f1.setSize(200,200);
      f1.setLocation(100,100);
      f1.setVisible(true);
      JOptionPane.showMessageDialog(f1,"I can anchor my dialog to this frame");
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   } // end main
} // end class UsingObjectsDemo


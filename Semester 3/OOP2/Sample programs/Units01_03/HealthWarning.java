import javax.swing.*;
/** example of a message dialog with title and style */
public class HealthWarning
{
   /** Displays a message dialog with warning icon and a title */
   public static void main( String args[] ){
      
      JOptionPane.showMessageDialog(null, "Dracula is in town!",
             "Health Warning",JOptionPane.WARNING_MESSAGE);

   } // end main
} // end class HealthWarning


import javax.swing.*;
/** How to use an icon in an input dialog and in a message dialog:
 *  Needs 'bird.gif' or another icon in the same folder */
public class IconDialogExample1
{
   public static void main( String args[] )
   {
      // prompt user to enter name, and get the name
     String name = JOptionPane.showInputDialog("What is your name?" ); 
      
     // create the output message
      String message = "Welcome, " + name + ", to OOP2";

     // display the message to welcome the user by name, with a heading and an icon 
     JOptionPane.showMessageDialog( null, message,"Greetings",JOptionPane.PLAIN_MESSAGE,
                                                           new ImageIcon("Bird.gif") );
   } // end main
} // end class IconDialogExample


import javax.swing.*;
/** How to use an icon in an input dialog and in a message dialog:
 *  Needs 'bird.gif' or another icon in the same folder */
public class IconDialogExample2
{
   public static void main( String args[] ){
      /* Using an icon in an input dialog is complicated: the dialog returns an object
       * First you have to read the object, then tell the compiler it's actually a String
       */
      
      // get the object and read what is entered
      Object tempName =                                          
         JOptionPane.showInputDialog(null,(new ImageIcon("Bird.gif")),"What is your name?" , 
         JOptionPane.PLAIN_MESSAGE  ); 
      
      // tell the program the object read is actually a string
      String name = (String) tempName;
      // create the output message
      String message = "Welcome, " + name + ", to OOP2";

     // display the message to welcome the user by name, with a heading and an icon 
     JOptionPane.showMessageDialog( null, message,"Greetings",JOptionPane.PLAIN_MESSAGE,
                                                                        new ImageIcon("Bird.gif") );
   } // end main
} // end class IconDialogExample


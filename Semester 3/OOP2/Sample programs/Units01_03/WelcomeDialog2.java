import javax.swing.*; // import statement needed for dialogs
/** Example of input dialog and message dialog*/
public class WelcomeDialog2 { 
   /** Asks for user name, in an input dialog, and displays it in a welcome message  */
   public static void main( String args[] ){
   	// ask for input, and store that input in the variable 'name'
   	  String name = JOptionPane.showInputDialog("What's your name?");
      JOptionPane.showMessageDialog(null, "Welcome, " + name + ", to OOP2" );
   }
} 


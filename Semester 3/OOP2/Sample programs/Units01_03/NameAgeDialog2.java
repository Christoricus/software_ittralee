import javax.swing.JOptionPane;
/** example of formatting the output to a message dialog using String.format() */
public class NameAgeDialog2 {
   /** main asks for name and age, and displays the age in one year*/
   public static void main( String args[] ) {
      // prompt user to enter name and age
      String name;
      int age;
      name =  JOptionPane.showInputDialog( "What is your name?" );
      age = Integer.parseInt(JOptionPane.showInputDialog("How old are you? "));
  
      // Format the output message string
      String message = String.format("Welcome, %s, to OOP2.\nNext year you will be %d years old.",
                                       name, (age+1));
      // display the result in a dialog
      JOptionPane.showMessageDialog( null, message);
   } // end main
} // end class NameDialog2


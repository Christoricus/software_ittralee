import javax.swing.JOptionPane;
/** example of reading a number from an input dialog and converting it to binary */
public class NameAgeDialog1 {
   /** asks for name and age, and displays age in a year's time */
   public static void main( String args[] ) {
      // declare variables
      String name;
      int age;
      // prompt user for name, and store the name
      name = JOptionPane.showInputDialog( "What is your name?" );
      // ask user for age, get the result, convert to an int and store as 'age'
      age = Integer.parseInt(JOptionPane.showInputDialog("How old are you? "));

      // display a message showing user's age in a year's time
      // for this to work, age must be an int
      // the brackets are needed to avoid String concatenation
      JOptionPane.showMessageDialog( null, "Welcome, "+ name + " to OOP2\n"+
                         "Next year you will be " + (age +1));
   } // end main
} // end class NameDialog1


import javax.swing.JOptionPane;
/** Example of reading chars and doubles from an input dialog */
public class NameAgeDialog3 {
   /** asks for name, age, gender and money spent */
   public static void main( String args[] ) {
      // declare the variables, all of different types.  
      String name; // Strings can store lots of letters and chars
      int age;
      char gender; // chars store only one letter or other char
      double money;
      
      // read the name, this is easy
      name =  JOptionPane.showInputDialog( "What is your name?" );
      // read the age, which is an int
      age = Integer.parseInt(JOptionPane.showInputDialog("How old are you? "));
      // get the gender: this is the first char entered, ie char number 0
      gender = JOptionPane.showInputDialog("Enter your gender m/f:").charAt(0);
      // get the money spent last weekend, which might have a decimal
      money = Double.parseDouble(JOptionPane.showInputDialog("How much money did you spend last weekend?"));
      // Display this information in stages
      // do it like this so as not to make small errors in the message dialog
      JOptionPane.showMessageDialog( null, "Name: " + name + " gender: " 
                                            + gender);
      JOptionPane.showMessageDialog(null,"Age: " + age + "\nMoney spent " +
                                           + money);
   } // end main
} // end class NameDialog3


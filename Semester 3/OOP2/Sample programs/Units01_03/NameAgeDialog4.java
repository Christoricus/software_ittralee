import javax.swing.JOptionPane;
/** example of String.format() for message dialog output */
public class NameAgeDialog4 {
   /** asks for name, age, gender and money spent and repeats them */
   public static void main( String args[] ){
      // declare variables
      String name;
      int age;
      char gender;
      double money;
      
      // get all user input, converting to appropriate type where necessary
      name =  JOptionPane.showInputDialog( "What is your name?" );
      age = Integer.parseInt(JOptionPane.showInputDialog("How old are you? "));
      gender = JOptionPane.showInputDialog("Enter your gender m/f:").charAt(0);
      money = Double.parseDouble(JOptionPane.showInputDialog("How much money did you spend last weekend?"));
      
      // Format the output message string
      String message = String.format("Name: %s\nGender: %c\nAge: %d\nMoney Spent: %.2f",
                                       name, gender,age,money);
      // now display the message
      JOptionPane.showMessageDialog( null, message);
   } // end main
} // end class NameDialog4


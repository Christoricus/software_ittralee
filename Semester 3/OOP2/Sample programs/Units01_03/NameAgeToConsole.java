import javax.swing.JOptionPane;
/** example of System.out.printf */
public class NameAgeToConsole{
   /** asks for name, age, gender and money spent and repeats them */
   public static void main( String args[] ){
      // prompt user to enter name
      String name;
      int age;
      char gender;
      double money;
      
      name =  JOptionPane.showInputDialog( "What is your name?" );
      age = Integer.parseInt(JOptionPane.showInputDialog("How old are you? "));
      gender = JOptionPane.showInputDialog("Enter your gender m/f:").charAt(0);
      money = Double.parseDouble(JOptionPane.showInputDialog("How much money did you spend last weekend?"));
      // Format the output using printf
      System.out.printf("Name: %s\nGender: %c\nAge: %d\nMoney Spent: %.2f\n",
                                       name, gender,age,money);
    } // end main
} // end class NameAgeToConsole


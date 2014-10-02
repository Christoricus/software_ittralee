import javax.swing.*;
import java.text.*; // for SimpleDateFormat class
import java.util.*; // for Date class
/** Uses Date to get today's date, and SimpleDateFormat to format it for display
 *  Uses a Locale to adapt it for a different country
 */
public class DateTest1 {
   public static void main( String args[] ){
      Date today;
      today = new Date();
      SimpleDateFormat f1 = new SimpleDateFormat();
      SimpleDateFormat f2 = new SimpleDateFormat("EEEE MMMM dd, yyyy", Locale.FRANCE);
      JOptionPane.showMessageDialog(
         null, "today is " + f1.format(today) + " or " + f2.format(today) );

      SimpleDateFormat f3 = new SimpleDateFormat("EEEE MMMM dd'th', yyyy");
      JOptionPane.showMessageDialog(
         null, "today is " + f3.format(today) );
   }
}

import javax.swing.JOptionPane;   
import java.text.*;
import java.util.*;
/** uses the Locale class to tailor the display of today's date
 *  in connection with the DateFormat class
 */
public class DateTest2 {
   public static void main( String args[] )
   {
      Date today;
      today = new Date();
      // options include SHORT, MEDIUM, LONG and FULL
      DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
	  DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.ITALY);

      JOptionPane.showMessageDialog(
         null, "today in France is " + df.format(today) );
      JOptionPane.showMessageDialog(null,"or in Italy " + df2.format(today));
   }
}

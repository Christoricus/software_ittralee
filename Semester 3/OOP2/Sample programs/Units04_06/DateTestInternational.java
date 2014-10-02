import javax.swing.*;
import java.text.*; // for SimpleDateFormat class
import java.util.*; // for Date class
/** Uses GregorianCalendar to get today's date, 
 *  the getTime() method to get a Date
 *  and SimpleDateFormat to format it for display
 *  Uses a Locale to adapt it for a different country
 */
public class DateTestInternational {
   public static void main( String args[] ){
      GregorianCalendar today = new GregorianCalendar();
      // create a few Locale objects for different countries
      Locale spain = new Locale("es");
      Locale ie = new Locale("ga");
      Locale poland = new Locale("pl");
      Locale hungary = new Locale("hu");
      // configure a formatter for the country we would like
      SimpleDateFormat f = new SimpleDateFormat("EEEE dd MMMM yyyy", poland);
      // output the date: use getTime() to convert from Calendar to Date
      // then format() from the SimpleDateFormat class to format the Date
      JOptionPane.showMessageDialog(
         null, "today is " + f.format(today.getTime()) );
    
   }
}

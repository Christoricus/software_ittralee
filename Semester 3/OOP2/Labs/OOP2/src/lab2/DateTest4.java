package lab2;

import javax.swing.*;
import java.text.*;
import java.util.*;
/** sets up a birthday date using GregorianCalendar
 *  uses some of the Calendar methods  and fields to format its display
 *  such as getDisplayName, Calendar.MONTH and Calendar.LONG
 */
public class DateTest4 {
   public static void main( String args[] ) {
      GregorianCalendar today,birthday;
      // capture today's date
      today = new GregorianCalendar();
      // set up the date of your birthday: nb year, month, day: and month counts from 0
      birthday = new GregorianCalendar(1992,06,02);
      SimpleDateFormat f3 = new SimpleDateFormat("EEEE MMMM dd'th', yyyy");
      JOptionPane.showMessageDialog(
         null, "today is " + f3.format(today.getTime()) );
      JOptionPane.showMessageDialog(
         null, "My birthday is " + f3.format(birthday.getTime()) );
      // get the name of birthday month, in English, then display it
      String monthName = birthday.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
      JOptionPane.showMessageDialog(null,"I was born in the month of " + monthName);
      // display the year of birth only
      JOptionPane.showMessageDialog(null,"in the year " + (birthday.get(Calendar.YEAR)));
      // get the name of the day of the week of your birthday, in English, and display it
      String dayName = birthday.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
      JOptionPane.showMessageDialog(null,"on a " + dayName);
   }
}

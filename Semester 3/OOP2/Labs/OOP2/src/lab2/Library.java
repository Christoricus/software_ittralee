package lab2;
import javax.swing.*;
import java.text.*;
import java.util.*;

public class Library {
	public static void main(String[] args) {
		String day, month, year;
		int d, m, y;
		
		GregorianCalendar borrowDate = null;
		GregorianCalendar returnDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE MMMM dd'th', yyyy", Locale.UK);
		
		String[] ar = {"borrowed", "rented"};
		
		for (int i = 0; i < ar.length; i++) {
			day = JOptionPane.showInputDialog("Day " + ar[i]);
			month = JOptionPane.showInputDialog("Month ") + ar[i];
			year = JOptionPane.showInputDialog("Year " + ar[i]);

			if (i == 0) {
				d = Integer.parseInt(day);
				m = Integer.parseInt(month);
				y = Integer.parseInt(year);
				borrowDate = new GregorianCalendar(d, m, y);
			} else if (i == 1) {
				d = Integer.parseInt(day);
				m = Integer.parseInt(month);
				y = Integer.parseInt(year);
				returnDate = new GregorianCalendar(d, m, y);	
			}
		}
		
		JOptionPane.showMessageDialog(null, "Borrow date is: " + sdf.format(borrowDate.getTime()));
		
	}//end of main

}

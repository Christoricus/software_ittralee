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
			
			if (i == 0) {
				day = JOptionPane.showInputDialog("Day " + ar[i]);
				month = JOptionPane.showInputDialog("Month " + ar[i]);
				year = JOptionPane.showInputDialog("Year " + ar[i]);
				
				d = Integer.parseInt(day);
				m = Integer.parseInt(month);
				y = Integer.parseInt(year);
				borrowDate = new GregorianCalendar(y, m-1, d);
			
			} else if (i == 1) {
				day = JOptionPane.showInputDialog("Day " + ar[i]);
				d = Integer.parseInt(day);
				while (returnDate.get(Calendar.DATE) < borrowDate.get(Calendar.DATE)) {
					year = JOptionPane.showInputDialog("Error! Year " + ar[i]);
					d = Integer.parseInt(day);

				}
				
				month = JOptionPane.showInputDialog("Month " + ar[i]);
				m = Integer.parseInt(month);
				
				year = JOptionPane.showInputDialog("Year " + ar[i]);
				y = Integer.parseInt(year);
				while (returnDate.get(Calendar.YEAR) != borrowDate.get(Calendar.YEAR)) {
					year = JOptionPane.showInputDialog("Error! Year " + ar[i]);
					y = Integer.parseInt(year);
				}
					
				
				returnDate = new GregorianCalendar(d, m, y);	
			}
		}
		
		JOptionPane.showMessageDialog(null, "Borrow date is: " + sdf.format(borrowDate.getTime()));
		JOptionPane.showMessageDialog(null, "Borrow date is: " + sdf.format(returnDate.getTime()));

		
	}//end of main

}

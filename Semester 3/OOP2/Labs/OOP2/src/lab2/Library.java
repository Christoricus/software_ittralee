package lab2;
import javax.swing.*;
import java.text.*;
import java.util.*;

public class Library {
	static GregorianCalendar borrowDate;
	static GregorianCalendar returnDate;

	public static void main(String[] args) {
		int d = 0, m = 0, y = 0;
		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");

		borrowDate = new GregorianCalendar();
		returnDate = new GregorianCalendar();

		// year, month, date | month start from 0
		enterDate(y, m, d);

		if (isReturnDateValid(y, m, d)) {
			JOptionPane.showMessageDialog(null,
					"Date borrowed: " + f1.format(borrowDate.getTime()));
			JOptionPane.showMessageDialog(null,
					"Date returned: " + f1.format(returnDate.getTime()));

			totalDaysKept();
		}

		System.exit(0);

	}// end of main

	public static void enterDate(int y, int m, int d) {
		String[] ar = {"borrowed", "returned"};

		for (int i = 0; i < ar.length; i++) {
			String date, month, year;
			// Ask to enter date
			date = JOptionPane.showInputDialog("Enter date you " + ar[i]);
			while (!isDigit(date)) {
				date = JOptionPane.showInputDialog("Error! Enter date you "
						+ ar[i]);
			}
			// Ask to enter month
			month = JOptionPane.showInputDialog("Enter month you " + ar[i]);
			while (!isDigit(month)) {
				month = JOptionPane.showInputDialog("Error! Enter month you "
						+ ar[i]);
			}
			// Ask to enter year
			year = JOptionPane.showInputDialog("Enter year you " + ar[i]);
			while (!isDigit(year)) {
				year = JOptionPane.showInputDialog("Error! Enter year you "
						+ ar[i]);
			}
			// Convert the strings to integers
			d = Integer.parseInt(date);
			m = Integer.parseInt(month);
			y = Integer.parseInt(year);

			if (i == 0)
				borrowDate.set(y, m - 1, d);
			else
				returnDate.set(y, m - 1, d);

		}
	}

	public static boolean isReturnDateValid(int y, int m, int d) {
		boolean valid = false;

		while (!valid) {
			// year should be equal
			if (returnDate.get(Calendar.YEAR) == borrowDate.get(Calendar.YEAR)) {
				// months can be == or >
				// when months are equal, returnDate >= borrowDate
				if ((returnDate.get(Calendar.MONTH) == borrowDate
						.get(Calendar.MONTH) && returnDate.get(Calendar.DATE) >= borrowDate
						.get(Calendar.DATE))
						// when returnMonth > borrowMonth
						|| returnDate.get(Calendar.MONTH) > borrowDate
								.get(Calendar.MONTH)) {

					valid = true;

					// otherwise ask for date again
				} else {
					d = Integer.parseInt(JOptionPane
							.showInputDialog("Error! Enter date you rented"));
					returnDate.set(y, m, d);
				}

				// otherwise ask for year again
			} else {
				y = Integer.parseInt(JOptionPane
						.showInputDialog("Error! Enter year you rented"));
				returnDate.set(y, m, d);
			}

		} // end of validation while loop

		return valid;

	}// end if isValid method

	public static boolean isDigit(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))
				return true;
		}
		return false;
	}

	public static void totalDaysKept() {
		int total = returnDate.get(Calendar.DAY_OF_YEAR)
				- borrowDate.get(Calendar.DAY_OF_YEAR);

		JOptionPane.showMessageDialog(null, "Amount of days kept: " + total,
				"Days Kept", JOptionPane.INFORMATION_MESSAGE);
	}
}

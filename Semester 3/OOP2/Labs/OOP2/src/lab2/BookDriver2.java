package lab2;
import java.awt.Font;
import javax.swing.*;

public class BookDriver2 {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		JTextArea msg = new JTextArea();
		Font msgFont = new Font("Courier", Font.BOLD, 16);
		
		String[] ttl = new String[2];
		String[] isbn = new String[2];
		String[] fave = new String[2];
		double[] prc = new double[2];
		int[] pgs = new int[2];
		
		for (int i = 0; i < ttl.length; i++) {
			ttl[i] = JOptionPane.showInputDialog("Enter book title");
			fave[i] = JOptionPane.showInputDialog("Favourite or Least favourite?");
			prc[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter book price"));
			isbn[i] = JOptionPane.showInputDialog("Enter ISBN #");
			pgs[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter book pages"));
		}
		
		//Book 1
		book1.setBookTitle(ttl[0]);
		book1.setBookPrice(prc[0]);
		book1.setBookISBN(isbn[0]);
		book1.setBookPages(pgs[0]);
		
		//Book 2
		book2.setBookTitle(ttl[1]);
		book2.setBookPrice(prc[1]);
		book2.setBookISBN(isbn[1]);
		book2.setBookPages(pgs[1]);
		
		//Using JTextArea to print out two objects
		msg.setFont(msgFont);
		msg.setText(book1.toString());
		msg.append("Favourite?: " + fave[0] + "\n\n");
		msg.append(book2.toString());
		msg.append("Favourite?: " + fave[1]);
		
		//Displaying the JTextArea
		JOptionPane.showMessageDialog(null, msg);		
	}

}

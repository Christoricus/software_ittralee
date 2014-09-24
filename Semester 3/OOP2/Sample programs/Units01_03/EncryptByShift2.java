import javax.swing.*;
import java.util.*;
/** demonstrates simple encryption of chars
 */
public class EncryptByShift2 {
	/** encrypts as many chars as you care to enter
	 */
	public static void main (String args[]){
		char letter; 
		char encryptedLetter;
		int count = 0;
		Scanner input = new Scanner(System.in);
		letter = input.nextLine().charAt(0);//JOptionPane.showInputDialog("enter a letter, 9 to end").charAt(0);
		while (letter != '9') {		
		   encryptedLetter = (char) (letter + 1);
		   JOptionPane.showMessageDialog(null,"Encrypted char is " + encryptedLetter);
		   count++;
		   letter = JOptionPane.showInputDialog("enter a letter, 9 to end").charAt(0);
		} // end while
		JOptionPane.showMessageDialog(null,"You encrypted " + count + 
		                               " letters in total");
	}// end main
} // end class
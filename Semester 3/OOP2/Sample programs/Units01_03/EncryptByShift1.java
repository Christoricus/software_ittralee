/** demonstrate encryption by treating a char as an int, and shifting up one
 */
public class EncryptByShift1 {
	/** encrypts a single char, using a Caesar cipher with a shift of 1
	 */
	public static void main (String args[]){
		char letter = 'A';
		char encryptedLetter;
		
		encryptedLetter = (char) (letter + 1);
		System.out.println("Original char is " + letter);
		System.out.println("Encrypted char is " + encryptedLetter);
	}
}
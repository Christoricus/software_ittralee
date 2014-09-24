/* Check if the ISBN provided by the user is valid.
 * (0 x 10) + (1 x 9) + (4 x 8) + (0 x 7) + (1 x 6) + (2 x 5) + (4 x 4) + (9 x 3) + (9 x 2) = 118
 * and 118/11 = 10 remainder 8 and finally
 * 11-8 = 3 which is equal to the check digit.
 */
package Assess2012Two;
import java.util.Scanner;
public class GroupA {
	public static void main(String[] args) 
	{
		String ISBN = "";
		char digits;
		int index = 0, total=1;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an ISBN: ");
		ISBN = input.nextLine();
		
		if(ISBN.length() != 10){
			System.out.println("\nInvalid ISBN!! It must contain exactly 10 characters.");
		}else {
			digits = ISBN.charAt(index);
			while(index < 9 && digits >= '0' && digits <= 9){
				index++;
				digits = ISBN.charAt(index);
				
			}
		}
		

	}

}
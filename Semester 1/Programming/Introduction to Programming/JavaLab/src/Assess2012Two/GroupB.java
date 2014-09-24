/* Validate a web domain
 * Assessment 2012 #2
 */
package Assess2012Two;
import java.util.Scanner;

public class GroupB 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		String domain = "";
		char valid = 'a';
		int index=4;

		System.out.print("Please enter a web address: ");
		domain = input.nextLine();
		//valid = domain.charAt(index);		

		if(domain.length() >= 9 && domain.length() <= 38) 
		{
			if(domain.startsWith("www.") && domain.endsWith(".com")){
				while(index <= domain.length()-4) {
					valid = domain.charAt(index);
					if(valid >= 'a' && valid <= 'z' || valid >= 'A' && valid <= 'Z' || valid >= '0' && valid <= '9') 
						index++;
					else
						break;
				}

				if(index==domain.length()-4)
					System.out.println("\nYou entered a valid web address.");
				else {
					System.out.println("\nInvalid! Must not contain punctuation characters.");
				}

			}else {
				System.out.println("\nInvalid web address!! It must begin with www. & end with .com");
			}

		}else
			System.out.println("\nInvalid web address! It must be 9 to 38 characters.");			
		input.close();
	}
}
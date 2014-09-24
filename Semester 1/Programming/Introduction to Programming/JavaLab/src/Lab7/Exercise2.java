/* Ask for username and password using counter-controlled while loop
 * 
 */
package Lab7;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		String username = "", password = "";
		int count = 0;
		Scanner input =  new Scanner(System.in);
		while(count < 3){
			System.out.print("Please enter the username: ");
			username = input.nextLine();
			System.out.print("Please enter the password: ");
			password = input.nextLine();
									
			if(username.equalsIgnoreCase("t00152975") && password.equals("java")){
				System.out.println("\nWelcome to the system!");
				break;
			} else if (count < 2){ // && !username.equals("t00152975") && !username.equals("java")
				System.out.println("\nInvalid username/password combination. " + (2-count) + " attempts remaining");
			} else
				System.out.println("\nInvalid username/password combination. IP address noted. Banned for 24 hours.");
			
			count++;		
		}
		input.close();
	}

}

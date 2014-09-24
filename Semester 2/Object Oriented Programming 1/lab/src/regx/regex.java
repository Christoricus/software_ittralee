package regx;
import java.util.Scanner;

public class regex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter something: " );
		String text = input.nextLine();
		
		if( text.matches(".")) {
			System.out.println("mathes");
		}
		if( text.matches("^[abc]$")) {
			System.out.println("mathes abc");
		}
		if( text.matches("^[abc][de]$")) {
			System.out.println("mathes abcde");
		}
		
		if( text.matches("[a-d]|\\s*[1-7]")) {
				System.out.println("mathes a-d 1-7");
		
				
		}
		if( text.matches("\\D")) {
					System.out.println("mathes metacharacter");
		
		} else
			System.out.println("wrong");
	}

}

package regx;
import java.util.Scanner;

public class isNaN {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter something: ");
		String text = input.nextLine();
		String msg;
		
		switch(text)
		{
		case "hi":
			msg = "hello";
			break;
		case "how are you":
			msg = "I'm grand";
			break;
		default:
			msg = "Not found";
		}
		
		System.out.print(msg);
	}
}



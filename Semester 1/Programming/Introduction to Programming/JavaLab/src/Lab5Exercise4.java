import java.util.Scanner;
public class Lab5Exercise4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int days = 0;
		
		System.out.print("Please enter the month number: ");
		int month = input.nextInt();
		
		switch(month){
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days = 31;
			System.out.println("The number of days in this month is 31.");
			break;
			
		case 2:
			days = 28;
			System.out.println("The number of days in this month is 28 (29 on Leap Year).");
			break;
		
		case 4: case 6: case 9: case 11:
			days = 30;
			System.out.println("The number of days in this month is 30.");
			break;
		
		default:
			System.out.println("You have entered an invalid month number.");
			break;
		}
		
		System.out.println("\nThe number of days in this month is " + days + ".");
	}

}

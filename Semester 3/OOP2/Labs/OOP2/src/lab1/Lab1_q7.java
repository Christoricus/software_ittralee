package lab1;
import java.util.Scanner;

// User-written method to find a even number
public class Lab1_q7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num;
		int number = 0;
		//input
		System.out.print("Enter a number (-1 to quit): ");
		num = in.nextLine();
		
		while (!num.equals("-1")) {
			number = Integer.parseInt(num); //convert String to int
			//Checking if the number enterd is even or odd
			if (isEven(number))
				System.out.println(number + " is even!");
			else
				System.out.println(number + " is odd!");
			//ask to enter another number
			System.out.print("Enter another number (-1 to quit): ");
			num = in.nextLine();
		}//ends while (-1 to quit)
		
		System.out.println("Goodbye!");
		in.close();
	}//ends main
	
	//finding the even number
	public static boolean isEven(int num) {
		return num%2 == 0;
	}//ends isEven()

}//ends class

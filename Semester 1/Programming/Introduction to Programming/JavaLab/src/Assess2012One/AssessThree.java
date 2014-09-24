package Assess2012One;
import java.util.Scanner;

public class AssessThree {

	static int chooseOption, pinEnter, pin = 1234;
	static float amountWithdraw, balance = 1000.00f;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("\t\t*********Welcome to the ATM System*********");

		//Inputting PIN Number
		System.out.print("Please enter your PIN: ");
		pinEnter = input.nextInt();

		//Checking pin for validity
		if(pinEnter != pin){
			System.out.println("\n\nYou have entered an invalid PIN! Exiting system now ....");
			System.exit(1);

			//If pin is valid do this
		}else {
			System.out.println("\t\t1. Make a withdrawal");
			System.out.println("\t\t2. Display balance on screen");
			System.out.println("\t\t3. Exit the system\n\n");

			//Prompting to choose an option from above
			System.out.print("Please enter your choice: "); 
			chooseOption = input.nextInt();


		}

		if(chooseOption == 1){
			System.out.println("Please enter the amount you wish to withdraw: ");
			amountWithdraw = input.nextFloat();

			if(amountWithdraw > balance || amountWithdraw <= 0){
				System.out.println("Error!!!");
				System.exit(1);
			}else
				System.out.println("You have made a successful withdrawal. Your new balance is EUR" + String.format("%.2f",(balance-amountWithdraw)));


		}else if(chooseOption == 2) 
			System.out.println("Your current balance is EUR" + String.format("%.2f",balance));
		else
			System.out.println("Thank you for using the ATM .... goodbye");
	}

}	
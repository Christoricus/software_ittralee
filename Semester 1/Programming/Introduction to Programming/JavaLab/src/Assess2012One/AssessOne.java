package Assess2012One;
import java.util.Scanner;

public class AssessOne {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
		String exit = "You have entered an invalid gross income .... program now exiting";

		Scanner input = new Scanner(System.in);
		
		System.out.println("************Calculating the monthly PAYE owed by a person************\n");

		//Inputting gross income
		System.out.print("Please enter the gross income of the person: ");
		int income = input.nextInt();

		if(income < 0){
			System.out.println(exit);
			System.exit(1);
		}
		
		
		//Inputting cut-off point
		System.out.print("Please enter the cut-off point of the person: ");
		int cutOff = input.nextInt();
		if(cutOff < 0){
			System.out.println(exit);
			System.exit(1);
		}
		
		//Inputting pension payment
		System.out.print("Please enter the pension payment of the person: ");
		int pension = input.nextInt();
		if(pension < 0){
			System.out.println(exit);
			System.exit(1);
		}
		
		//Inputing tax credit
		System.out.print("Please enter the tax credits of the person: ");
		int taxCredit = input.nextInt();
		if(taxCredit < 0){
			System.out.println(exit);
			System.exit(1);
		}
		
		double paye = (0.2*(income-pension)) - taxCredit;
		double exceed = (0.2*cutOff) + (0.42*(income-pension-cutOff)) - taxCredit;
		
		if(paye < 0){
			System.out.println("\nYou are on rebate.");
		}else if(income > cutOff){
			System.out.println("\nThe PAYE owed by the person is EUR"+ String.format("%.2f",exceed));
		}else {
			System.out.println("\nThe PAYE owed by the person is EUR"+ String.format("%.2f",paye));
		}

		
	}
}


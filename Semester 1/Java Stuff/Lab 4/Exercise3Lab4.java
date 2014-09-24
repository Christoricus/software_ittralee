import java.util.Scanner;

public class Exercise3Lab4 {

	public static void main(String[] args) {
		final int V_USA = 6, V_AUS = 8, V_RUS = 24;
		final int E_USA = 19, E_AUS = 85, E_RUS = 92;

		String answerAsString;
		//char answer;

		//Setting up the Strings
		String numberOfMinutes = "Please enter the total number of calls made in the month:";
		String usa = "Please enter the total number of minutes spent calling the USA: ";
		String aus = "Please enter the number of minutes spent calling Australia: ";
		String rus = "Please enter the number minutes spent calling Russia: ";

		Scanner input = new Scanner(System.in); //Setting up the input variable

		//Asking for provider
		System.out.print("Which service did you use for the calls? <V - Vartec, E - Eircom>");
		answerAsString = input.nextLine();

		//answer = answerAsString.charAt(0); //Getting the character input from String
		
		//Verify if the input is E or V
		if(!answerAsString.toLowerCase().equals("e") && !answerAsString.toLowerCase().equals("v")){
			System.out.println("Sorry - incorrect choice, it must be <V>artec or <E>ircom....Goodbye");
		}
		//If the provider is Eircom Do this
		if(answerAsString.toLowerCase().equals("e")){
			System.out.print(numberOfMinutes);
			int minutes = input.nextInt();
			if(minutes != 0){

				System.out.print(usa);
				int minUSA = input.nextInt();

				System.out.print(aus);
				int minAUS = input.nextInt();

				System.out.print(rus);
				int minRUS = input.nextInt();

				//Calculating
				float eircomCost = E_USA*minUSA + E_AUS*minAUS + E_RUS*minRUS;
				float totalCost = eircomCost/minutes;

				//Printing out the total cost
				System.out.println("The total cost of using the Eircom servie for the month is EUR" + String.format("%.2f",totalCost));

				//Printing out the average cost total cost / minutes
				System.out.println("\n\nThe average cost per call made is EUR" + String.format("%.2f", totalCost/minutes));
			} else {
				System.out.println("Thank you for your time .... goodbye");
			}

			//If the provider is Vartec Do this
		}else if(answerAsString.toLowerCase().equals("v")){
			System.out.print(numberOfMinutes);
			int minutes = input.nextInt();

			if(minutes != 0) {

				System.out.print(usa);
				int minUSA = input.nextInt();

				System.out.print(aus);
				int minAUS = input.nextInt();

				System.out.print(rus);
				int minRUS = input.nextInt();

				//Calculating
				float vartecCost = V_USA*minUSA + V_AUS*minAUS + V_RUS*minRUS;
				float totalCost = vartecCost/minutes;

				//Printing out the total cost
				System.out.println("The total cost of using the Vartec servie for the month is EUR" + String.format("%.2f",totalCost));

				//Printing out the average cost total cost / minutes
				System.out.println("\n\nThe average cost per call made is EUR" + String.format("%.2f", totalCost/minutes));
			}else {
				System.out.println("Thank you for your time .... goodbye");
			}
		}

	}

}
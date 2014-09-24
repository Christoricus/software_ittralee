package Assess2012Two;
import java.util.Scanner;
public class GroupC {
	public static void main(String[] args)
	{
		int choice;
		float ounces=0f;
		Scanner input = new Scanner(System.in);

		String menu = "\t\t*****Weight Converter*****" +
				"\n\n\t\t1. Convert Ounces to Pounds and Ounces" +
				"\n\t\t2. Convert Pounds to Kilos" +
				"\n\t\t3. Quit";
		String wrongChoice = "\n\nInvalid choice!! Must be 1-3. Please re-enter: ";
		String errorCode = "Invalid quantity. Please re-enter: ";

		do {
			System.out.print(menu);
			System.out.print("\n\n\tPlease enter your choice: ");
			choice = input.nextInt();

			while(choice > 3 || choice < 1){
				System.out.print(wrongChoice);
				choice = input.nextInt();
			}


			switch(choice){
			case 1: 
				System.out.print("\nPlease enter quantity in Ounces: ");
				ounces = input.nextFloat();
				while(ounces < 0) {
					System.out.print(errorCode);
					ounces = input.nextFloat();
				}
				int pounds = (int) (ounces/16); float ounce =  ounces%16;
				System.out.println("\n" + ounces + "oz is equivalent to: " + pounds + "lbs " + ounce + "oz");
				break;

			case 2: 
				System.out.print("\nPlease enter quantity in Pounds: ");
				float kilos = input.nextFloat();
				while(kilos < 0f){
					System.out.print(errorCode);
					kilos = input.nextFloat();
				}
				
				System.out.println("\n" + kilos + "lbs is equal to: " + kilos/2.2f + "kg");
				break;

			case 3:
				System.out.println("\n\n\nThanks for using the conversion system....goodbye");
			}

			//Press ENTER to continue!!!!
			if(choice != 3){
				System.out.println("\nPlease hit enter on your keyboard to continue.....");
				input.nextLine();
				input.nextLine();
				System.out.println("\n\n");
			}

		}while(choice != 3);
		input.close();
	}
}

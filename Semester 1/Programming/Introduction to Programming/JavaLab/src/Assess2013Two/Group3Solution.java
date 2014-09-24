package Assess2013Two;
import java.util.Scanner;
public class Group3Solution {
	public static void main(String[] args)
	{
		int index = 0;
		char ch;
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your PPS number: ");
		String ppsNumber = input.nextLine();

		if(ppsNumber.length() >= 8 && ppsNumber.length() <= 9)
		{
			if(ppsNumber.length() == 8) 
			{
				ch = ppsNumber.charAt(index);
				while(index < ppsNumber.length()-1 && ch >= '0' && ch <= '9'){
					index++;

					ch = ppsNumber.charAt(index);
				}

				if(index == ppsNumber.length()-1)
				{
					if(ppsNumber.charAt(7) >= 'A' && ppsNumber.charAt(7) <= 'Z')
						System.out.println("You entered a valid PPS number.");
					else
						System.out.println("Invalid PPS number!! The second-last or last, or both, were not uppercase letters");   
				}
				else
					System.out.println("Invalid PPS number!! At least one of the first 7 characters were not digits.");

			}
			else {
				
				ch = ppsNumber.charAt(index);
				while(index < ppsNumber.length()-2 && ch >= '0' && ch <= '9'){
					index++;

					ch = ppsNumber.charAt(index);
				}
				
				if(index == ppsNumber.length()-2)
				{
					if(ppsNumber.charAt(7) >= 'A' && ppsNumber.charAt(7) <= 'Z' && ppsNumber.charAt(8) >= 'A' && ppsNumber.charAt(8) <= 'Z')
						System.out.println("You entered a valid PPS number.");
					else
						System.out.println("Invalid PPS number!! The second-last or last, or both, were not uppercase letters");
				}
				else
					System.out.println("Invalid PPS number!! At least one of the first 7 characters were not digits.");
			}
		
		}else
			System.out.println("Invalid PPS number!! It must contain at least 8 to 9 characters.");

		input.close();
	}
}
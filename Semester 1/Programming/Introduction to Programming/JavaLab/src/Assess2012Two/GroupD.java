package Assess2012Two;
import java.util.Scanner;
public class GroupD {
	public static void main(String[] args)
	{
		int count = 0, index=0, validCount=0;
		String regNumber;
		char validReg;
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Please enter registration number " + (count+1) + ": ");
			regNumber = input.nextLine();

			if(regNumber.length() > 6 && regNumber.length() < 12){	
				if((regNumber.charAt(0) >= '0' && regNumber.charAt(0) <= '9') && (regNumber.charAt(1) >= '0' && regNumber.charAt(1) <= '9')){
					if(regNumber.charAt(2) == '-'){
						if((regNumber.charAt(3) >= 'A' && regNumber.charAt(3) <= 'Z') && (regNumber.charAt(4) >= 'A' && regNumber.charAt(4) <= 'Z')){
							if(regNumber.charAt(5) == '-'){

								index = 6;
								validReg = regNumber.charAt(index);
								while(index < regNumber.length() && validReg >= '0' && validReg <= '9'){
									index++;
									if(index<regNumber.length())
										validReg = regNumber.charAt(index);									
								}

								if(index == regNumber.length()){
									System.out.println("The reg number is valid.");
									validCount++;
								}else
									System.out.println("Last part must be digits.");
							}else
								System.out.println("Invalid reg! 6th character must be a dash.");

						}else
							System.out.println("Invalid reg! 4th & 5th characters must be uppercase letters.");

					}else
						System.out.println("Invalid reg! Third character must be a dash");

				}else
					System.out.println("Invalid registration number. First two characters must be digits.");
			}else
				System.out.println("Invalid reg number! Must have between 7 and 11 characters inclusive.");

			count++;
			System.out.println("\n");

		}while(count < 4);
				
		if(validCount < 2)
			System.out.println("You entered " + validCount + " valid registration number.");
		else
			System.out.println("You entered " + validCount + " valid registration numbers.");
		
		input.close();	
	}
}

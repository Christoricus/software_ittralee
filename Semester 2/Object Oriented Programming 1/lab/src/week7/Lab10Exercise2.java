package week7;
import java.util.Scanner;

public class Lab10Exercise2 {

	public static void main(String[] args)
	{
		int count = 1, i;
		String PPS, validPPS = "";
		boolean valid;

		Scanner input = new Scanner(System.in);


		System.out.print("Please enter PPS number " + count + ": "  );
		PPS = input.nextLine();

		while (!PPS.equalsIgnoreCase(""))
		{
			valid = false;

			while(!valid)
			{ 
				if (PPS.length() == 8 || PPS.length() == 9)
				{
					for (i = 1; i <= 7; i++)
					{
						if (!Character.isDigit(PPS.charAt(i)))
							break;
					}

					if (i == 7 && ( ( PPS.length() == 8 && Character.isUpperCase(PPS.charAt(7)) ) 
							|| ( PPS.length() == 9 && Character.isUpperCase(PPS.charAt(7)) 
							&& Character.isUpperCase(PPS.charAt(8)) ) ) )
					{
						valid = true;
					
					
					//If test fails
					} else {
						System.out.print("\nInvalid! Please enter PPS number " + count + ": "  );
						PPS = input.nextLine();
					}
				
				//break the validation if user enters return
				} else if (PPS.equalsIgnoreCase("")) {
					break;
					
				} else {
					System.out.print("\nInvalid! Please enter PPS number " + count + ": "  );
					PPS = input.nextLine();
				}

			
			} // end of validating while loop
			
			
			//If validation goes accordingly
			if (!PPS.equalsIgnoreCase(""))
			{
				count++;
				validPPS += PPS + "\n";
				System.out.print("\nPlease enter PPS number " + count + ": "  );
				PPS =  input.nextLine();
			}

		} //end of terminating while loop -- terminated by x	
		
		
		//finally printing out the end result
		if(!validPPS.equals(""))	
			System.out.println("\n\nThe list of valid PPS numbers entered are:\n\n" + validPPS);
		else
			System.out.println("\n\nYou entered no valid PPS numbers!");
		
		input.close();

	}


}

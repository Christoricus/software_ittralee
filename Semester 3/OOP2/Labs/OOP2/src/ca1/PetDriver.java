package ca1;
import java.util.Arrays;
import java.util.Scanner;

public class PetDriver {
	public static void main(String[] args) {	
		String vaccine;
		String[] vacs = new String[3];
		
		//Number of pets
		System.out.print("Enter number of pets: ");
		Pet[] myPets = new Pet[Integer.parseInt(readMe())];
		Pet p1 = new Pet();

		//Type of pet
		for (int i = 0; i < myPets.length; i++) {
			
			System.out.print("Enter type: ");
			p1.setType(readMe());
			
			System.out.print("Enter age: ");
			p1.setAge(Integer.parseInt(readMe()));
			
			System.out.print("Enter vaccination 1: ");
			vaccine = readMe();
			vacs[0] = vaccine;
			
			int totVac = 1;
			while (!vaccine.equals("") && totVac < vacs.length) {
				System.out.print("Enter vaccination " + (totVac+1) + ": ");
				vaccine = readMe();
				vacs[totVac] = vaccine;
				totVac++;
			}//end inner while to get total vaccines
			p1.setVaccinations(vacs);
			
			myPets[i] = p1;
		} //end of for loop
		
		System.out.println("\n" + Arrays.toString(myPets));
		
	}//end of main
	
	public static String readMe() {
		Scanner in = new Scanner(System.in);		
		
		return in.nextLine();			
	}
	
}
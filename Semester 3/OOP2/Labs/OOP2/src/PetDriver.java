import java.util.Scanner;
public class PetDriver {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Pet p1 = new Pet();
		Pet p2 = new Pet();
		//Number of pets
		System.out.print("Enter number of pets: ");
		String numAsString = readMe();
		int num = Integer.parseInt(numAsString);
		String[] myPets = new String[num];
		
		//Type of pet
		for (int i = 0; i < num; i++) {
			if (i == 0) {
				System.out.print("Enter type of Pet: ");
				String type = readMe();
				p1.setType(type);
				
				System.out.print("Enter age of Pet: ");
				String ageAsString = readMe();
				int age = Integer.parseInt(ageAsString);
				p1.setAge(age);
				
				int count = 1;
				
				System.out.print("Enter vaccination " + count + ": ");
				String vacs = readMe();
				vacs += p1.getVaccinations();
				while(!vacs.equals("")) {
					count++;	
					vacs += p1.getVaccinations();
					System.out.print("Enter vaccination " + count);
					vacs = readMe();
				}

			} else {
				System.out.print("Enter type of Pet: ");
				String type = readMe();
				p2.setType(type);
				
				System.out.print("Enter age of Pet: ");
				String ageAsString = readMe();
				int age = Integer.parseInt(ageAsString);
				p2.setAge(age);
				
				int count = 1;
				
				System.out.print("Enter vaccination " + count + ": ");
				String vacs = readMe();
				vacs += p2.getVaccinations();
				while(!vacs.equals("")) {
					count++;
	
					System.out.print("Enter vaccination " + count);
					vacs = readMe();
					vacs += p2.getVaccinations();
				}
			}
		} //end of for loop
		
		System.out.println("\n\n" + p1.toString());
		
	}//end of main
	
	public static String readMe() {
		Scanner in = new Scanner(System.in);
		String read;
		
		read = in.nextLine();
		
		return read;
		
	}
}
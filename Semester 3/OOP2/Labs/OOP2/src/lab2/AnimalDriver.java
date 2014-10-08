package lab2;
import java.util.Scanner;

public class AnimalDriver {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		Animal ass = new Animal(); //Creating enum object
		
		String[] cont = new String[5];
		
		ass.setType("Donkey");
		ass.setWeight(32.49);
		ass.setAge(5);
		
		ass.setContinents(enterContinents(cont)); //getting the user-supplied continents
		System.out.println(ass.toString());
		
	}
	
	public static String[] enterContinents(String[] cont) {
		String temp = "";
		cont = new String[5];
		
		for (int i = 0; i < cont.length; i++) {
			System.out.print("Enter continent: ");
			temp = in.nextLine();
			
			if (!temp.equals("")) {
				cont[i] = temp;
			} else
				break;
		}
		return cont;
	}
	
}


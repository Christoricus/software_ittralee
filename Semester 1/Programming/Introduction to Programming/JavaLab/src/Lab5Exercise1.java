import java.util.Scanner;
public class Lab5Exercise1 {

	public static void main(String[] args){
		
		Scanner input= new Scanner(System.in);
		
		int age, weight;
		double height;
		String gender, criminalRecord, grade, course;
		char gen, cRecord, grd, crs = 'y';
		
		System.out.print("Please enter your age: ");
		age = input.nextInt();
		
		System.out.print("Please enter your height (in metres): ");
		height = input.nextDouble();
		
		System.out.print("Please enter your weight: ");
		weight = input.nextInt();
		
		input.nextLine();
		System.out.print("Please enter your gender(m or f): ");
		gender = input.nextLine();
		gen = gender.charAt(0);
		
		System.out.print("Do you have a criminal record (y or n): ");
		criminalRecord = input.nextLine();
		cRecord = criminalRecord.charAt(0);
		
		System.out.print("Did you receive at least a D grade in pass Irish in the Leaving cert (y or n)? " );
		grade = input.nextLine();
		grd = grade.charAt(0);
		
		if(grd != 'y'){
			System.out.print("\nDo you committ to taking a 10 week Irish course on application (y or n)? " );
			course = input.nextLine();
			crs = course.charAt(0);
		}
		
		if((age >= 18 && age < 35) && (weight < 100 && cRecord =='n' && grd == 'y' || crs == 'y' && (gen=='m' && height >= 1.85) || (gen=='f' && height >= 1.6))){
			System.out.println("\n\nCongratulations - You are eligible to join the Gardai!");
		}else	
			
			System.out.println("\n\nCommiserations - You are not eligible to join the Gardai.");	
	}
}

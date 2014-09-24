import java.util.*;


public class CircleRev1{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius");
		//Input
		int radius = input.nextInt();
		//Process
		double area= Math.PI * Math.pow(radius,2);
		String output = String.format("AREA: %.2f m2",area);
		System.out.println(output);
		
	}
}
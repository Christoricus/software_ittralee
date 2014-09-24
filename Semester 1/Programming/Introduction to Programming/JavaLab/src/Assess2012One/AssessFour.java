package Assess2012One;
//Assessment Four Mid-Term CA
import java.util.Scanner;

public class AssessFour {
	
	static int xUpperLeft, yUpperLeft, xBottomRight, yBottomRight;
	
	public static void main(String[] args) {
		
		System.out.println("-------------------Square Determinator-------------------\n\n");
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter the x-coordinate of the upper-left point: ");
		xUpperLeft = input.nextInt();
		
		System.out.print("Please enter the y-coordinate of the upper-left point: ");
		yUpperLeft = input.nextInt();
		
		System.out.print("Please enter the x-coordinate of the bottom-right point: ");
		xBottomRight = input.nextInt();
		
		System.out.print("Please enter the y-coordinate of the bottom-right point: ");
		yBottomRight = input.nextInt();
		
		if(xBottomRight < xUpperLeft){
			
			System.out.println("\n\nError! The bottom right x coordinate is invalid ...... quitting program");
			System.exit(1);
			
		} else if(yBottomRight > yUpperLeft) {
			System.out.println("\n\nError! The bottom right y coordinate is invalid ...... quitting program");
			System.exit(1);
		}
		
		/*
		if(xUpperLeft == yBottomRight){
			System.out.println("\n\nThe rectangle described by these points is a square");
		}else if(yUpperLeft == xBottomRight) {
			System.out.println("\n\nThe rectangle described by these points is a square");
		}else{
			System.out.println("\n\nThe rectangle described by these points is not a square");
		}
		*/
		
		if(xUpperLeft == yBottomRight && yUpperLeft == xBottomRight)
			System.out.println("\n\nThe rectangle described by these points is a square");
		else 
			System.out.println("\n\nThe rectangle described by these points is not a square");
		
			
	}
	
}

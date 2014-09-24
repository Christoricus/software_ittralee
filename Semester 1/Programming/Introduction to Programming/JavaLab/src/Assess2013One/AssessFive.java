package Assess2013One;
import java.util.Scanner;
public class AssessFive {

	public static void main(String[] args) {
		float earning, USC = 0f;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\t============================\r\t\t\tUSC CALCULATOR\r\t\t============================");
		
		System.out.print("\nPlease enter your yearly earnings: ");
		earning = input.nextFloat();
		if(earning < 0){
			System.out.println("You entered an invalid earnings value .... quitting program now");
			System.exit(1);
		}else if(earning > 4004 && earning <= 10036){
			USC = (float)(earning * 0.02f);
		}else if(earning >= 10036.01 && earning <= 16016){
			USC = (float)((earning-10036)*0.04f)+(10036*0.02f);
		}else if(earning > 16016){
			USC = (float)((earning-16016)*0.07f) + (16016-10036)*0.04f + (10036*0.02f);
		}else{
			USC = 0.00f;
		}
	 	System.out.printf("\nThe USC payable by you is EUR%.2f",USC);
	}

}
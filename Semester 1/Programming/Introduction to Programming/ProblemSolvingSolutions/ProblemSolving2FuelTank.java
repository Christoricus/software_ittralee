//ProblemSolving2FuelTank.java
/*Possible Solution to Fuel Tank Activity in Problem Solving Set 2 */

import java.util.Scanner;

public class ProblemSolving2FuelTank{
	public static void main(String args[])
	{
		float capacity,consumption,distance;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the capacity of the fuel-tank in litres: ");
		capacity = input.nextFloat();
		
		System.out.print("Please enter the fuel consumption of the car in km/l: ");
		consumption = input.nextFloat();
		
		System.out.println("\nThis car can travel " + String.format("%.2f",capacity*consumption) + "km on a single " + 
			               "tank of fuel");
		
		System.out.print("\n\nHow many km do you need to travel? ");
		distance = input.nextFloat();
		
		System.out.println("\nIn order to travel a distance of " + distance + "km you need " + 
			               String.format("%.2f",distance/consumption) + " litres of fuel");
		                   
		                   
		System.out.println("\nIn order to travel a distance of 2000km it is necessary to refuel " +
			               String.format("%.2f",2000/(capacity*consumption)) + " times");
		
	    System.out.println("\nThe distance you can travel on 10 gallons of fuel is " +
	    	               String.format("%.2f",consumption*4.55*10) + "km\n\n\n");
		                   		
		
	}
}


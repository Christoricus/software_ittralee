//Exercise3.java
/*This program deals with calculating the cost of using 2 different phone
services*/
import java.util.Scanner;

public class Exercise3 {
	public static void main(String args[])
		{
			final float VARTECUSA=0.06f,VARTECAUS=0.08f,VARTECRUS=0.24f;
			final float EIRCOMUSA=0.19f,EIRCOMAUS=0.85f,EIRCOMRUS=0.92f;
			int totalCalls, USAminutes, AUSminutes, RUSminutes;
			char service;
			float callCharges;
			
				
			Scanner input = new Scanner(System.in);
								
			System.out.print("Which service did you use for the calls? (V - Vartec," +
			"E - Eircom): ");
				
			service = input.nextLine().charAt(0);					
				
			if(service == 'V')
				{
				System.out.print("Please enter the total number of calls made in the month: ");
				totalCalls=input.nextInt();
				
				if(totalCalls==0)
					{
					 	System.out.println("Thank you for your time ..... goodbye");
					}
				else
					{
						System.out.print("Please enter the number of minutes spent calling " + 
						"the USA: ");
						USAminutes=input.nextInt();
						System.out.print("Please enter the number of minutes spent calling " + 
						"Australia: ");
						AUSminutes=input.nextInt();
						System.out.print("Please enter the number of minutes spent calling " + 
						"Russia: ");
						RUSminutes=input.nextInt();
	
						callCharges=USAminutes*VARTECUSA+AUSminutes*VARTECAUS+RUSminutes*VARTECRUS;
						
						System.out.println("The total cost of using the Vartec service" +
							" for the month is EUR" + String.format("%.2f",callCharges));
							
						System.out.println("\n\nThe average cost per call made is EUR" + 
						String.format("%.2f",(callCharges/totalCalls)));
					}
				}
			else if(service == 'E')
				{
		   	    System.out.print("Please enter the total number of calls made in the month: ");
				totalCalls=input.nextInt();
		
				if(totalCalls==0)
					{
					 	System.out.println("Thank you for your time ..... goodbye");
					}
				else
					{
						System.out.print("Please enter the number of minutes spent calling " + 
						"the USA: ");
						USAminutes=input.nextInt();
						System.out.print("Please enter the number of minutes spent calling " + 
						"Australia: ");
						AUSminutes=input.nextInt();
						System.out.print("Please enter the number of minutes spent calling " + 
						"Russia: ");
						RUSminutes=input.nextInt();
				   	
				   	
		   				callCharges=USAminutes*EIRCOMUSA+AUSminutes*EIRCOMAUS+RUSminutes*EIRCOMRUS;
		   				
		   		    	System.out.println("The total cost of using the Eircom service" +
		   		    	" for the month is EUR" + String.format("%.2f",callCharges));
		   		    	
		   		    	System.out.println("\n\nThe average cost per call made is EUR" + 
						String.format("%.2f",(callCharges/totalCalls)));
					}
				}
		    else
				System.out.println("Sorry - incorrect choice, it must be (V)artec or " +
				"(E)ircom....Goodbye");
		}		
}
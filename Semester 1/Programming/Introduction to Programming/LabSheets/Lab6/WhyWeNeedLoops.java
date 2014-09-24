//WhyWeNeedLoops.java
/*This program reads in the heights of 8 people and calculates the average height.
 *It uses sequence control throughout with no looping at all*/

import java.util.Scanner;

public class WhyWeNeedLoops {
	public static void main(String args[])
		{
			float height, totalHeight = 0;
			
			Scanner input = new Scanner(System.in);

			System.out.print("Please enter the height of student 1: ");
            height = input.nextFloat();    
            totalHeight = totalHeight + height;
            
            System.out.print("Please enter the height of student 2: ");
            height = input.nextFloat();    
            totalHeight = totalHeight + height;
            
            System.out.print("Please enter the height of student 3: ");
            height = input.nextFloat();    
            totalHeight = totalHeight + height;
            
            System.out.print("Please enter the height of student 4: ");
            height = input.nextFloat();    
            totalHeight = totalHeight + height;
            
            System.out.print("Please enter the height of student 5: ");
            height = input.nextFloat();    
            totalHeight = totalHeight + height;
            
            System.out.print("Please enter the height of student 6: ");
            height = input.nextFloat();    
            totalHeight = totalHeight + height;
            
            System.out.print("Please enter the height of student 7: ");
            height = input.nextFloat();    
            totalHeight = totalHeight + height;
            
            System.out.print("Please enter the height of student 8: ");
            height = input.nextFloat();    
            totalHeight = totalHeight + height;
            
		    System.out.println("\nThe average height of the students is " + 
		    	    String.format("%.2f",totalHeight/8) + " metres");
	
		}

}



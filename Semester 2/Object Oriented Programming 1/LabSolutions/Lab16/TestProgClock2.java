//TestProgClock.java
/*This program tests various operations of the user-defined class Clock2 to ensure it
 *is working correctly*/

import java.util.*;                                   

public class TestProgClock2                              
{                                                      
    public static void main(String[] args)              
    {   
    	int hours=0;                                      
        int minutes=0;                                    
        int seconds=0;   
        
        Scanner input = new Scanner(System.in);
        
    	System.out.println("Calling the 3-argument constructor.......");                                               
        Clock2 firstClock = new Clock2(7, 3, 28);   
        
        System.out.println("\nFirst Clock2: " + firstClock);   
        
        System.out.println("\n\nCalling the no-argument constructor......."); 
             
        Clock2 secondClock = new Clock2();
        
        System.out.println("\nSecond Clock2: " + secondClock); 
        
        System.out.println("\n\nCalling the setTime() mutator.......");   
               
        secondClock.setTime(5, 45, 16);                   

        System.out.println("\nAfter calling setTime(), secondClock: " + secondClock);                  

		System.out.println("\n\nCalling equals() to determine if the times of the " +
		"2 clocks are the same.......");  
		
        if (firstClock.equals(secondClock))                  
            System.out.println("\nBoth times are equal.");           
        else                                            
            System.out.println("\nThe two times are not equal");  

        System.out.print("\n\nEnter the hours, minutes, and seconds in the form hh:mm:ss -  ");
                 
		input.useDelimiter(":");
        hours = input.nextInt();                      
        minutes = input.nextInt();
       
      	input.skip(":");
      	input.useDelimiter("\\s");
      	seconds = input.nextInt();  	
                                        
        System.out.println();                           

        firstClock.setTime(hours,minutes,seconds);         

        System.out.println("\nNew time of firstClock: " + firstClock);      

        System.out.println("\n\nCalling the incrementSeconds() method.......");  
        firstClock.incrementSeconds();                     

        System.out.println("\nAfter incrementing the clock by one second, "
                        + "firstClock: " + firstClock);    

		System.out.println("\n\nCalling the makeCopy() method.......");  
        secondClock.makeCopy(firstClock); 
                           
        System.out.println("\nAfter copying firstClock into secondClock, "
                         + "secondClock: " + secondClock);  
    }                                     
}                                                       

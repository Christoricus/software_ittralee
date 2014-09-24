//TestProgClock3.java
/*This program tests various operations of the user-defined class Clock3 to ensure it
 *is working correctly. This version tests all the functionality of Clock3*/

import java.util.*;                                   

public class TestProgClock3                              
{                                                      
    public static void main(String[] args)              
    {   
    	int hours=0;                                      
        int minutes=0;                                    
        int seconds=0;   
        
        Scanner input = new Scanner(System.in);
        
    	System.out.println("Calling the 3-argument constructor.......");                                               
        Clock3 firstClock = new Clock3(7, 3, 28);   
        
        System.out.println("First Clock: " + firstClock);   
        
        System.out.println("\n\nCalling the no-argument constructor......."); 
             
        Clock3 secondClock = new Clock3();
        
        System.out.println("Second Clock: " + secondClock); 
        
        System.out.println("\n\nCalling the setTime() mutator.......");   
               
        secondClock.setTime(5, 45, 16);                   

        System.out.println("After calling setTime(), secondClock: " + secondClock);                  

		System.out.println("\n\nCalling equals() to determine if the times of the " +
		"2 clocks are the same.......");  
		
        if (firstClock.equals(secondClock))                  
            System.out.println("Both times are equal.");           
        else                                            
            System.out.println("The two times are not equal");  

        System.out.print("\n\nEnter the hours, minutes, and seconds in the form hh:mm:ss -  ");
                 
		input.useDelimiter(":");
        hours = input.nextInt();                      
        minutes = input.nextInt();
       
      	input.skip(":");
      	input.useDelimiter("\\s");
      	seconds = input.nextInt();  	
                                        
        System.out.println();                           

        firstClock.setTime(hours,minutes,seconds);         

        System.out.println("New time of firstClock: " + firstClock);      

        System.out.println("\n\nCalling the incrementSeconds() method.......");  
        firstClock.incrementSeconds();                     

        System.out.println("After incrementing the clock by one second, "
                        + "firstClock: " + firstClock);    

		System.out.println("\n\nCalling the makeCopy() method.......");  
        secondClock.makeCopy(firstClock); 
                           
        System.out.println("After copying firstClock into secondClock, "
                         + "secondClock: " + secondClock);
                         
        System.out.println("\n\nCalling the incrementMinutes() method.......");  
        firstClock.incrementMinutes();                     

        System.out.println("After incrementing the clock by one minute, "
                        + "firstClock: " + firstClock);    
        
        System.out.println("\n\nCalling the incrementHours() method.......");  
        firstClock.incrementHours();                     

        System.out.println("After incrementing the clock by one hour, "
                        + "firstClock: " + firstClock);
        
        System.out.println("\n\nCalling the setHours() method on secondClock.......");  
        secondClock.setHours(22);                     

                       
        System.out.println("Calling the setMinutes() method on secondClock.......");  
        secondClock.setMinutes(43);                     

        
        
        System.out.println("Calling the setSeconds() method on secondClock.......");  
        secondClock.setSeconds(21);                     
  
          
        System.out.println("\n\nCalling the getHours() method.......");  
        hours = secondClock.getHours();                     

        System.out.println("The hours value of the secondClock is " + hours);
                       
        System.out.println("\n\nCalling the getMinutes() method.......");  
        minutes = secondClock.getMinutes();                     

        System.out.println("The minutes value of the secondClock is " + minutes); 
        
        System.out.println("\n\nCalling the getSeconds() method.......");  
        seconds = secondClock.getSeconds();                     

        System.out.println("The seconds value of the secondClock is " + seconds);
        
        System.out.println("\n\nCalling the getCopy() method on firstClock.......");  
        Clock3 thirdClock = firstClock.getCopy();
        System.out.println("After calling the getCopy() method on firstClock to create " +
        "another Clock object called thirdClock.......value of thirdClock: " + thirdClock); 
                        
    }                                     
}                                                       

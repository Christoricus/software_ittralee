//TestExercise2.java
/*This program contains the main() to test out the functionality of our
 *Exercise2 class*/

import java.util.*;                                      

public class TestExercise2                         
{                                                             
    public static void main (String args[])              
    {     
    	int temperature;
    	
    	Scanner input = new Scanner(System.in); 
    	
    	System.out.println("Calling the single-argument constructor....." + 
    	"setting the temperature of first Thermometer to 35C");
    	                                            
        Exercise2 firstExercise2 = new Exercise2(35);
    
    	System.out.println("First Thermometer: \n" + firstExercise2); 
    	 
       	System.out.println("Calling the no-argument constructor....." + 
    	"setting the temperature of second Thermometer to 0C");
    	     
        Exercise2 secondExercise2 = new Exercise2();
                                                                 
        System.out.println("Second Thermometer: \n" + secondExercise2);            

       	System.out.println("Calling setTemperature()....." + 
    	"setting the temperature of second Thermometer to 25C");


        secondExercise2.setTemperature(25);              

        System.out.println("Second Thermometer:\n" + secondExercise2);               

        System.out.print("Please enter the current temperature: ");       

        temperature = input.nextInt(); 
                        
        System.out.println();                            

		System.out.println("Calling setTemperature()....." + 
    	"setting the temperature of first Thermometer to " + temperature + "C");
        firstExercise2.setTemperature(temperature);       

        System.out.println("First Thermometer: \n"+ firstExercise2);              
    }                                         
}                                                        


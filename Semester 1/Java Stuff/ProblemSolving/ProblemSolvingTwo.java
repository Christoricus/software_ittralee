/**
 * @(#)ProblemSolvingTwo.java
 *
 *
 * @author 
 * @version 1.00 2013/9/23
 */
import java.util.*;

public class ProblemSolvingTwo {
        
    /**
     * Creates a new instance of <code>ProblemSolvingTwo</code>.
     */
     
    public static void main(String[] args) {
    	int distance = 650;
    	int fuel = 60;
    	int consumption = 14;
    	int volumeRequired;
    	distance = fuel * consumption;
    	System.out.println("Distance possible on 1 tank of fuel: " + distance);
	  
	  	
	  	volumeRequired = distance / consumption;
	  	System.out.println("Volume of fuel required: " + volumeRequired);
	  

}

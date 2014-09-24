import java.util.Scanner;

public class Exercise5 {
        
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
        
        final float GravitationaConstant = 6.67300E-11f;
        
        float mass1, mass2,force;
        int distance;
        
        
        System.out.print("Please enter the mass in kg of the first object: ");
        mass1 = input.nextFloat();
        
        System.out.print("Please enter the mass in kg of the second object: ");
        mass2 = input.nextFloat();
        
        System.out.print("Please enter the distance in meteres between the objects: ");
        distance = input.nextInt();
        
        //Calculation
        force = (GravitationaConstant*mass1*mass2) / (distance*distance);
        
        //Printing Out
        System.out.println("\n\n\n*****Results of Program*****" + 
        	"\n\nThe mass of the first object is " + mass1 + " kg" +
        		"\nThe mass of the second object is " + mass2 + " kg" +
        			"\nThe distance between the two objects is " + distance + " m" +
        				"\nThe force exerted on the objects is " + String.format("%.2f",force) + " N");
    }
}

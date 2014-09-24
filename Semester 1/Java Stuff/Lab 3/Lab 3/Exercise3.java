import java.util.Scanner;

public class Exercise3 {
        
    public static void main(String[] args) {
    	
    	final float CONVERSION_FACTOR = 0.4046f;
    	float acre , hectares;
    	
    	Scanner input = new Scanner(System.in);
    	
    	//Input
    	System.out.println("Please enter an area in acre: ");
    	acre = input.nextFloat();
    	
    	String formatString = "This is equivalent to " + String.format("%.3f", acre*CONVERSION_FACTOR) + " hectares";
        
        System.out.println(formatString);
    }
}

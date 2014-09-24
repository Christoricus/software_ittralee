import java.util.Scanner;

public class Exercise4 {
        
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float initialSpeedU, accelerationA, spentTravellingT;
        
        System.out.print("Please enter the initial speed: ");
        initialSpeedU = input.nextFloat();
        
        System.out.print("Please enter the acceleration: ");
        accelerationA = input.nextFloat();
        
        System.out.print("Please enter the time spent travelling: ");
        spentTravellingT = input.nextFloat();
        input.nextLine();
        
        //Calculation
        float distance = (initialSpeedU*spentTravellingT)+(0.5f*accelerationA*spentTravellingT*spentTravellingT);
        
        System.out.println("The object travelled a distance of " + String.format("%.2f", distance) + " metres.");
        
    }
}

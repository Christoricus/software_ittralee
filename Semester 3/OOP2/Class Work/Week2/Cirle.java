import java.util.Scanner;
import java.text.DecimalFormat;

public class Cirle{

	
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Radius in metres");
		DecimalFormat df=new DecimalFormat("###0.00");
		int radius=in.nextInt();
		double area=CalcAreaUtil.calcArea(radius);
		
		//Alternative, creating an instance
		//Cirle c = new Cirle();
		//double area=c.calcArea1(radius);
		
		System.out.println("Area of Circle is "+df.format(area)+"m^2");
	}//end of main


//user defined 'instance' method
//public double calcArea1(int r){
//	return Math.PI+Math.pow(r,2);	
//}

//user defined 'static' method
//public static double calcArea(int r){
//	return Math.PI+Math.pow(r,2);
//}//end of user defined method	
}//end of class
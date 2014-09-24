//T00167890Lab02
/*
 *
 */
 
 import java.util.Scanner;
 
 public class T00168198Lab02 {
 	public static void main(String[] args)
 	{
 		float floatNum;
 		double doubleNum;
 		
 		Scanner input = new Scanner(System.in);
 		
 		floatNum = 1/3f;
 		doubleNum = 1/3d;
 		
 		System.out.println("f: " + floatNum + "\n10f: " + (floatNum*10) + "\n100f: " +
 						  (floatNum*100) + "\n1000f: " + (floatNum*1000) + "\n100000 + f: " +
 						   (100000+floatNum) + "\nf/10: " + (floatNum/10) + "\nf/100: " +
 						   (floatNum/100) + "\nf/1000: " + (floatNum/1000) + "\nf/10000: " +
 						   	(floatNum/10000) + "\n100000+f/10000: " + (100000+(floatNum/10000))
 						   	+ "f: " + doubleNum + "\n10f: " + (doubleNum*10) + "\n100f: " +
 						  (doubleNum*100) + "\n1000f: " + (doubleNum*1000) + "\n100000 + f: " +
 						   (100000+doubleNum) + "\nf/10: " + (doubleNum/10) + "\nf/100: " +
 						   (doubleNum/100) + "\nf/1000: " + (doubleNum/1000) + "\nf/10000: " +
 						   	(doubleNum/10000) + "\n100000+f/10000: " + (100000+(doubleNum/10000)));
 		
 	}
 }
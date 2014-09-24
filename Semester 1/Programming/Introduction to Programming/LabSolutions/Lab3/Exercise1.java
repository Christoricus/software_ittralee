//Exercise1.java
/*This program tests out the rules of operator precedence in Java for a given
 *expression*/


public class Exercise1 {
	 public static void main(String args[])
		{
			int a=5, b=3, c=2, x;
			
			x = a * b % c - 4 + 6;
							
			System.out.println("The value of a is " + a + "\nThe value of b is " + b + 
				               "\nThe value of c is " + c + "\n\nThe value of the expression" +
				               " a * b % c -4 + 6 is " + x);
					
			
		}
}
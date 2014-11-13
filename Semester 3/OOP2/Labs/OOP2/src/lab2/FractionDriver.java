package lab2;

public class FractionDriver {
	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(15, 25);
		
		/*Fraction f3 = new Fraction();
		f3 = f2.add(new Fraction(10, 20));
		System.out.println("Value of 15/25 - 10/20 is " + f3.toString());
		*/
		
		System.out.println("Testing the no argument constructor: " + f1.toString());
		System.out.println("Testing the 2-argument constructor: " + f2.toString());
		System.out.println("Value of 15/25 + 10/20 is " + f2.add(new Fraction(10, 20)).toString());
		System.out.println("Value of 15/25 - 10/20 is " + f2.subtract(new Fraction(10, 20)).toString());
		System.out.println("Value of 15/25 * 10/20 is " + f2.multiply(new Fraction(10, 20)).toString());
		System.out.println("Value of 15/25 / 10/20 is " + f2.divide(new Fraction(10, 20)).toString());
		

	}
}

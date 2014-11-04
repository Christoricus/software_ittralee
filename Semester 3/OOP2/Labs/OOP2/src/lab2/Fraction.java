package lab2;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction() {
		this(0, 1);
	}
	
	
	public Fraction(int n, int d) {
		setNumerator(n);
		setDenominator(d);
	}
	
	//Accessing the attributes
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	//Setting the attributes
	public void setNumerator(int n) {
		numerator = n;
	}
	
	public void setDenominator(int d) {
		denominator = d;
	}
	
	public Fraction add(Fraction f2) {
		int d = denominator*f2.denominator;
		int n = ((d/denominator)*numerator) + ((d/f2.denominator)*f2.numerator);
		return new Fraction(n, d);
	}
	
	public Fraction subtract(Fraction f2) {
		int d = denominator*f2.denominator;
		int n = ((d/denominator)*numerator) - ((d/f2.denominator)*f2.numerator);
		return new Fraction(n, d);
	}
	
	public Fraction multiply(Fraction f2) {
		int d = denominator*f2.denominator;
		int n = numerator*f2.numerator;
		return new Fraction(n,d);
	}
	
	public Fraction divide(Fraction f2) {
		int d = denominator*f2.numerator;
		int n = numerator*f2.denominator;
		return new Fraction(n, d);
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
}

package progmaths;

public class Fraction {
	int numerator;
	int denominator;

	public void reduce() {
		int n = numerator;
		int d = denominator;

		while (d != 0) {
			int t = d;
			d = n % d;
			n = t;
		}

		int gcd = n;

		numerator /= gcd;
		denominator /= gcd;
	}

	public static void main(String[] args) {
		Fraction f = new Fraction ();
		f.numerator = 2;
		f.denominator = 4;
		f.reduce();
		System.out.println(f.numerator + "/" + f.denominator);
	}
} 

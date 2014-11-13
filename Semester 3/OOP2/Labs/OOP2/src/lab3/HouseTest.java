package lab3;

public class HouseTest {
	public static void main(String[] args) {
		House a = new House();

		System.out.println("No-argument copy constructor....\n");
		System.out.println(a.toString());

		// House(address, type, price, name, age, gender)
		House b = new House("Castleisland", "3-bedroomed bungalow", -123245234,
				"Nazmul", 21, 'M');
		System.out
				.println("6-argument copy constructor with invalid price....\n");
		System.out.println(b.toString());

		b.setPrice(210000);
		System.out
				.println("6-argument copy constructor with valid price....\n");
		System.out.println(b.toString());
	}
}

package lab3;

public class House {
	private String address;
	private String type;
	private double price;
	private Person owner;

	public House() {
		setAddress("No Address Specified");
		setType("Not Type Specified");
		setPrice(0.0);
		owner = new Person();
		// owner.setName("No Owner Specified");

	}

	public House(String ads, String typ, double prc, String name, int age,
			char gender) {
		setAddress(ads);
		setType(typ);
		setPrice(prc);
		owner = new Person();
		owner.setName(name);
		owner.setAge(age);
		owner.setGender(gender);
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setType(String type) {
		this.type = type;
	}

	// Validate Price
	// If negative price is entered, keep the price unchanged
	public void setPrice(double price) {
		if (price < 0)
			price = this.price;
		else
			this.price = price;
	}

	// Getting
	public String getAddress() {
		return address;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	public Person getOwner() {
		return owner;
	}

	// Printing out
	public String toString() {
		return "Address: " + getAddress() + "\nPrice: " + getPrice()
				+ "\nOwner: " + owner.toString();
	}
}

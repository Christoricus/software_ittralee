/** An aggregate (composite) class that models an athlete
 * it contains a Weight object as attribute
 */
package lab3;
public class Trainee {

	private String name;
	private String address;
	private int age;
	private double height;
	private Weight startWgt; // nested object

	// setting up the Trainee attributes "directly"
	public Trainee() {
		name = "name unkown";
		address = "address unknown";
		age = 0;
		height = 0.0;
		startWgt = new Weight();

	}

	public Trainee(String nm, String addr, int a, double h, int stones,
			int pounds) {
		setName(nm);
		setAddress(addr);
		setAge(a);
		setHeight(h);
		startWgt = new Weight(stones, pounds);
		// setStartWeight(stones,pounds);
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public Weight getStartWeight() {
		return startWgt;
		/*
		 * a more secure approach would be return startWgt.clone() this would
		 * require the implementation of a clone() method in the Weight class
		 */
	}

	public void setName(String nm) {
		name = nm;
	}

	public void setAddress(String addr) {
		address = addr;
	}

	public void setAge(int a) {
		age = a;
	}

	public void setHeight(double h) {
		height = h;
	}

	public void setStartWeight(int stones, int pounds) {
		startWgt.setWeight(stones, pounds);
	}

	public String toString() {
		return "Name: " + name + "\nAddress: " + address + "\nAge: " + age
				+ "\nHeight: " + height + "\nStarting weight: "
				+ startWgt.getStones() + "st " + startWgt.getPounds() + "lbs"; // startWgt.toString()
	}
}
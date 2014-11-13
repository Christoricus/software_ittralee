package lab3;

public class Person {
	private String name;
	private int age;
	private char gender;

	public Person() {
		name = "Not specified";
		age = 0;
		gender = 'x';
	}

	public Person(String name, int age, char ch) {
		setName(name);
		setAge(age);
		setGender(ch);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	// Getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public String toString() {
		return getName() + " " + getAge() + " " + getGender();
	}
}

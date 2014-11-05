/** An OOP instantiable class which models one person, storing
 *  all that person's details as one object */
public class Person {
	private String name;
	private int age;
	private char gender;
	
	// 'accessor' methods to return a copy of an attribute
	public int getAge() { return age;}
	public char getGender() { return gender;}
	public String getName() { return name;}
	
	// 'mutator' methods to change the value of an attribute
	public void setAge (int age) {
				this.age = age;
	}
	
	public void setName( String name) {
				this.name = name;
	}
	
	public void setGender(char gender) {
				this.gender = gender;
	}
	
	// 'constructor' methods to give people a sensible initial state
	
	/** full-args constructor, to create a person about whom everything is known
	 */
	public Person(String name, int age, char gender) {
				setName(name);
				setAge(age);
				setGender(gender);
	}
	
	/** no-args constructor, for use as in Person p = new Person()
	 *  to create a default Person
	 */
	public Person() {
				this("Not Given",0,'U');
	}
	
		
	/* Every object should have one of these, to give a quick
	 * String summary of the values of all the object's attributes
	 */
	public String toString() {
				return getName() + " " + getAge() + " " + getGender();
	}
}
/** Application class containing a main method, which manages 2 persons
 *  serves as 'driver' or 'tester' class for the instantiable Person class
 */
public class OOPPeople {
	public static void main(String args[]) {
		Person person1 = new Person();
		System.out.println("First Person: " + person1.toString());
		Person person2 = new Person("Joe",20,'M');
		System.out.println("Second Person: " + person2.toString());
		
		person2.setName("Paul");
		System.out.println("\nNames of my two people:");
		System.out.println(person1.getName());
		System.out.println(person2.getName());
	
	}
}
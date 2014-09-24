/* To write a program which will allow us to determine the 
 * smallest positive integer number whose fifth power is greater
 * than 100000 using a task-controlled while loop.
 */
package Lab8;

public class TaskControlledWhile {
	public static void main(String[] args) 
	{
		int value=0;
		
		while(Math.pow(value, 5) <= 100000)
		{
			value++;
		}
		System.out.println("\nThe smallest positive integer whose fifth power exceeds" + " 100,000 is " + value);
	}
}

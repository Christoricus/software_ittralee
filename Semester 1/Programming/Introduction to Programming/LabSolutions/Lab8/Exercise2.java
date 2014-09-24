//Exercise2.java
/*This program uses a task-controlled while loop to determine the lowest power
 *of 2 which exceeds 5000*/

public class Exercise2 {
	public static void main(String args[])
		{
			int power=0;
						
			while(Math.pow(2,power)<=5000)
				{
					power++;
				}		
						
			System.out.println("The lowest power of 2 which exceeds 5000 is " + power);
									
		}		
}



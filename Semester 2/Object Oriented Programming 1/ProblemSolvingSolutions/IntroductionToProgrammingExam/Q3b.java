//Q3b.java
/*This program uses a task-controlled while loop to determine the term that puts the series
 *sqr(1) + sqr(2) + sqr(3) + ..... over 500*/

import java.util.Scanner;

public class Q3b {
	public static void main(String args[])
		{					
			int term=1,sum=0;
			
			while(sum<500)
				{	
					sum += term*term;
					term++;	
				}
	
			System.out.println("The term that puts the series over 500 is term " + (term-1) + "\n\n");
				
		}
}	




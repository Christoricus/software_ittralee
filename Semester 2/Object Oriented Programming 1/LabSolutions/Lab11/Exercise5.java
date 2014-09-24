//Exercise5.java
/*This program outputs the 1st and 5th elements of an array and also the 
 *smallest and largest numbers in the array*/

import java.util.Scanner;

public class Exercise5 {
			public static void main(String args[])
			{	
			    int numbers[] = new int[10];
			    int i,smallest=0,largest=0;
			    
			    Scanner input = new Scanner(System.in);
			    
			    for(i=0;i<numbers.length;i++)
						{
							System.out.print("Please enter an integer: ");
							numbers[i]=input.nextInt();
							
							if(i == 0)
								{
									smallest=numbers[i];
									largest=numbers[i];	
								}
							else
								{
									if(numbers[i] < smallest)
										smallest = numbers[i];
										
									if(numbers[i] > largest)
										largest = numbers[i];
								}
						}
					
					
					
					System.out.println("\n\n\nThe first value in the array is " + numbers[0]);
					System.out.println("\nThe 5th number in the array is " + numbers[4]);
					System.out.println("\nThe largest number in the array is " + largest);
					System.out.println("\nThe smallest number in the array is " + smallest);

			}
}



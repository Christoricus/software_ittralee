/* In this program a sort in ascending order of an array is performed using a pre-defined
 * method sort() of the Arrays class. Also, a binary search is performed on the same array  to
 * determine  whether or not a user-supplied value exists within the array. This is performed
 * by the method binarySearch(), also contained within the Arrays class.
 */
package week8;
import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
	String[] names = new String[5];
	String searchName;
	int subscript;
	
	populateArray(names);
	
	//Convert the arrays toString
	System.out.println("\n\nOriginal contents of array is: \n\n " + Arrays.toString(names)); 
	
	Arrays.sort(names); //Sort the arrays in ascending order
	
	System.out.println("\n\nAfter sort(), the contents of the array is \n\n " + Arrays.toString(names));
	
	System.out.print("\n\nEnter the name you seek: ");
	searchName = input.nextLine();
	
	subscript = Arrays.binarySearch(names, searchName);
	
	if (subscript >= 0)
	    System.out.println("\n\nThe name you are searching for, " + names[subscript]
		    + ", has been found!");
	
	else
	    System.out.println("\n\nSorry - the name you are searching for, " + searchName
		    + ", has not been found!");
	 
    }
    
    public static void populateArray(String[] names)
    {
	int i;
	
	System.out.println("Please enter the " + names.length + " names\n");
	
	for (i = 0; i < names.length; i++)
	{
	    System.out.print("\nPlease enter the name of person " + (i+1) + ": ");
	    names[i] = input.nextLine();
	}
    }

}

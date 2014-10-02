//equIndex3.java
//James McGarry
import java.util.Scanner;

public class equIndex3{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter number of elements: ");
		
		int elements          = in.nextInt();
		int arrayOfElements[] = new int[elements];     //creating array to hold user defined number of elements
		
		System.out.print("Please enter the elements:\n");
		
		for (int i=0; i<elements; i++)
			arrayOfElements[i] = in.nextInt();       //read in each element and store in array
			
		System.out.print("\n" + equilibriumIndex(arrayOfElements));
	}
	public static String equilibriumIndex(int[] equiIndex)
	{
		String indices = "";
		int rightSide=0, leftSide=0;
		
		for (int i=1; i<equiIndex.length; i++)
			rightSide += equiIndex[i];             //count up the elements of the array without including the first element
			                                       //because the first possible equilibrium index might be 0
			
		for (int i=0; i<equiIndex.length; i++)
		{
			if (leftSide == rightSide)
				indices += i + " ";                //A string for the 'return' is built
				
			if (i + 1 < equiIndex.length)          //this statement starts at i+1 to stop...
			{
				leftSide  += equiIndex[i];        
				rightSide -= equiIndex[i + 1];     //this calculation from trying to add the 9th element of an array of size 8 for example
			}
		}
		
		if (indices.equals(""))                    //this statement returns -1 if there is no equilibrium index
			indices = "-1";
				
		return indices;
	}
}
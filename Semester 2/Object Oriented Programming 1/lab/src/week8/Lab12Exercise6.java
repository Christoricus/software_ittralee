/* A program which generated 7 random numbers between 1 and 42 to simulate the Irish lotto draw.
 * 
 */
package week8;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lab12Exercise6 {

    public static void main(String[] args)
    {
	int[] lottoNumbers = new int[7];
	boolean[] alreadyPicked = new boolean[43];

	for (int i = 0; i < lottoNumbers.length; i++)
	{
	    lottoNumbers[i] = (int) (Math.random()*42)+1;

	    while ( alreadyPicked[lottoNumbers[i]] ) { //Run through while loop until each number happened only once

		//System.out.println(Arrays.toString(alreadyPicked));

		lottoNumbers[i] = (int) (Math.random()*42)+1;
	    }

	    alreadyPicked[ lottoNumbers[i] ] = true; //Set every number to already picked

	}

	Arrays.sort(lottoNumbers); //Sort the array


	JOptionPane.showMessageDialog(null, "The lotto numbers are: \n" + Arrays.toString(lottoNumbers)
		, "Lotto Numbers", JOptionPane.INFORMATION_MESSAGE );

	System.exit(0);

    }


}

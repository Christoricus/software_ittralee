/* A program which generated 7 random numbers between 1 and 42 to simulate the Irish lotto draw.
 * This is an improved solution -- this version generates bonus numbers as well.
 */
package week8;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lab12Exercise6Improved {

    public static void main(String[] args)
    {
	int[] lottoNumbers = new int[5];
	int[] bonusNumbers = new int[2];
	boolean[] bonusPicked = new boolean[11]; //why 11 not 2?
	boolean[] alreadyPicked = new boolean[43];
	
	//Generate lotto and bonus numbers
	lottoNumbers = lottoNumbersGenerator(lottoNumbers, alreadyPicked);
	bonusNumbers = bonusNumbersGenerator(bonusNumbers, bonusPicked);
	
	//Sort the arrays
	Arrays.sort(lottoNumbers); 
	Arrays.sort(bonusNumbers);
	
	//Displaying the result
	JOptionPane.showMessageDialog(null, "The lotto numbers are: \n" + Arrays.toString(lottoNumbers)
		+ "  " + Arrays.toString(bonusNumbers), "Lotto Numbers", JOptionPane.INFORMATION_MESSAGE );
	
	System.exit(0);

    }
    
    
    //Get the lotto numbers
    public static int[] lottoNumbersGenerator(int[] lottoNumbers, boolean[] alreadyPicked)
    {
	for (int i = 0; i < lottoNumbers.length; i++)
	{
	    lottoNumbers[i] = (int) (Math.random()*42)+1;
	    
	    while ( alreadyPicked[lottoNumbers[i]] ) { //Run through while loop until each number happened only once

		lottoNumbers[i] = (int) (Math.random()*42)+1;
	    }

	    alreadyPicked[ lottoNumbers[i] ] = true; //Set every number to already picked
	    

	}
	
	return lottoNumbers;
    }
    
    //Get the bonus numbers
    public static int[] bonusNumbersGenerator(int[] num, boolean[] bonusPicked)
    {
	//boolean[] bonusPicked = new boolean[11];
	
	for (int j = 0; j < num.length; j++)
	{
	    num[j] = (int) (Math.random()*10)+1;
	    
	    while ( bonusPicked[ num[j] ] ) {
		
		num[j] = (int) (Math.random()*10)+1;
	    }
	    
	    bonusPicked[ num[j] ] = true;
	    
	    //System.out.println(Arrays.toString(num));
	    //System.out.println(Arrays.toString(bonusPicked));

	}
	
	return num;
	
    }


}

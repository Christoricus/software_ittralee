//Exercise6.java
/*This program simulates the picking of the Irish lotto numbers*/

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Exercise6 {
		public static void main(String args[]) 
			{
			 int lottoNumbers[] = new int[7];
			 boolean alreadyPicked[] = new boolean[43];
			 int number;
	 
			 for(int i = 0;i < lottoNumbers.length;i++)
			 	{
				 number = (int)(Math.random()*42)+1;
			 
			 	 while(alreadyPicked[number])
			 			number = (int)(Math.random()*42)+1;
			 			
			 	 alreadyPicked[number] = true;
			 	 lottoNumbers[i] = number;	 
			 	}
			 
			 Arrays.sort(lottoNumbers);
			 	
			 JOptionPane.showMessageDialog(null,"The lotto numbers are: \n\n" + Arrays.toString(lottoNumbers),
			 "Lotto Numbers",JOptionPane.INFORMATION_MESSAGE);
			 		
			 System.exit(0);		
			}
}






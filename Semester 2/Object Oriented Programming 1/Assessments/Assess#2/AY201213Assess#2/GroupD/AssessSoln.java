//AssessSoln.java
/*This program validates a user-supplied string to ensure it is a positive number
 *(which could be fractional). It also determines the number of whole and fractional
 *numbers supplied as well as largest number along with the average of all the numbers*/

import javax.swing.JOptionPane;

public class AssessSoln {
	public static void main(String args[])
		{
			String numberAsString;
			float number,largest=0,total=0;
			int totalInts=0,totalFloats=0,i=0,numDots=0,totalNums=0;

			numberAsString = JOptionPane.showInputDialog("Please enter any number (return to exit)");

			while(!numberAsString.equals(""))
			{
				while(i<numberAsString.length())
				{
				    if(Character.isDigit(numberAsString.charAt(i)))
					    i++;
					else if((numberAsString.charAt(i)=='.'&&numDots==0))
					{
						numDots++;
						i++;
					}
					else
						break;
				}

				if(i!=numberAsString.length())
				{
					numberAsString = JOptionPane.showInputDialog("Error: Invalid number! Please reenter");
				}
				else
				{
					totalNums++;
					number = Float.parseFloat(numberAsString);

					total += number;

					if(number>largest)
						largest = number;

					if(numberAsString.indexOf('.')==-1)
						totalInts++;
					else
						totalFloats++;

					numberAsString = JOptionPane.showInputDialog("Please enter another number (return to exit)");
				}
				i=0;
				numDots=0;
			}


		    if(totalNums!=0)
			    JOptionPane.showMessageDialog(null,"Average of the numbers is " + String.format("%.3f",(total/totalNums))+
				         "\nThe total number of whole numbers is " + totalInts +
				         "\nThe total number of floating-point numbers is " + totalFloats +
				         "\nThe largest number entered is " + largest,"",JOptionPane.INFORMATION_MESSAGE);
		    else
		    	JOptionPane.showMessageDialog(null,"You entered no valid numbers...goodbye","",JOptionPane.INFORMATION_MESSAGE);

			System.exit(0);

		}
}




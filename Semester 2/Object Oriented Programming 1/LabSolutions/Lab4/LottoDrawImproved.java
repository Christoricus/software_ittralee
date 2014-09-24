//LottoDrawImproved.java
/*This program uses a pre-defined method from the Math class called random() to
 *emulate the Lotto draw by generating 7 random numbers between 1 and 42 inclusive. It
 *aims to eliminate the flaw in the original version where duplicates could be generated*/

import javax.swing.JOptionPane;

public class LottoDrawImproved {
	public static void main(String args[])
		{
			int lottoNumber=0,number1=0,number2=0,number3=0,number4=0,number5=0,number6=0;
			String numbers = "";
					
			for(int i = 1; i <= 7; i++)
				{
					while(lottoNumber == number1 || lottoNumber == number2 || lottoNumber == 
					number3 || lottoNumber == number4 || lottoNumber == number5 || lottoNumber
					== number6)
						{
							lottoNumber = (int)(Math.random()*42 + 1);
						}
					
					numbers += lottoNumber + " ";
					
					switch(i)
						{
							case 1:
									number1 = lottoNumber;
									break;
							case 2:
									number2 = lottoNumber;
									break;
							case 3:
									number3 = lottoNumber;
									break;
							case 4:
									number4 = lottoNumber;
									break;
							case 5:
									number5 = lottoNumber;
									break;
							case 6:
									number6 = lottoNumber;							
						}
					lottoNumber = (int)(Math.random()*42 + 1);
				}
			
			JOptionPane.showMessageDialog(null,"The lotto numbers are:\n" + numbers,"Lotto Draw",
			JOptionPane.PLAIN_MESSAGE);
						
            System.exit(0);											
		}		
}



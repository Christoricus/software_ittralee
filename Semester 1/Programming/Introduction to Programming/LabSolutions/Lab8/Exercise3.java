//Exercise3.java
/*This program uses a task-controlled while loop which takes an initial investment
 *amount of €100000 and an interest rate of 3% compounded anually plus an annual
 *withdrawal amount of €12000 and determines the first year at the end of which
 *a withdrawal of €12000 will no longer be possible*/


public class Exercise3 {
	public static void main(String args[])
		{
			float rate=3,balance=100000;
			int year=1;
						
			while(balance>=12000)
				{
					balance += (balance*rate)/100 - 12000;
					System.out.println("Balance at the end of year " + year + " is EUR" +
						               String.format("%.2f",balance));
				    year++;
				}		
													
		}		
}



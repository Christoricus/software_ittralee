package Lab8;
public class Exercise3 {
	public static void main(String[] args)
	{
		float balance = 100000f, rate = 3f;
		int year = 1;
		
		while(balance >= 12000) 
		{
			balance += (balance*rate)/100;
			balance -= 12000;
			System.out.println("Balance at the end of year " + year + " is EUR" + String.format("%.2f", balance));
			year++;
		}
	}
}

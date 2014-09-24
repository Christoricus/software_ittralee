package Lab8;

public class Exercise2 {
	public static void main(String[] args) 
	{
		int pwrTwo=0;
		while(Math.pow(2, pwrTwo) <= 5000)
		{
			pwrTwo++;
		}
		System.out.println("The lowest power of 2 which exceeds 5000 is " + pwrTwo);
	}

}

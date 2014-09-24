//Exercise5.java
/*This program uses a for loop in a task-controlled situation where the
 *program determines the Fibonacci numbers that are less than 5000*/


public class Exercise5 {
	public static void main(String args[])
		{
			String allFibs="";
			int fib,lastFib=1,secondLastFib=1;
		
		
			for(int i=0;i<=100000;i++)
				{
				   fib = lastFib + secondLastFib;
				   secondLastFib = lastFib;
				   lastFib = fib;
				   
				   if(fib>=5000)
				   		break;
				   		
				   allFibs += "," + fib;
					
				}
				
			System.out.println("The Fibonacci numbers < 5000 are:\n\n1,1" + allFibs);
			
																
		}		
}



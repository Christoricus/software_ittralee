package lab3;
/** models a bank account: demos the use of a static attribute and methods
 */
public class Account {
	private String name;
	private double balance;
	private double interestRate = 5.00;
	
	public String getName(){ return name;	}
	public double getBalance(){ return balance;	}
	/** access method for the interest rate
	 *@return the interest rate as a percentage eg 5.00 for 5%
	 */
	public double getInterestRate(){ return interestRate;	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void lodge(double amount){
		balance += amount;
	}
	
	public void setInterestRate(double rate){
		interestRate = rate;
	}
	/** withdraws money from the account, if there is enough money there
	 */
	public void withdraw(double amount){
		if (amount <=balance){
			balance -= amount;
		}
	}
	
	public void addInterest() {
		balance *= (1 + interestRate/100);
	}
	
	public String toString() {
		return getName() + " " + getBalance();
	}
}
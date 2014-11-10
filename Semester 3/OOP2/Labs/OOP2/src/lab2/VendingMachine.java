package lab2;

public class VendingMachine {

	private int cans;
	private int tokens;
	
	//Empty parameter constructor
	public VendingMachine() {
		cans = 0;
		tokens = 0;
	}
	//Complete parameter constructor i.e. contains all the attributes
	public VendingMachine(int cans, int tokens) {
		setCans(cans);
		setTokens(tokens);
	}
	
	//Setter
	public void setCans(int cans) {
		this.cans = cans;
	}
	
	public void setTokens(int tokens) {
		this.tokens = tokens;
	}
	
	//Inserting tokens into the machine
	public void insertToken() {
		if (isEmpty()) { //if cans is greater is 0
			cans--;
			tokens++;
		}
	}

	//Make sure the cans > 0
	public boolean isEmpty() {
		return this.cans > 0;
	}

	//Add more cans to the machine.
	public void fillUp(int cans) {
		this.cans += cans;
	}

	//Getter
	public int getCanCount() {
		return cans;
	}

	public int getTokenCount() {
		return tokens;
	}
	
	//Printing out
	public String toString() {
		return "Cans: " + getCanCount() + "\nTokens: " + getTokenCount();
	}


}

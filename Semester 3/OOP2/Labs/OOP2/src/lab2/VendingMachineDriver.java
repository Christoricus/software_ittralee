package lab2;
import javax.swing.JOptionPane;

public class VendingMachineDriver {
	static VendingMachine machine = new VendingMachine();

	public static void main(String[] args) {
		// VendingMachine machine = new VendingMachine();

		menu();

		JOptionPane.showMessageDialog(null, "Goodbye");
		System.exit(0);

	}// end of main

	// User-defined method to ask the amount of cans required
	public static void cansRequired() {
		boolean valid = false;
		do {
			String s = JOptionPane
					.showInputDialog("There are " + machine.getCanCount()
							+ " cans in the machine.\nHow many cans do you want?");
			if (isDigit(s)) {
				int totalToken = Integer.parseInt(s);
				if (machine.getCanCount() >= totalToken) {
					for (int i = 0; i < totalToken; i++)
						machine.insertToken();
					valid = true;
				}
			}//end of isDigit() check
		} while(!valid);

	}

	// User defined method to ask the amount of stock required
	public static void stockRequired() {
		do {
			String s = JOptionPane
					.showInputDialog("How many cans do you want to fill up?");

			if (isDigit(s))
				machine.fillUp(Integer.parseInt(s));

		} while (machine.getCanCount() <= 0);
	}

	public static void menu() {
		char ch;
		do {
			String choice = JOptionPane
					.showInputDialog("Hello, what would you like to do?\n"
							+ "Please specify from these options:\n"
							+ "[P]urchase \n" + "[S]tock up \n" + "[E]xit");
			ch = choice.toLowerCase().charAt(0);

			switch (ch) {
				case 'p' :
					/*
					 * Check to see if machine have any cans If there are cans
					 * available in the vending machine, display the amount of
					 * cans and ask how many cans you want. Else, if the vending
					 * machine is empty Ask if you want to fill up the machine
					 */
					if (machine.isEmpty())
						cansRequired();

					else {
						int ask = JOptionPane.showConfirmDialog(null,
								"Vending machine is empty! Wanna fill up?",
								"WARNING", JOptionPane.YES_NO_OPTION,
								JOptionPane.ERROR_MESSAGE);

						if (ask == JOptionPane.YES_OPTION)
							// Validation is used to make sure canCount > 0
							stockRequired();
					}
					break;

				case 's' :
					stockRequired();
					break;

				case 'e' :
					JOptionPane.showMessageDialog(null, machine.toString(),
							"Vending Machine", JOptionPane.INFORMATION_MESSAGE);
					break;

				default :
					JOptionPane.showMessageDialog(null,
							"Please enter valid input");
			}

		} while (ch != 'e');

	}// end of menu method

	//Check to see if the number entered is a digit
	public static boolean isDigit(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))
				return true;
		}
		return false;
	}

}

// Nazmul Alam - T00152975

/*
 * A program to play a guessing game
 */
package thirdca2014;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CA {

	//Global variables
	JFrame frame1;
	JTextField wordField;
	JTextField guessField;
	JLabel wordLabel;
	JLabel dashes;
	String totalDashes = "";  //used for the amount of dashes
	String wordEntered;
	int total = 0, totalGuessed;

	public CA()
	{
		//Working with frame 1
		frame1 = new JFrame("Word Game");
		frame1.setSize(500, 100);
		FlowLayout layout = new FlowLayout();
		frame1.setLayout(layout);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLocation(400, 300);
		
		wordLabel = new JLabel("Enter word");
		frame1.add(wordLabel);
		wordField = new JTextField(10);
		frame1.add(wordField);

		dashes = new JLabel();
		frame1.add(dashes); //Adding dashes after word is entered

		wordField.addActionListener(new EventHandler());


		frame1.setVisible(true);
	}

	public static void main(String[] args)
	{
		new CA();
	}

	private class EventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			if ( total == 0 ) {
				wordEntered = wordField.getText();

				wordLabel.setText("Guess a letter");

				//Setting amount of dashes
				for (int i = 0; i < wordEntered.length(); i++) {

					totalDashes += "-";

				}
				
				dashes.setText(totalDashes);
				wordField.setText("");
				total++;
				
			} else if ( total == 1 ) {
				
				
				//int position = 0;
				char letter = wordField.getText().charAt(0);
				totalGuessed++;

				wordField.setText("");

				for ( int j = 0; j < totalDashes.length(); j++)
				{
					
					if ( letter == wordEntered.charAt(j) )
						totalDashes = totalDashes.substring(0, j) + letter + totalDashes.substring(j+1, wordEntered.length());
	
				}
				
				dashes.setText(totalDashes);
				
				if (totalDashes.equals(wordEntered)) {
					JOptionPane.showMessageDialog(null, "Congratulations -"
							+ " you got the word! It took you " + totalGuessed + " guesses"
							, "Congratulations", JOptionPane.INFORMATION_MESSAGE );
					
					
					System.exit(0);
				}

			}
		}
	}


}

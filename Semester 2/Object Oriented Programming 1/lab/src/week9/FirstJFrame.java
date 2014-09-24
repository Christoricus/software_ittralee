package week9;

import javax.swing.JFrame;

public class FirstJFrame {
    
    public static void main(String[] args)
    {
	JFrame frame = new JFrame();
	
	frame.setTitle("First JFrame GUI App");
	frame.setSize(350, 300);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
    }

}

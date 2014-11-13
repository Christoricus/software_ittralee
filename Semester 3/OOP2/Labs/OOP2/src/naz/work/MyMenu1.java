package naz.work;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


//Class work

public class MyMenu1 extends JFrame {
	
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu characterMenu;
	private MyHandler handler;
	private MyHandler2 handler2;
	
	public MyMenu1() {
		//Set GUI Interface
		setTitle("MyGui");
		setSize(500,500);
		//setLocation(0,0);
		setLocationRelativeTo(null); //Set location to the origin
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Initialize JMenuBar
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		//Adding file menu to the menu bar
		createFileMenu();
		//Adding character menu to the menu bar
		createCharacterMenu();
		
	}
	
	public void createFileMenu() {
		handler = new MyHandler();
		
		fileMenu = new JMenu("File");
		
		JMenuItem openItem = new JMenuItem("Open");
		fileMenu.add(openItem);
		openItem.addActionListener(handler);
		
		JMenuItem saveItem = new JMenuItem("Save");
		fileMenu.add(saveItem);
		saveItem.addActionListener(handler);
		JMenuItem saveAsItem = new JMenuItem("Save as");
		fileMenu.add(saveAsItem);
		saveAsItem.addActionListener(handler);
		
		fileMenu.addSeparator();
		JMenuItem quitItem = new JMenuItem("Quit");
		fileMenu.add(quitItem);
		quitItem.addActionListener(handler);
		
		//Adding the menu items to the fileMenu
		menuBar.add(fileMenu);

	}
	
	public void createCharacterMenu() {
		handler2 = new MyHandler2();
		characterMenu = new JMenu("Character");
		
		JMenuItem addItem = new JMenuItem("Add");
		characterMenu.add(addItem);
		addItem.addActionListener(handler2);
		JMenuItem displayItem = new JMenuItem("Display");
		characterMenu.add(displayItem);
		displayItem.addActionListener(handler2);
		//Adding the menu items to the characterMenu
		menuBar.add(characterMenu);
	}
	
	/*
	public void actionPerformed(ActionEvent e) {
			
		if (e.getActionCommand().equals("Open")) 
			JOptionPane.showMessageDialog(null, "You clicked open");
		else if (e.getActionCommand().equals("Save"))
			JOptionPane.showMessageDialog(null, "You clicked save");
		else if (e.getActionCommand().equals("Save as"))
			JOptionPane.showMessageDialog(null, "You clicked save as");
		else if (e.getActionCommand().equals("Quit")) {
			JOptionPane.showMessageDialog(null, "You clicked quit");
			System.exit(0);
		}
		
	}//close actionPerformed()
	*/
	
	public static void main(String[] args) {
		MyMenu1 menu = new MyMenu1();
		menu.setVisible(true);
		
	}
	
	public class MyHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand().equals("Open")) 
				JOptionPane.showMessageDialog(null, "You clicked open");
			else if (e.getActionCommand().equals("Save"))
				JOptionPane.showMessageDialog(null, "You clicked save");
			else if (e.getActionCommand().equals("Save as"))
				JOptionPane.showMessageDialog(null, "You clicked save as");
			else if (e.getActionCommand().equals("Quit")) {
				JOptionPane.showMessageDialog(null, "You clicked quit");
				System.exit(0);
			} 

		}

	} //end of inner class 1
	
	public class MyHandler2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if (e.getActionCommand().equals("Add"))
				JOptionPane.showMessageDialog(null, "You clicked add");
			else if (e.getActionCommand().equals("Display"))
				JOptionPane.showMessageDialog(null, "You clicked display");
		}
	} //end of inner class 2
	
}

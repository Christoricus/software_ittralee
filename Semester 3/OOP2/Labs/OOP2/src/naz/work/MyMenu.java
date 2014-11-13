package naz.work;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;


//Class work

public class MyMenu extends JFrame implements ActionListener {
	
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu characterMenu;
	
	public MyMenu() {
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
		fileMenu = new JMenu("File");
		
		JMenuItem openItem = new JMenuItem("Open");
		fileMenu.add(openItem);
		openItem.addActionListener(this);
		
		JMenuItem saveItem = new JMenuItem("Save");
		fileMenu.add(saveItem);
		saveItem.addActionListener(this);
		JMenuItem saveAsItem = new JMenuItem("Save as");
		fileMenu.add(saveAsItem);
		saveAsItem.addActionListener(this);
		
		fileMenu.addSeparator();
		JMenuItem quitItem = new JMenuItem("Quit");
		fileMenu.add(quitItem);
		quitItem.addActionListener(this);
		
		//Adding the menu items to the fileMenu
		menuBar.add(fileMenu);

	}
	
	public void createCharacterMenu() {
		characterMenu = new JMenu("Character");
		
		JMenuItem addItem = new JMenuItem("Add");
		characterMenu.add(addItem);
		JMenuItem displayItem = new JMenuItem("Display");
		characterMenu.add(displayItem);
		//Adding the menu items to the characterMenu
		menuBar.add(characterMenu);
	}
	
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
	
	public static void main(String[] args) {
		MyMenu menu = new MyMenu();
		menu.setVisible(true);
		
	}
	
}

package lab4;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class BicycleFrame2 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BicycleFrame2() throws IOException {
		setTitle("Bicycle Shop");
		setSize(400, 200);
		setLocation(100, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		String imagePath = "cycling.png";
		InputStream imgStream = BicycleFrame2.class.getResourceAsStream(imagePath );
		BufferedImage myImg = ImageIO.read(imgStream);
		
		try {
			myImg = ImageIO.read(imgStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//setIconImage(new ImageIcon("cycling.png").getImage());
		setIconImage(myImg);
		getContentPane().setBackground(Color.GRAY);
	}
	
	public static void main(String[] args) throws IOException {
		BicycleFrame2 myShop = new BicycleFrame2();
		myShop.setVisible(true);
	}
}

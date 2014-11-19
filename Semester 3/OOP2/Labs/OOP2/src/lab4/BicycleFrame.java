package lab4;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class BicycleFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BicycleFrame() throws IOException {
		setTitle("Bicycle Shop");
		setSize(400, 200);
		setLocation(100, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		String imagePath = "cycling.png";
		InputStream imgStream = BicycleFrame.class.getResourceAsStream(imagePath );
		BufferedImage myImg = ImageIO.read(imgStream);
		
		try {
			myImg = ImageIO.read(imgStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//setIconImage(new ImageIcon("cycling.png").getImage());
		setIconImage(myImg);
	}
	
	public static void main(String[] args) throws IOException {
		BicycleFrame myShop = new BicycleFrame();
		myShop.setVisible(true);
	}
}

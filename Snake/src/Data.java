import java.net.URL;

import javax.swing.ImageIcon;

public class Data {
	public static URL upURL = Data.class.getResource("statics/up.png");
	public static URL downURL = Data.class.getResource("statics/down.png");
	public static URL rightURL = Data.class.getResource("statics/right.png");
	public static URL leftURL = Data.class.getResource("statics/left.png");
	
	public static ImageIcon up = new ImageIcon(upURL);
	public static ImageIcon down = new ImageIcon(downURL);
	public static ImageIcon right = new ImageIcon(rightURL);
	public static ImageIcon left = new ImageIcon(leftURL);
	
	public static URL bodyURL = Data.class.getResource("statics/body.png");
	public static URL foodURL = Data.class.getResource("statics/food.png");
	
	public static ImageIcon body = new ImageIcon(bodyURL);
	public static ImageIcon food = new ImageIcon(foodURL);

}

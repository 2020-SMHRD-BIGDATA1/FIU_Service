package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MapPanel extends JPanel {

	String path;
	BufferedImage pic;

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public void paint(Graphics g) {
		try {
			pic = ImageIO.read(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g.drawImage(pic, 0, 0, null);

	}

}

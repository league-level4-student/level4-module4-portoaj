package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{
	Image img;
	ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		try {
			img = ImageIO.read(this.getClass().getResource("/folder/pacman.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img, x, y, width, height, Color.green, null);
	}

}

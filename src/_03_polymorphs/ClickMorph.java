package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

public class ClickMorph extends Polymorph{

	ClickMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	public void clicked(MouseEvent arg0)
	{
		System.out.println("clicky1");
		Point point = arg0.getPoint();
		Rectangle imageBounds = new Rectangle(x,y,width, height);
		if (imageBounds.contains(point)){
		    //point is inside given image
			System.out.println("clicky");
			JOptionPane.showMessageDialog(null, " ");
		}
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.pink);
		g.fillRect(x, y, width, height);
	}
}

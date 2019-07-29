package _03_polymorphs;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    ArrayList<Polymorph> polys;
    public static void main(String[] args) {
    	
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
     polys = new ArrayList<Polymorph>();
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseListener(this);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
   	 polys.add(new BluePolymorph(50,50,20,20));
   	 polys.add(new MovingMorph(50,50,20,20));
   	 polys.add(new RedMorph(200, 200, 30, 30));
   	 polys.add(new MouseMorph(300,300, 15,15));
   	 polys.add(new ImageMorph(400,400, 60,60));
   	 polys.add(new ClickMorph(400, 200, 50,50));
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for(Polymorph poly : polys)
   	 {
   		 poly.draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 //update polymorph
   	for(Polymorph poly : polys)
  	 {
  		 poly.update();
  	 }
    }

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		for(Polymorph poly : polys)
	  	 {
	  		 if(poly instanceof ClickMorph)
	  			 ((ClickMorph) poly).clicked(arg0);
	  	 }
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

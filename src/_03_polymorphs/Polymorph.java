package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    public void setX(int _x)
    {
    	x = _x;
    }
    public int getX()
    {
    	return x;
    }
    public void setY(int _y)
    {
    	y = _y;
    }
    public int getY()
    {
    	return y;
    }
    public void setWidth(int _width)
    {
    	width = _width;
    }
    public int getWidth()
    {
    	return width;
    }
    public void setHeight(int _height)
    {
    	height = _height;
    }
    public int getHeight()
    {
    	return height;
    }
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}

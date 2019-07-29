package _03_polymorphs;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.lang.*;
public abstract class Polymorph {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    private long startTime;
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
   	 startTime = System.currentTimeMillis();
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
   	 if(this instanceof MovingMorph)
   	 {
   		 this.x += Math.cos((System.currentTimeMillis() - startTime)/1000) > 0 ? 1 : -1;
   		 this.y += Math.sin((System.currentTimeMillis() - startTime)/1000) > 0 ? 1 : -1;
   	 }
   	 else if(this instanceof MouseMorph)
   	 {
   		 this.x = MouseInfo.getPointerInfo().getLocation().x; 
   		 this.y = MouseInfo.getPointerInfo().getLocation().y; 
   	 }
    }
    
    public abstract void draw(Graphics g);
}

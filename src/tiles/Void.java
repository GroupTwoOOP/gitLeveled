package tiles;

import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;
import interfaces.IObstical;

import java.awt.Color;

public class Void extends Tile implements IObstical{
	/**
	 * 
	 */
	private static final long serialVersionUID = 99L;
	public Void (){
		id = 99;
		GreenfootImage image = new GreenfootImage(tileSize,tileSize);
		image.setColor(Color.black);
		image.fill();
		setImage(image);
	}
	public void act(){
		if(Greenfoot.mouseClicked(this)){
			getWorld().addObject(getTileType(tileType), getX(), getY());
			removeTile(getWorld(), this);
		}
	}
	@Override
	public void updateTexture(){
		GreenfootImage image = new GreenfootImage(tileSize,tileSize);
		image.setColor(Color.black);
		image.fill();
		setImage(image);
	}
}

package tiles;

import interfaces.IObstical;

import java.awt.Color;

import objects.WorldItem;
import greenfoot.Greenfoot;
import greenfoot.World;

public class Lava extends Tile implements IObstical{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7L;
	public Lava(){
		image = "Images/lava.jpg";
		id = 7;
		this.setImage(image);
		this.getImage().scale(tileSize, tileSize);
	}
	public void act(){
		if(Greenfoot.mouseClicked(this)){
			if (Tile.itemMode){
				setOnTile(WorldItem.getItemByID(tileType));
				updateItem();
			}
			else{
				getWorld().addObject(getTileType(tileType), getX(), getY());
				removeTile(getWorld(), this);
			}
		}
		updateItem();
	}
}

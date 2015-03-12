package tiles;

import greenfoot.Greenfoot;
import greenfoot.World;

import java.awt.Color;

import objects.WorldItem;

public class Eihwaz extends Tile {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8L;
	public Eihwaz(){
		image = "Images/eihwaz.jpg";
		id = 8;
		this.setImage(image);
		this.getImage().scale(tileSize,tileSize);
	}
	public void act(){
		if(Greenfoot.mouseClicked(this)){
			if (Tile.itemMode){
				setOnTile(WorldItem.getItemByID(tileType));
			}
			else{
				getWorld().addObject(getTileType(tileType), getX(), getY());
				removeTile(getWorld(), this);
			}
		}
		updateItem();
	}
}

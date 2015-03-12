package tiles;

import java.awt.Color;

import objects.WorldItem;
import greenfoot.Greenfoot;
import greenfoot.World;

public class Iron extends Tile {
	/**
	 * 
	 */
	private static final long serialVersionUID =6L;
	public Iron(){
		image = "Images/iron.jpg";
		id = 6;
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

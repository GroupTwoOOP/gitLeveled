package tiles;

import greenfoot.Greenfoot;
import greenfoot.World;

import java.awt.Color;

import objects.WorldItem;

public class Sand extends Tile{
	/**
	 * 
	 */
	private static final long serialVersionUID =3L;
	public Sand(){
		image = "Images/sand.jpg";
		id = 3;
		this.setImage(image);
		this.getImage().scale(tileSize,tileSize);
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

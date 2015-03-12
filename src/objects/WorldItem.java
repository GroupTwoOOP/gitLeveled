package objects;

import java.io.Serializable;
import java.util.List;

import monsters.Wraith;
import tiles.Tile;
import greenfoot.World;
import greenfoot.Actor;

public class WorldItem extends Actor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1000L;
	protected int id;
	protected String image;
	protected int itemSize = 15;
	protected Tile onTile = null;
	public Tile getOnTile() {
		return onTile;
	}
	public void setOnTile(Tile onTile) {
		this.onTile = onTile;
	}
	public int getID(){
		return id;
	}
	public static WorldItem getItemByID(int id){
		WorldItem item = null;
		switch(id){
		case 0:
			item = new Chest();
			break;
		case 3001:
			item = new Wraith();
			break;
		}
		return item;
	}
	public void removeItem(World world, WorldItem item){
		List<Tile> space = world.getObjectsAt(item.getX(), item.getY(), Tile.class);
		space.get(0).setOnTile(null);
		world.removeObject(item);
	}
	public void updateTexture(){
		setImage(image);
		getImage().scale(itemSize, itemSize);
	}
}

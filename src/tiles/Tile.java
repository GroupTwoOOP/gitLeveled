package tiles;

import greenfoot.Actor;
import greenfoot.World;

import java.awt.Color;
import java.io.Serializable;
import java.util.List;

import objects.WorldItem;
public abstract class Tile extends Actor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	protected final static int tileSize = 15;
	protected int id;
	protected String image;
	public static int tileType;
	public static boolean itemMode = false;
	private WorldItem onTile;
	public int getID(){
		return id;
	}
	public static void removeTile(World world, Tile tile){
		world.removeObject(tile);
	}
	public static Tile getTileType(int id){
		Tile newTile = null;
		switch(id){
		case 0:
			newTile = new Grass();
			break;
		case 1:
			newTile = new Dirt();
			break;
		case 2:
			newTile = new Water();
			break;
		case 3:
			newTile = new Sand();
			break;
		case 4:
			newTile = new Stone();
			break;
		case 5:
			newTile = new Leaves();
			break;
		case 6:
			newTile = new Iron();
			break;
		case 7:
			newTile = new Lava();
			break;
		case 8:
			newTile = new Eihwaz();
			break;
		case 9:
			newTile = new Kenaz();
			break;
		case 10:
			newTile = new Fire();	
			break;
		case 11:
			newTile = new Wood();
			break;
		case 99:
			newTile = new Void();
			break;
			default:
				System.out.println("invalid tile id used");
		}
		return newTile;
	}
	public void updateTexture(){
		setImage(image);
		getImage().scale(tileSize, tileSize);
	}
	public static void updateItem(){
		World world = primary.World.getWorld();
		List<WorldItem> items = world.getObjects(WorldItem.class);
		if (items != null){
			for(WorldItem i : items){
				world.removeObject(i);
			}
		}
		List<Tile> tiles = world.getObjects(Tile.class);
		if (tiles != null){
			for (Tile t : tiles){
				if (t.onTile != null){
					world.addObject(t.onTile, t.getX(), t.getY());
					t.onTile.updateTexture();
				}
			}
		}
	}
	public void setOnTile(WorldItem item){
		if (item != null){
			item.setOnTile(this);
		}
		onTile = item;
	}
	public WorldItem getOnTile(){
		return onTile;
	}
}

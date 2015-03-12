package monsters;

import enums.DIRECTION;
import greenfoot.Greenfoot;
import interfaces.ICreature;
import interfaces.IObstical;

import java.util.ArrayList;
import java.util.List;

import objects.WorldItem;
import tiles.Tile;

public class Monster extends WorldItem implements IObstical, ICreature{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3000L;
	protected int moveRange;
	protected int aggroRange;
	protected int id;
	protected int speed = 3;
	protected int upCounter = 0;
	protected int downCounter = 0;
	protected int leftCounter = 0;
	protected int rightCounter = 0;
	protected int health;
	protected int armor;
	protected int damage;
	protected DIRECTION dir = DIRECTION.NORTH;
	private ArrayList<Tile> tiles = new ArrayList<Tile>();
	@Override
	public void magicHit(int damage) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void DoT(int damage) {
		// TODO Auto-generated method stub
		
	}

}

package primary;

import greenfoot.Greenfoot;
import tiles.*;

public class World extends greenfoot.World{
	private static World world;
	private final static int H = 50;
	private final static int W = 50;
	private final static int CS = 15;
	private boolean ini = false;
	public World() {
		super(W, H, CS);
		world = this;
		new TileManager();
	}
	public void act(){
		if (!ini){
			ini = true;
			Thread console = new Thread(new ConsoleIO());
			console.start();
		}
	}
	public static World getWorld() {
		return world;
	}
	public static int getH() {
		return H;
	}
	public static int getW() {
		return W;
	}
	public static int getCs() {
		return CS;
	}	
}

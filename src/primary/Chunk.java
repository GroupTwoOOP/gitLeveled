package primary;

import java.io.Serializable;

import greenfoot.Greenfoot;
import tiles.*;
import tiles.Void;

public class Chunk implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6200544841462781360L;
	public final static int chunkSize = 50;
	public Tile[][] tileMap = new Tile[chunkSize][chunkSize];
	public Chunk(){
		for (int x = 0; x < chunkSize; x++){
			for (int y = 0; y < chunkSize; y++){
				tileMap[x][y] = Tile.getTileType(0);
			}
		}
	}
	public Chunk(Tile[][] tiles){
		for (int x = 0; x < chunkSize; x++){
			for (int y = 0; y < chunkSize; y++){
				tileMap[x][y] = tiles[x][y];				
			}
		}
	}
}

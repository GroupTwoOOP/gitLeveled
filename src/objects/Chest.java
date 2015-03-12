package objects;

import interfaces.IObstical;
import greenfoot.Greenfoot;

public class Chest extends WorldItem implements IObstical{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1001L;
	public Chest(){
		id = 1001;
		image = "Images/chest.png";
		setImage(image);
		getImage().scale(itemSize, itemSize);
	}
	public void act(){
		if (Greenfoot.mouseClicked(this)){
			removeItem(getWorld(), this);
		}
	}
}

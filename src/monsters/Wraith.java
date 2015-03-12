package monsters;

import greenfoot.Greenfoot;

public class Wraith extends Monster{
	private static final long serialVersionUID =3001L;
	public Wraith(){
		image = "Images/wraith.png";
		id = 3001;
		setImage(image);
		health = 50;
		armor = 90;
		damage = 3;
		aggroRange = 4;
		moveRange = 3;
	}
	public void act(){
		if (Greenfoot.mouseClicked(this)){
			removeItem(getWorld(), this);
		}
	}
}

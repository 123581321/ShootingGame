
public class Character {
	double x,y,vx,vy;
	public Character(double x,double y,double vx,double vy) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}
	public void move()
	{
		x+=vx;
		y+=vy;
	}
	public void draw(MyFrame f) {
		f.setColor(0,128,0);
		f.fillRect(x+10, y, 7, 29);
		f.setColor(0,128,0);
		f.fillRect(x, y, 7, 29);
		f.setColor(0,128,0);
		f.fillRect(x+20, y, 7, 29);
		f.setColor(0,128,0);
		f.fillRect(x-10, y, 7, 29);
		f.setColor(0,128,0);
		f.fillRect(x+30, y, 7, 29);
	}

}

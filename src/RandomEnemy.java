
public class RandomEnemy extends Enemy{

	public RandomEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
		life = 2;
	}
	public void move() {
		super.move();
		vx= Math.random()*8-4;
	}
	@Override
	public void draw(MyFrame f) {
		// TODO 自動生成されたメソッド・スタブ
	     f.setColor(0,199,0);
	     f.fillRect(x+10,y,3,6);
	     f.fillRect(x+17,y,3,6);
	     f.fillRect(x+13,y+6,4,4);
	}

}

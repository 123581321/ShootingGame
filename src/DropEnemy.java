
public class DropEnemy extends Enemy {

	public DropEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
		life = 1;
	}
	public void move() {
		super.move();
		vy = vy + 0.1;
	}
	@Override
	public void draw(MyFrame f) {
		// TODO 自動生成されたメソッド・スタブ
		f.setColor(128,0,128);
		f.fillRect(x+10,y,10,3);
		f.fillRect(x+13,y+3,4,7);
	}

}

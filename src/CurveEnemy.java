
public class CurveEnemy extends Enemy{

	
	public CurveEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
		life =3;
	}
	public void move() {
		super.move();
		if(x <GameWorld.player.x) {
			//左にいるなら右に
			x++;
		}
		if(x >GameWorld.player.x) {
			//右にいるなら左に
			x--;
		}
	}
	@Override
	public void draw(MyFrame f) {
		// TODO 自動生成されたメソッド・スタブ
	
		f.setColor(0,0,0);
		f.fillOval(x+10,y,10,10);
		f.setColor(256,256,256);
		f.fillOval(x+12,y,6,10);
	}

}

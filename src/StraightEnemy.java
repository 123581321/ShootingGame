
public class StraightEnemy extends Enemy{

	public StraightEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
		life =5;
		
	}
	@Override
	public void draw(MyFrame f) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		
		f.setColor(128,128,0);
		f.fillRect(x+12,y,5,5);
		f.setColor(0,128,128);
		f.fillRect(x+13,y+5,3,5);

	}
	
}

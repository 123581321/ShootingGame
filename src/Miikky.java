import java.util.Random;

public class Miikky extends Enemy{

	 private Random rand = new Random();  // ランダム生成器

	 
	public Miikky(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
		life =10;
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
	public void draw(MyFrame f) {
		
		
		int i = (int)(Math.random() * 6); // 0〜9のランダムな整数
		
		f.setColor(0,0,0);
		f.fillOval(x+8,y+3,11,11);
		f.setColor(0,0,0);
		f.fillOval(x+22,y+3,11,11);
		f.setColor(0,0,0);
		f.fillOval(x+12,y+10,17,17);
		
		
			
				switch(i) {
				case 0:
					f.drawString("ハハッ",(int)x+2,(int)y,5);
					
					break;
				case 1:
			        f.drawString("僕から逃げられると思うなよ",(int)x+2,(int)y,5);
			       
					break;
				case 2:
					f.drawString("そこにいるのは分かってるんだ",(int)x+2,(int)y,5);
					
					break;
				case 3:
					f.drawString("こ〇すぞ",(int)x+2,(int)y,5);
					
					break;
				case 4:
					f.drawString("夢は金で買え",(int)x+2,(int)y,5);
					 
					break;
				case 5:
					f.drawString("閉園のお時間です",(int)x+2,(int)y,5);
					
					break;
			 
			
				
			
			}
		}
		
		
		
				
	}

	

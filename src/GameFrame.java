import java.util.Vector;

public class GameFrame extends MyFrame{
	public void run() {
		GameWorld.player = new Player(100,300,0,0);
	    addKeyListener(GameWorld.player);
	    GameWorld.stage =1;
	    GameWorld.score = 0;
	    
	    while(true) {
	    	GameWorld.player.x =100;
	    	GameWorld.player.y = 300;
	    	GameWorld.playerBullets = new Vector<PlayerBullet>(); 
		    GameWorld.enemies = new Vector<Enemy>(); 
		    GameWorld.enemies.add(new EnemyBase(100,50,GameWorld.stage,0));
		    GameWorld.enterPressed = false;
		    while(true) {
		    	clear();
		    	drawString("stage = "+GameWorld.stage,300,50,15 );
		    	drawString("score = "+GameWorld.score,300,80,15 );
		    	GameWorld.player.draw(this);
		    	GameWorld.player.move();
		    	movePlayBullets();
		    	moveEnemies();
		    	checkPlayerAndEnemies();
		    	checkPlayerBulletAndEnemies();
		    	if(GameWorld.enemies.size()==0) {
		    		setColor(0,0,0);
		    		drawString("クリア",100,200,40);
		    		if(GameWorld.enterPressed) {
		    			GameWorld.stage++;
		    			break;
		    			
		    		}
		    	}else if (GameWorld.player.y <0) {
		    		setColor(0,0,0);
		    		drawString("ゲームオーバー",50,200,40);
		    		if(GameWorld.enterPressed) {
		    			GameWorld.stage = 1;
		    			GameWorld.score = 0;
		    			break;
		    			
		    		}
		    		
		    	}
		        sleep(0.03);
			    
		    	
		    }
		
	    }
	}
	public void movePlayBullets() {
		int i = 0;
    	while (i<GameWorld.playerBullets.size()) {
    		PlayerBullet b =GameWorld.playerBullets.get(i);
    		b.draw(this);
    		b.move();
    		if(b.y<0) {
    			GameWorld.playerBullets.remove(i);
    			
    		}else {
    			i++;
    		}
    	}
	}
	public void moveEnemies() {
    	for(int i = 0; i < GameWorld.enemies.size();i++){
    		Enemy e  = GameWorld.enemies.get(i);
    		e.draw(this);
    		e.move();	
    	}
    	int i = 0;
		while(i<GameWorld.enemies.size()) {
			Enemy e =GameWorld.enemies.get(i);
			if(e.y>400) {
				GameWorld.enemies.remove(i);
				
			}else {
				i++;
			}
    		
    	}
	}
	public void checkPlayerAndEnemies() {
		for(int i = 0; i<GameWorld.enemies.size();i++) {
    		Enemy e = GameWorld.enemies.get(i);
    		if(checkHits(GameWorld.player,e)) {
    			System.out.println("やられた");
    			GameWorld.player.y = -1000;
    		}
    		
    	}
		
	}
	public void checkPlayerBulletAndEnemies() {
	    int i = 0;
	    while (i < GameWorld.playerBullets.size()) {
	        PlayerBullet b = GameWorld.playerBullets.get(i);
	        int j = 0;
	        int hits = 0;

	        while (j < GameWorld.enemies.size()) {
	            Enemy e = GameWorld.enemies.get(j);
	            if ( checkHits(e,b)) {
	                System.out.println("あたり");
	                hits++;
	                e.life--;
	            }
	                if(e.life<=0) {
	                	GameWorld.score+=e.score;
	                	GameWorld.enemies.remove(j);
	                // enemies.remove(j) したら j++ しないのが正解
	            } else {
	                j++;
	            }
	        }

	        if (hits > 0) {
	            GameWorld.playerBullets.remove(i);
	            // 当たったので、弾も削除 → i は増やさない
	        } else {
	            i++; // 当たっていないので、次の弾へ
	        }
	    }
	}
	public boolean checkHits(Character a,Character b) {
		if(Math.abs(a.x - b.x) <= 15 && Math.abs(a.y - b.y) <= 15) {
			return true;
		}else {
			return false;
		}
	}
}



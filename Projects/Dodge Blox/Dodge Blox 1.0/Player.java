package com.turtorial.main;

import java.util.Random;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

public class Player extends GameObject {
	
	Random r = new Random();
	Handler handler;
	
	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}


	public void tick() {
		x+= velX;
		y += velY;
		x = Game.clamp(x,  0, Game.WIDTH - 30);
		y = Game.clamp(y,  0, Game.HEIGHT - 60);
		
		collision();
	}
	
	private void collision() {
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			if(tempObject.getId() == ID.BasicEnemy || tempObject.getId() == ID.SlowEnemy || tempObject.getId() == ID.FastEnemy || tempObject.getId() == ID.BigEnemy || tempObject.getId() == ID.TinyEnemy || tempObject.getId() == ID.BossEnemy || tempObject.getId() == ID.BossEnemy2 || tempObject.getId() == ID.BossEnemy3 || tempObject.getId() == ID.BossEnemy4 || tempObject.getId() == ID.BossEnemy5 || tempObject.getId() == ID.BossEnemy6 || tempObject.getId() == ID.BossEnemy7 || tempObject.getId() == ID.BossEnemy8 || tempObject.getId() == ID.BossEnemy9 || tempObject.getId() == ID.BossEnemy10) {
				//collision
				if(getBounds().intersects(tempObject.getBounds())) {
					HUD.HEALTH -= 2;
				}
			}
		}
	}


	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
		
	}
	
	

}

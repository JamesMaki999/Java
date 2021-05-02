/*
 * DodgeBlox Halloween Edition
 * Developer: James Maki
 * Created: Wednesday, ‎September ‎11, ‎2019
 * Last Updated: Saturday, October 5, 2019
 */
package com.samantha.main;

import java.util.Random;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

public class Player extends GameObject {
	
	Random r = new Random();
	Handler handler;
	int xBox = 54;
	int yBox = 54;
	Color brown = new Color(139, 69, 19);
	
	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 26, 32);
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
			if(tempObject.getId() == ID.BasicEnemy || tempObject.getId() == ID.BasicEnemy2 || tempObject.getId() == ID.BasicEnemy3 || tempObject.getId() == ID.BasicEnemy4 || tempObject.getId() == ID.BossEnemy || tempObject.getId() == ID.BossEnemy2 || tempObject.getId() == ID.BossEnemy3 || tempObject.getId() == ID.BossEnemy4) {
				//collision
				if(getBounds().intersects(tempObject.getBounds())) {
					HUD.HEALTH -= 2;
				}
			}
		}
	}


	public void render(Graphics g) {
		
		g.setColor(Color.white);
		g.fillRect(x + 12, y + 2, 2, 2);
		g.fillRect(x + 10, y + 4, 6, 2);
		g.fillRect(x + 10, y + 6, 6, 2);
		g.fillRect(x + 8, y + 8, 10, 2);
		g.fillRect(x + 10, y + 10, 6, 2);
		g.fillRect(x + 6, y + 18, 2, 2);
		g.fillRect(x + 16, y + 18, 2, 2);
		g.setColor(Color.black);
		//Corn outline, clockwise
		g.fillRect(x + 12, y, 2, 2);
		g.fillRect(x + 14, y + 2, 2, 2);
		g.fillRect(x + 16, y + 4, 2, 4);
		g.fillRect(x + 18, y + 8, 2, 4);
		g.fillRect(x + 20, y + 12, 2, 4);
		g.fillRect(x + 22, y + 16, 2, 4);
		g.fillRect(x + 24, y + 20, 2, 6);
		g.fillRect(x + 22, y + 26, 2, 2);
		g.fillRect(x + 20, y + 28, 2, 2);
		g.fillRect(x + 6, y + 30, 14, 2);
		g.fillRect(x + 4, y + 28, 2, 2);
		g.fillRect(x + 2, y + 26, 2, 2);
		g.fillRect(x, y + 20, 2, 6);
		g.fillRect(x + 2, y + 16, 2, 4);
		g.fillRect(x + 4, y + 12, 2, 4);
		g.fillRect(x + 6, y + 8, 2, 4);
		g.fillRect(x + 8, y + 4, 2, 4);
		g.fillRect(x + 10, y + 2, 2, 2);
		//Eyes, left to right
		g.fillRect(x + 8, y + 18, 2, 4);
		g.fillRect(x + 6, y + 20, 2, 2);
		g.fillRect(x + 18, y + 18, 2, 4);
		g.fillRect(x + 16, y + 20, 2, 2);
		//Mouth
		g.fillRect(x + 12, y + 24, 2, 2);
		//Inside fill, yellow to red, top to bottom
		g.setColor(Color.orange);
		g.fillRect(x + 8, y + 10, 2, 2);
		g.fillRect(x + 16, y + 10, 2, 2);
		g.fillRect(x + 6, y + 12, 14, 2);
		g.fillRect(x + 6, y + 14, 14, 2);
		g.fillRect(x + 4, y + 16, 18, 2);
		g.fillRect(x + 10, y + 18, 6, 2);
		g.setColor(Color.red);
		g.fillRect(x + 6, y + 28, 14, 2);
		g.fillRect(x + 4, y + 26, 18, 2);
		g.fillRect(x + 2, y + 24, 10, 2);
		g.fillRect(x + 14, y + 24, 10, 2);
		g.fillRect(x + 2, y + 22, 22, 2);
		g.fillRect(x + 2, y + 20, 4, 2);
		g.fillRect(x + 10, y + 20, 6, 2);
		g.fillRect(x + 20, y + 20, 4, 2);
		g.fillRect(x + 4, y + 18, 2, 2);
		g.fillRect(x + 20, y + 18, 2, 2);
	}
	
	

}

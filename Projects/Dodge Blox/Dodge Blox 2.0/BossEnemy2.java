/*
 * DodgeBlox Halloween Edition
 * Developer: James Maki
 * Created: Wednesday, ‎September ‎11, ‎2019
 * Last Updated: Saturday, October 5, 2019
 */
package com.samantha.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class BossEnemy2 extends GameObject{
	//SoulEater Boss
	private Handler handler;
	private Random r = new Random();
	private Color col;
	int randomInt = r.nextInt(5) + 3;
	
	public BossEnemy2(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		velX = randomInt;
		velY = randomInt;
		
		col = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 54, 54);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 32) velX *= -1;
	}

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x + 2, y + 2, 8, 2);
		g.fillRect(x + 10, y + 4, 10, 2);
		g.fillRect(x + 20, y + 6, 10, 2);
		g.fillRect(x + 30, y + 8, 8, 2);
		g.fillRect(x + 38, y + 10, 4, 2);
		g.fillRect(x + 42, y + 12, 2, 2);
		g.fillRect(x + 44, y + 14, 2, 2);
		g.fillRect(x + 46, y + 16, 2, 4);
		g.fillRect(x + 48, y + 20, 2, 6);
		g.fillRect(x + 50, y + 26, 2, 6);
		g.fillRect(x + 48, y + 32, 2, 6);
		g.fillRect(x + 46, y + 38, 2, 4);
		g.fillRect(x + 44, y + 42, 2, 2);
		g.fillRect(x + 42, y + 44, 2, 2);
		g.fillRect(x + 38, y + 46, 4, 2);
		g.fillRect(x + 32, y + 48, 6, 2);
		g.fillRect(x + 26, y + 50, 6, 2);
		g.fillRect(x + 20, y + 48, 6, 2);
		g.fillRect(x + 16, y + 46, 4, 2);
		g.fillRect(x + 14, y + 44, 2, 2);
		g.fillRect(x + 12, y + 42, 2, 2);
		g.fillRect(x + 10, y + 38, 2, 4);
		g.fillRect(x + 8, y + 32, 2, 6);
		g.fillRect(x + 6, y + 26, 2, 6);
		g.fillRect(x + 8, y + 20, 2, 6);
		g.fillRect(x + 10, y + 16, 2, 4);
		g.fillRect(x + 8, y + 12, 2, 4);
		g.fillRect(x + 6, y + 8, 2, 4);
		g.fillRect(x + 4, y + 4, 2, 4);
		g.fillRect(x + 14, y + 20, 30, 26);
		g.setColor(Color.black);
		//Outline, clockwise
		g.fillRect(x, y, 10, 2);
		g.fillRect(x + 10, y + 2, 10, 2);
		g.fillRect(x + 20, y + 4, 10, 2);
		g.fillRect(x + 30, y + 6, 8, 2);
		g.fillRect(x + 38, y + 8, 4, 2);
		g.fillRect(x + 42, y + 10, 2, 2);
		g.fillRect(x + 44, y + 12, 2, 2);
		g.fillRect(x + 46, y + 14, 2, 2);
		g.fillRect(x + 48, y + 16, 2, 4);
		g.fillRect(x + 50, y + 20, 2, 6);
		g.fillRect(x + 52, y + 26, 2, 6);
		g.fillRect(x + 50, y + 32, 2, 6);
		g.fillRect(x + 48, y + 38, 2, 4);
		g.fillRect(x + 46, y + 42, 2, 2);
		g.fillRect(x + 44, y + 44, 2, 2);
		g.fillRect(x + 42, y + 46, 2, 2);
		g.fillRect(x + 38, y + 48, 4, 2);
		g.fillRect(x + 32, y + 50, 6, 2);
		g.fillRect(x + 26, y + 52, 6, 2);
		g.fillRect(x + 20, y + 50, 6, 2);
		g.fillRect(x + 16, y + 48, 4, 2);
		g.fillRect(x + 14, y + 46, 2, 2);
		g.fillRect(x + 12, y + 44, 2, 2);
		g.fillRect(x + 10, y + 42, 2, 2);
		g.fillRect(x + 8, y + 38, 2, 4);
		g.fillRect(x + 6, y + 32, 2, 6);
		g.fillRect(x + 4, y + 26, 2, 6);
		g.fillRect(x + 6, y + 20, 2, 6);
		g.fillRect(x + 8, y + 16, 2, 4);
		g.fillRect(x + 6, y + 12, 2, 4);
		g.fillRect(x + 4, y + 8, 2, 4);
		g.fillRect(x + 2, y + 4, 2, 4);
		g.fillRect(x, y, 2, 4);
		//inside black filler, top to bottom
		g.fillRect(x + 6, y + 4, 4, 2);
		g.fillRect(x + 6, y + 6, 14, 2);
		g.fillRect(x + 8, y + 8, 22, 2);
		g.fillRect(x + 8, y + 10, 30, 2);
		g.fillRect(x + 10, y + 12, 32, 2);
		g.fillRect(x + 10, y + 14, 34, 2);
		g.fillRect(x + 12, y + 16, 34, 2);
		g.fillRect(x + 12, y + 18, 34, 2);
		g.fillRect(x + 10, y + 20, 4, 2);
		g.fillRect(x + 18, y + 20, 22, 2);
		g.fillRect(x + 44, y + 20, 4, 2);
		g.fillRect(x + 10, y + 22, 4, 2);
		g.fillRect(x + 24, y + 22, 10, 2);
		g.fillRect(x + 44, y + 22, 4, 2);
		g.fillRect(x + 10, y + 24, 4, 2);
		g.fillRect(x + 24, y + 24, 2, 2);
		g.fillRect(x + 32, y + 24, 2, 2);
		g.fillRect(x + 44, y + 24, 4, 2);
		g.fillRect(x + 8, y + 26, 8, 2);
		g.fillRect(x + 22, y + 26, 6, 2);
		g.fillRect(x + 30, y + 26, 6, 2);
		g.fillRect(x + 42, y + 26, 8, 2);
		g.fillRect(x + 8, y + 28, 42, 2);
		g.fillRect(x + 8, y + 30, 42, 2);
		g.fillRect(x + 10, y + 32, 4, 2);
		g.fillRect(x + 16, y + 32, 26, 2);
		g.fillRect(x + 44, y + 32, 4, 2);
		g.fillRect(x + 10, y + 34, 4, 2);
		g.fillRect(x + 16, y + 34, 4, 2);
		g.fillRect(x + 24, y + 34, 10, 2);
		g.fillRect(x + 38, y + 34, 4, 2);
		g.fillRect(x + 44, y + 34, 4, 2);
		g.fillRect(x + 10, y + 36, 4, 2);
		g.fillRect(x + 16, y + 36, 2, 2);
		g.fillRect(x + 20, y + 36, 2, 2);
		g.fillRect(x + 24, y + 36, 4, 2);
		g.fillRect(x + 30, y + 36, 4, 2);
		g.fillRect(x + 36, y + 36, 2, 2);
		g.fillRect(x + 40, y + 36, 2, 2);
		g.fillRect(x + 44, y + 36, 4, 2);
		g.fillRect(x + 12, y + 38, 4, 2);
		g.fillRect(x + 18, y + 38, 4, 2);
		g.fillRect(x + 24, y + 38, 2, 2);
		g.fillRect(x + 28, y + 38, 2, 2);
		g.fillRect(x + 32, y + 38, 2, 2);
		g.fillRect(x + 36, y + 38, 4, 2);
		g.fillRect(x + 42, y + 38, 4, 2);
		g.fillRect(x + 12, y + 40, 10, 2);
		g.fillRect(x + 26, y + 40, 6, 2);
		g.fillRect(x + 36, y + 40, 10, 2);
		g.fillRect(x + 14, y + 42, 8, 2);
		g.fillRect(x + 24, y + 42, 10, 2);
		g.fillRect(x + 36, y + 42, 8, 2);
		g.fillRect(x + 16, y + 44, 26, 2);
		g.fillRect(x + 20, y + 46, 18, 2);
		g.fillRect(x + 26, y + 48, 6, 2);
	}	
}
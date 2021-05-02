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

public class BossEnemy4 extends GameObject{
	//Scary Movie Boss Enemy
	private Handler handler;
	private Random r = new Random();
	int randomInt = r.nextInt(5) + 4;
	
	public BossEnemy4(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		velX = randomInt;
		velY = randomInt;
		
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 26, 42);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 32) velX *= -1;
	}

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x + 8, y + 4, 10, 36);
		g.fillRect(x + 18, y + 8, 4, 20);
		g.fillRect(x + 4, y + 8, 4, 20);
		g.fillRect(x + 22, y + 12, 2, 10);
		g.fillRect(x + 2, y + 12, 2, 10);
		
		g.setColor(Color.black);
		//Outline
		g.fillRect(x + 6, y, 14, 2);
		g.fillRect(x + 4, y + 2, 18, 2);
		g.fillRect(x + 18, y + 4, 6, 2);
		g.fillRect(x + 2, y + 4, 6, 2);
		g.fillRect(x + 18, y + 6, 8, 2);
		g.fillRect(x, y + 6, 8, 2);
		g.fillRect(x + 22, y + 8, 4, 4);
		g.fillRect(x, y + 8, 4, 4);
		g.fillRect(x + 24, y + 6, 2, 20);
		g.fillRect(x, y + 6, 2, 20);
		g.fillRect(x + 22, y + 22, 2, 8);
		g.fillRect(x + 2, y + 22, 2, 8);
		g.fillRect(x + 20, y + 24, 2, 8);
		g.fillRect(x + 4, y + 24, 2, 8);
		g.fillRect(x + 18, y + 28, 2, 8);
		g.fillRect(x + 6, y + 28, 2, 8);
		g.fillRect(x + 16, y + 36, 4, 2);
		g.fillRect(x + 6, y + 36, 4, 2);
		g.fillRect(x + 14, y + 38, 4, 2);
		g.fillRect(x + 8, y + 38, 4, 2);
		g.fillRect(x + 10, y + 40, 6, 2);
		//Details
		g.fillRect(x + 10, y + 24, 6, 10);
		g.fillRect(x + 12, y + 34, 2, 2);
		g.fillRect(x + 12, y + 20, 2, 2);
		g.fillRect(x + 4, y + 16, 6, 2);
		g.fillRect(x + 6, y + 14, 6, 2);
		g.fillRect(x + 8, y + 12, 4, 2);
		g.fillRect(x + 10, y + 10, 2, 2);
		//
		g.fillRect(x + 16, y + 16, 6, 2);
		g.fillRect(x + 14, y + 14, 6, 2);
		g.fillRect(x + 14, y + 12, 4, 2);
		g.fillRect(x + 14, y + 10, 2, 2);
	}	
}
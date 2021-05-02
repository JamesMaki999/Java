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

public class BasicEnemy2 extends GameObject{
	//PumpkinEnemy
	private Handler handler;
	private Random r = new Random();
	private Color col;
	int randomIntX = r.nextInt(5) + 1;
	int randomIntY = r.nextInt(5) + 1;
	int xBox = 30;
	int yBox = 30;
	
	public BasicEnemy2(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		velX = randomIntX;
		velY = randomIntY;
		
		col = new Color(51, 153, 51);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 16, 16);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 32) velX *= -1;
	}

	public void render(Graphics g) {
		g.setColor(col);
		g.fillRect(x + 14, y + 2, 2, 8);
		g.setColor(Color.orange);
		g.fillRect(x + 2, y + 10, 26, 16);
		g.fillRect(x + 8, y + 8, 4, 2);
		g.fillRect(x + 18, y + 8, 4, 2);
		g.fillRect(x + 8, y + 26, 14, 2);
		g.setColor(Color.black);
		g.fillRect(x + 12, y, 6, 2);
		g.fillRect(x + 16, y, 2, 10);
		g.fillRect(x + 18, y + 6, 4, 2);
		g.fillRect(x + 22, y + 8, 4, 2);
		g.fillRect(x + 26, y + 10, 2, 4);
		g.fillRect(x + 28, y + 14, 2, 8);
		g.fillRect(x + 26, y + 22, 2, 4);
		g.fillRect(x + 22, y + 26, 4, 2);
		g.fillRect(x + 8, y + 28, 14, 2);
		g.fillRect(x + 4, y + 26, 4, 2);
		g.fillRect(x + 2, y + 22, 2, 4);
		g.fillRect(x, y + 14, 2, 8);
		g.fillRect(x + 2, y + 10, 2, 4);
		g.fillRect(x + 4, y + 8, 4, 2);
		g.fillRect(x + 8, y + 6, 4, 2);
		g.fillRect(x + 12, y, 2, 10);
		//Details, top to bottom, left to right
			//Eyes
		g.fillRect(x + 6, y + 12, 2, 6);
		g.fillRect(x + 8, y + 14, 2, 2);
		g.fillRect(x + 8, y + 16, 4, 2);
		g.fillRect(x + 22, y + 12, 2, 6);
		g.fillRect(x + 20, y + 14, 2, 2);
		g.fillRect(x + 18, y + 16, 4, 2);
			//Mouth
		g.fillRect(x + 6, y + 20, 2, 4);
		g.fillRect(x + 8, y + 22, 2, 4);
		g.fillRect(x + 10, y + 20, 2, 4);
		g.fillRect(x + 12, y + 22, 2, 4);
		g.fillRect(x + 14, y + 20, 2, 4);
		g.fillRect(x + 16, y + 22, 2, 4);
		g.fillRect(x + 18, y + 20, 2, 4);
		g.fillRect(x + 20, y + 22, 2, 4);
		g.fillRect(x + 22, y + 20, 2, 4);
	}	
}
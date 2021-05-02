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

public class BasicEnemy4 extends GameObject{
	//DevilEnemy
	private Handler handler;
	private Random r = new Random();
	private Color col;
	int randomIntX = r.nextInt(5) + 1;
	int randomIntY = r.nextInt(5) + 1;
	int xBox = 32;
	int yBox = 32;
	Color green = new Color(24, 195, 47);
	
	public BasicEnemy4(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		velX = randomIntX;
		velY = randomIntY;
		
		col = new Color(24, 208, 49);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 42, 40);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 32) velX *= -1;
	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x + 12, y + 2, 18, 2);
		g.fillRect(x + 10, y + 4, 22, 2);
		g.fillRect(x + 10, y + 6, 22, 2);
		g.fillRect(x + 8, y + 8, 26, 2);
		g.fillRect(x + 8, y + 10, 26, 2);
		//Horns, left to right
		g.fillRect(x, y + 4, 2, 2); //last line
		g.fillRect(x + 34, y + 10, 4, 2);
		g.fillRect(x + 34, y + 12, 2, 2);
		g.fillRect(x + 34, y + 8, 6, 2);
		g.fillRect(x + 36, y + 6, 4, 2);
		g.fillRect(x + 38, y + 4, 2, 2);
		g.fillRect(x + 2, y + 4, 2, 2);
		g.fillRect(x + 2, y + 6, 4, 2);
		g.fillRect(x + 2, y + 8, 6, 2);
		g.fillRect(x + 4, y + 10, 4, 2);
		g.fillRect(x + 6, y + 12, 2, 2);
		g.fillRect(x + 8, y + 12, 4, 4);
		g.fillRect(x + 18, y + 12, 6, 4);
		g.fillRect(x + 30, y + 12, 4, 4);
		g.fillRect(x + 10, y + 16, 22, 4);
		g.fillRect(x + 12, y + 20, 16, 2);
		g.fillRect(x + 14, y + 22, 12, 4);
		g.setColor(Color.black);
		//Skull outline, top to bottom, Clockwise
		g.fillRect(x + 12, y, 18, 2);
		g.fillRect(x + 30, y + 2, 2, 2);
		g.fillRect(x + 32, y + 4, 2, 4);
		// g.fillRect(x + 28, y + 8, 2, 8);
		g.fillRect(x + 2, y + 2, 2, 2);
		g.fillRect(x + 4, y + 4, 2, 2);
		g.fillRect(x + 6, y + 6, 4, 2);
		g.fillRect(x, y + 4, 2, 6);
		g.fillRect(x + 2, y + 10, 2, 2);
		g.fillRect(x + 4, y + 12, 2, 2);
		g.fillRect(x + 6, y + 14, 2, 2);
		///end
		g.fillRect(x + 34, y + 6, 2, 2);
		g.fillRect(x + 36, y + 4, 2, 2);
		g.fillRect(x + 38, y + 2, 2, 2);
		g.fillRect(x + 40, y + 4, 2, 6);
		g.fillRect(x + 38, y + 10, 2, 2);
		g.fillRect(x + 36, y + 12, 2, 2);
		g.fillRect(x + 34, y + 14, 2, 2);
		g.fillRect(x + 32, y + 16, 2, 4);
		g.fillRect(x + 28, y + 20, 4, 2);
		g.fillRect(x + 26, y + 22, 2, 4);
		g.fillRect(x + 16, y + 26, 10, 2);
		g.fillRect(x + 14, y + 22, 2, 4);
		g.fillRect(x + 10, y + 20, 4, 2);
		g.fillRect(x + 8, y + 16, 2, 4);
		//g.fillRect(x + 8, y + 8, 2, 8);
		g.fillRect(x + 8, y + 4, 2, 4);
		g.fillRect(x + 10, y + 2, 2, 2);
		//Details, top to bottom, left to right
		g.fillRect(x + 12, y + 12, 6, 4);
		g.fillRect(x + 14, y + 12, 4, 6);
		g.fillRect(x + 24, y + 12, 6, 4);
		g.fillRect(x + 24, y + 12, 4, 6);
		g.fillRect(x + 18, y + 24, 2, 2);
		g.fillRect(x + 22, y + 24, 2, 2);
		g.fillRect(x + 20, y + 18, 2, 4);
		g.fillRect(x + 20, y + 4, 2, 8);
		g.fillRect(x + 18, y + 8, 6, 2);
	}	
}
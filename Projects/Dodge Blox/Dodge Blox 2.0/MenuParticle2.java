/*
 * DodgeBlox Halloween Edition
 * Developer: James Maki
 * Created: Wednesday, ‎September ‎21, ‎2019
 * Last Updated: Saturday, October 5, 2019
 */
package com.samantha.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class MenuParticle2 extends GameObject{
	
	private Handler handler;
	Random r = new Random();
	
	private Color col;
	public MenuParticle2(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		velX = r.nextInt(5) + 1;
		velY = r.nextInt(5) + 1;
		
		col = new Color(255, 153, 0);
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
		g.setColor(Color.white);
		g.fillRect(x + 6, y + 2, 18, 2);
		g.fillRect(x + 4, y + 4, 22, 2);
		g.fillRect(x + 4, y + 6, 22, 2);
		g.fillRect(x + 2, y + 8, 26, 2);
		g.fillRect(x + 2, y + 10, 26, 2);
		g.fillRect(x + 2, y + 12, 4, 4);
		g.fillRect(x + 12, y + 12, 6, 4);
		g.fillRect(x + 24, y + 12, 4, 4);
		g.fillRect(x + 4, y + 16, 22, 4);
		g.fillRect(x + 6, y + 20, 16, 2);
		g.fillRect(x + 8, y + 22, 12, 4);
		g.setColor(Color.black);
		//Skull outline, top to bottom, Clockwise
		g.fillRect(x + 6, y, 18, 2);
		g.fillRect(x + 24, y + 2, 2, 2);
		g.fillRect(x + 26, y + 4, 2, 4);
		g.fillRect(x + 28, y + 8, 2, 8);
		g.fillRect(x + 26, y + 16, 2, 4);
		g.fillRect(x + 22, y + 20, 4, 2);
		g.fillRect(x + 20, y + 22, 2, 4);
		g.fillRect(x + 10, y + 26, 10, 2);
		g.fillRect(x + 8, y + 22, 2, 4);
		g.fillRect(x + 4, y + 20, 4, 2);
		g.fillRect(x + 2, y + 16, 2, 4);
		g.fillRect(x, y + 8, 2, 8);
		g.fillRect(x + 2, y + 4, 2, 4);
		g.fillRect(x + 4, y + 2, 2, 2);
		//Details, top to bottom, left to right
		g.fillRect(x + 6, y + 12, 6, 4);
		g.fillRect(x + 8, y + 12, 4, 6);
		g.fillRect(x + 18, y + 12, 6, 4);
		g.fillRect(x + 18, y + 12, 4, 6);
		g.fillRect(x + 12, y + 24, 2, 2);
		g.fillRect(x + 16, y + 24, 2, 2);
		g.fillRect(x + 14, y + 18, 2, 4);
	}
	
}
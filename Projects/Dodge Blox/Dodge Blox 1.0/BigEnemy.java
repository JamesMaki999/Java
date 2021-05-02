package com.turtorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class BigEnemy extends GameObject{
	
	private Handler handler;
	private Random r = new Random();
	private Color col;
	int randomIntX = r.nextInt(5) + 1;
	int randomIntY = r.nextInt(5) + 1;
	
	public BigEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		velX = randomIntX;
		velY = randomIntY;
		
		col = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
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
		g.fillRect(x,  y,  32,  32);
	}	
}
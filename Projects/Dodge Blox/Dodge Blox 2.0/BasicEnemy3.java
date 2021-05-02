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

public class BasicEnemy3 extends GameObject{
	//FrankensteinEnemy
	private Handler handler;
	private Random r = new Random();
	private Color col;
	int randomIntX = r.nextInt(5) + 1;
	int randomIntY = r.nextInt(5) + 1;
	int xBox = 30;
	int yBox = 30;
	Color green = new Color(0, 70, 0);
	Color green2 = new Color(21, 140, 21);
	Color black = new Color(31, 31, 31);
	
	public BasicEnemy3(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		velX = randomIntX;
		velY = randomIntY;
		
		col = new Color(24, 208, 49);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 30, 30);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 32) velX *= -1;
	}

	public void render(Graphics g) {
		//g.setColor(Color.white);
		g.fillRect(x, y, xBox, yBox);
		
		
		g.setColor(green2);
		g.fillRect(x + 2, y + 4, 26, 20);
		g.fillRect(x + 6, y + 24, 18, 2);
		g.fillRect(x + 8, y + 26, 14, 2);
		
		
		g.setColor(green);
		//Outline
		g.fillRect(x, y + 14, 2, 6);
		g.fillRect(x + 2, y + 20, 2, 4);
		g.fillRect(x + 4, y + 24, 2, 2);
		g.fillRect(x + 24, y + 24, 2, 2);
		g.fillRect(x + 6, y + 26, 2, 2);
		g.fillRect(x + 22, y + 26, 2, 2);
		g.fillRect(x + 8, y + 28, 14, 2);
		g.fillRect(x + 26, y + 20, 2, 4);
		g.fillRect(x + 28, y + 14, 2, 6);
		//Inside Details
		g.fillRect(x + 6, y + 8, 2, 10);
		g.fillRect(x + 6, y + 16, 18, 2);
		g.fillRect(x + 22, y + 8, 2, 10);
		g.fillRect(x + 4, y + 18, 2, 2);
		g.fillRect(x + 24, y + 18, 2, 2);
		g.fillRect(x + 6, y + 20, 6, 2);
		g.fillRect(x + 18, y + 20, 6, 2);
		g.fillRect(x + 12, y + 24, 6, 2);
		
		g.setColor(Color.white);
		g.fillRect(x + 6, y + 18, 6, 2);
		g.fillRect(x + 18, y + 18, 6, 2);
		g.fillRect(x + 2, y + 24, 2, 6);
		g.fillRect(x + 4, y + 26, 2, 2);
		g.fillRect(x + 26, y + 24, 2, 6);
		g.fillRect(x + 24, y + 26, 2, 2);
		
		g.setColor(Color.black);
		g.fillRect(x + 8, y + 18, 2, 2);
		g.fillRect(x + 20, y + 18, 2, 2);
		
		g.setColor(Color.red);
		g.fillRect(x + 20, y + 4, 2, 4);
		g.fillRect(x + 18, y + 8, 2, 2);
		g.fillRect(x + 16, y + 10, 2, 2);
		
		g.setColor(black);
		g.fillRect(x + 2, y, 2, 16);
		g.fillRect(x + 4, y, 2, 4);
		g.fillRect(x + 6, y, 2, 6);
		g.fillRect(x + 8, y, 2, 4);
		g.fillRect(x + 10, y, 2, 6);
		g.fillRect(x + 12, y, 2, 4);
		g.fillRect(x + 14, y, 2, 6);
		g.fillRect(x + 16, y, 2, 4);
		g.fillRect(x + 18, y, 2, 6);
		g.fillRect(x + 20, y, 2, 4);
		g.fillRect(x + 22, y, 2, 6);
		g.fillRect(x + 24, y, 2, 4);
		g.fillRect(x + 26, y, 2, 16);
		
		
		/*g.setColor(Color.black);
		g.fillRect(x + 3, y + 12, 7, 7);
		g.fillRect(x + 23, y + 12, 7, 7);
		g.fillRect(x + 13, y + 18, 3, 3);
		g.fillRect(x + 17, y + 18, 3, 3);
		g.fillRect(x, y + 24, 32, 2);
		g.fillRect(x + 4, y + 2, 2, 6);
		g.fillRect(x + 8, y + 2, 2, 6);
		g.fillRect(x + 12, y + 2, 2, 6);
		g.fillRect(x + 16, y + 2, 2, 6);
		g.fillRect(x + 4, y + 4, 12, 2);
		g.setColor(Color.gray);
		g.fillRect(x - 4, y + 18, 4, 4);
		g.fillRect(x - 8, y + 16, 4, 8);
		g.fillRect(x + 32, y + 18, 4, 4);
		g.fillRect(x  + 36, y + 16, 4, 8);
		*/
	}	
}
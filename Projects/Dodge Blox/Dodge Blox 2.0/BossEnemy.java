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

public class BossEnemy extends GameObject{
	//Jason boss
	private Handler handler;
	private Random r = new Random();
	private Color col;
	int randomInt = r.nextInt(5) + 1;
	
	public BossEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		velX = randomInt;
		velY = randomInt;
		
		col = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 38, 46);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 32) velX *= -1;
	}

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x + 12, y + 2, 14, 2);
		g.fillRect(x + 8, y + 4, 22, 36);
		g.fillRect(x + 6, y + 6, 2, 30);
		g.fillRect(x + 4, y + 8, 2, 24);
		g.fillRect(x + 2, y + 16, 2, 8);
		g.fillRect(x + 30, y + 6, 2, 30);
		g.fillRect(x + 32, y + 8, 2, 24);
		g.fillRect(x + 34, y + 16, 2, 8);
		g.fillRect(x + 12, y + 40, 14, 2);
		g.fillRect(x + 14, y + 42, 10, 2);
		g.setColor(Color.black);
		//top holes
		g.fillRect(x + 12, y + 4, 2, 2);
		g.fillRect(x + 12, y + 8, 2, 2);
		g.fillRect(x + 12, y + 12, 2, 2);
		g.fillRect(x + 24, y + 4, 2, 2);
		g.fillRect(x + 24, y + 8, 2, 2);
		g.fillRect(x + 24, y + 12, 2, 2);
		//middle holes
		g.fillRect(x + 16, y + 14, 2, 2);
		g.fillRect(x + 20, y + 14, 2, 2);
		//middle side holes, left to right
		g.fillRect(x + 6, y + 14, 2, 2);
		g.fillRect(x + 6, y + 10, 2, 2);
		g.fillRect(x + 30, y + 14, 2, 2);
		g.fillRect(x + 30, y + 10, 2, 2);
		//eyes
		g.fillRect(x + 8, y + 20, 8, 4);
		g.fillRect(x + 10, y + 20, 4, 6);
		g.fillRect(x + 22, y + 20, 8, 4);
		g.fillRect(x + 24, y + 20, 4, 6);
		//bottom holes
			//left row
		g.fillRect(x + 16, y + 32, 2, 2);
		g.fillRect(x + 16, y + 36, 2, 2);
		g.fillRect(x + 16, y + 40, 2, 2);
			//right row
		g.fillRect(x + 20, y + 32, 2, 2);
		g.fillRect(x + 20, y + 36, 2, 2);
		g.fillRect(x + 20, y + 40, 2, 2);
			//side holes, left to right
		g.fillRect(x + 24, y + 34, 2, 2);
		g.fillRect(x + 12, y + 34, 2, 2);
		//all red parts
			//top mask red parts
		g.setColor(Color.red);
		g.fillRect(x + 12, y + 16, 4, 2);
		g.fillRect(x + 22, y + 16, 4, 2);
		g.fillRect(x + 16, y + 18, 6, 2);
		g.fillRect(x + 18, y + 18, 2, 4);
			//bottom mask red parts, left to right
				//left
		g.fillRect(x + 8, y + 34, 2, 2);
		g.fillRect(x + 10, y + 32, 2, 2);
		g.fillRect(x + 12, y + 30, 2, 2);
				//right
		g.fillRect(x + 28, y + 34, 2, 2);
		g.fillRect(x + 26, y + 32, 2, 2);
		g.fillRect(x + 24, y + 30, 2, 2);
		//mask outline
			//left side of mask
		g.setColor(Color.black);
		g.fillRect(x + 14, y + 44, 10, 2);
		g.fillRect(x + 12, y + 42, 2, 2);
		g.fillRect(x + 10, y + 40, 2, 2);
		g.fillRect(x + 8, y + 38, 2, 2);
		g.fillRect(x + 6, y + 34, 2, 4);
		g.fillRect(x + 4, y + 30, 2, 4);
		g.fillRect(x + 2, y + 24, 2, 6);
		g.fillRect(x, y + 16, 2, 8);
		g.fillRect(x + 2, y + 10, 2, 6);
		g.fillRect(x + 4, y + 6, 2, 4);
		g.fillRect(x + 6, y + 4, 2, 2);
		g.fillRect(x + 8, y + 2, 4, 2);
			//right side of mask
		g.fillRect(x + 12, y, 14, 2);
		g.fillRect(x + 26, y + 2, 4, 2);
		g.fillRect(x + 30, y + 4, 2, 2);
		g.fillRect(x + 32, y + 6, 2, 4);
		g.fillRect(x + 34, y + 10, 2, 6);
		g.fillRect(x + 36, y + 16, 2, 8);
		g.fillRect(x + 34, y + 24, 2, 6);
		g.fillRect(x + 32, y + 30, 2, 4);
		g.fillRect(x + 30, y + 34, 2, 4);
		g.fillRect(x + 28, y + 38, 2, 2);
		g.fillRect(x + 26, y + 40, 2, 2);
		g.fillRect(x + 24, y + 42, 2, 2);
	}	
}
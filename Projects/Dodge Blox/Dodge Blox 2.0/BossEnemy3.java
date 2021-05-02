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

public class BossEnemy3 extends GameObject{
	//Doom Boss | CHANGE
	private Handler handler;
	private Random r = new Random();
	private Color col;
	int randomInt = r.nextInt(5) + 3;
	
	public BossEnemy3(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		velX = randomInt;
		velY = randomInt;
		
		col = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 54, 60);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 32) velX *= -1;
	}

	public void render(Graphics g) {
		g.setColor(Color.white);
		//Horn 1
		g.fillRect(x, y + 10, 2, 4);
		g.fillRect(x + 2, y + 12, 2, 4);
		//Horn 2
		g.fillRect(x + 6, y + 2, 2, 6);
		g.fillRect(x + 8, y + 4, 2, 6);
		g.fillRect(x + 10, y + 6, 2, 6);
		g.fillRect(x + 12, y + 6, 2, 6);
		g.fillRect(x + 14, y + 8, 2, 4);
		//Horn 3
		g.fillRect(x + 14, y, 2, 6);
		g.fillRect(x + 16, y + 2, 2, 4);
		g.fillRect(x + 18, y + 4, 2, 2);
		//Horn 4
		g.fillRect(x + 34, y + 4, 2, 2);
		g.fillRect(x + 36, y + 2, 2, 4);
		g.fillRect(x + 38, y, 2, 6);
		//Horn 5
		g.fillRect(x + 38, y + 8, 2, 4);
		g.fillRect(x + 40, y + 6, 2, 6);
		g.fillRect(x + 42, y + 6, 2, 6);
		g.fillRect(x + 44, y + 4, 2, 6);
		g.fillRect(x + 46, y + 2, 2, 6);
		//Horn 6
		g.fillRect(x + 50, y + 12, 2, 4);
		g.fillRect(x + 52, y + 10, 2, 4);
		//Bottom 1
		g.fillRect(x + 8, y + 54, 2, 4);
		g.fillRect(x + 8, y + 56, 6, 2);
		g.fillRect(x + 10, y + 56, 2, 4);
		//Bottom 2
		g.fillRect(x + 44, y + 54, 2, 4);
		g.fillRect(x + 40, y + 56, 6, 2);
		g.fillRect(x + 42, y + 56, 2, 4);
		//Teeth
		g.fillRect(x + 10, y + 36, 34, 14);
		
		g.setColor(Color.pink);
		g.fillRect(x + 10, y + 22, 34, 14);
		g.fillRect(x + 14, y + 36, 26, 2);
		g.fillRect(x + 22, y + 38, 10, 2);
		
		g.setColor(Color.gray);
		g.fillRect(x + 10, y + 28, 2, 2);
		g.fillRect(x + 12, y + 24, 2, 4);
		g.fillRect(x + 40, y + 24, 2, 4);
		g.fillRect(x + 42, y + 28, 2, 2);
		g.fillRect(x + 26, y + 32, 2, 8);
		
		g.setColor(Color.green);
		g.fillRect(x + 20, y + 22, 14, 8);
		
		g.setColor(Color.red);
		g.fillRect(x + 20, y + 6, 14, 2);
		g.fillRect(x + 18, y + 8, 18, 4);
		g.fillRect(x + 16, y + 12, 22, 10);
		g.fillRect(x + 8, y + 12, 2, 2);
		g.fillRect(x + 6, y + 14, 10, 2);
		g.fillRect(x + 4, y + 16, 12, 2);
		g.fillRect(x + 4, y + 18, 12, 2);
		g.fillRect(x + 2, y + 20, 14, 2);
		g.fillRect(x + 44, y + 12, 2, 2);
		g.fillRect(x + 38, y + 14, 10, 2);
		g.fillRect(x + 38, y + 16, 12, 2);
		g.fillRect(x + 38, y + 18, 12, 2);
		g.fillRect(x + 38, y + 20, 14, 2);
		g.fillRect(x + 46, y + 22, 6, 20);
		g.fillRect(x + 44, y + 22, 2, 4);
		g.fillRect(x + 42, y + 22, 2, 2);
		g.fillRect(x + 34, y + 22, 2, 2);
		g.fillRect(x + 22, y + 22, 10, 2);
		g.fillRect(x + 18, y + 22, 2, 2);
		g.fillRect(x + 10, y + 22, 2, 2);
		g.fillRect(x + 8, y + 22, 2, 4);
		g.fillRect(x + 2, y + 22, 6, 20);
		g.fillRect(x + 4, y + 42, 4, 2);
		g.fillRect(x + 4, y + 44, 6, 2);
		g.fillRect(x + 6, y + 46, 6, 2);
		g.fillRect(x + 6, y + 48, 10, 2);
		g.fillRect(x + 8, y + 50, 12, 2);
		g.fillRect(x + 10, y + 52, 34, 4);
		g.fillRect(x + 22, y + 56, 10, 2);
		g.fillRect(x + 26, y + 50, 2, 2);
		g.fillRect(x + 34, y + 50, 12, 2);
		g.fillRect(x + 38, y + 48, 10, 2);
		g.fillRect(x + 42, y + 46, 6, 2);
		g.fillRect(x + 44, y + 44, 6, 2);
		g.fillRect(x + 46, y + 42, 4, 2);
		
		g.setColor(Color.black);
		g.fillRect(x, y + 20, 2, 22);
		g.fillRect(x + 2, y + 42, 2, 4);
		g.fillRect(x + 4, y + 46, 2, 4);
		g.fillRect(x + 6, y + 50, 2, 2);
		g.fillRect(x + 8, y + 52, 2, 2);
		g.fillRect(x + 10, y + 54, 6, 2);
		g.fillRect(x + 16, y + 56, 6, 2);
		g.fillRect(x + 22, y + 58, 10, 2);
		g.fillRect(x + 32, y + 56, 6, 2);
		g.fillRect(x + 38, y + 54, 6, 2);
		g.fillRect(x + 44, y + 52, 2, 2);
		g.fillRect(x + 46, y + 50, 2, 2);
		g.fillRect(x + 48, y + 46, 2, 4);
		g.fillRect(x + 50, y + 42, 2, 4);
		g.fillRect(x + 52, y + 20, 2, 22);
		g.fillRect(x + 50, y + 16, 2, 4);
		g.fillRect(x + 48, y + 14, 2, 2);
		g.fillRect(x + 46, y + 12, 2, 2);
		g.fillRect(x + 44, y + 10, 2, 2);
		g.fillRect(x + 38, y + 12, 6, 2);
		g.fillRect(x + 36, y + 8, 2, 4);
		g.fillRect(x + 34, y + 6, 6, 2);
		g.fillRect(x + 20, y + 4, 14, 2);
		g.fillRect(x + 14, y + 6, 6, 2);
		g.fillRect(x + 16, y + 6, 2, 6);
		g.fillRect(x + 10, y + 12, 6, 2);
		g.fillRect(x + 8, y + 10, 2, 2);
		g.fillRect(x + 6, y + 12, 2, 2);
		g.fillRect(x + 4, y + 14, 2, 2);
		g.fillRect(x + 2, y + 16, 2, 4);
		//Face Details
			//Eye
		g.fillRect(x + 22, y + 24, 10, 2);
		g.fillRect(x + 32, y + 22, 2, 2);
		g.fillRect(x + 34, y + 24, 2, 4);
		g.fillRect(x + 32, y + 28, 2, 2);
		g.fillRect(x + 22, y + 30, 10, 2);
		g.fillRect(x + 20, y + 28, 2, 2);
		g.fillRect(x + 18, y + 24, 2, 4);
		g.fillRect(x + 20, y + 22, 2, 2);
		g.fillRect(x + 26, y + 26, 2, 4);
		g.fillRect(x + 12, y + 22, 6, 2);
		g.fillRect(x + 10, y + 24, 2, 2);
		g.fillRect(x + 8, y + 26, 2, 18);
		g.fillRect(x + 10, y + 44, 2, 2);
		g.fillRect(x + 12, y + 46, 4, 2);
		g.fillRect(x + 16, y + 48, 4, 2);
		g.fillRect(x + 20, y + 50, 6, 2);
		g.fillRect(x + 26, y + 48, 2, 2);
		g.fillRect(x + 28, y + 50, 6, 2);
		g.fillRect(x + 34, y + 48, 4, 2);
		g.fillRect(x + 38, y + 46, 4, 2);
		g.fillRect(x + 42, y + 44, 2, 2);
		g.fillRect(x + 44, y + 26, 2, 18);
		g.fillRect(x + 42, y + 24, 2, 2);
		g.fillRect(x + 36, y + 22, 6, 2);
			//Mouth, Left to Right
		g.fillRect(x + 10, y + 34, 2, 2);
		g.fillRect(x + 10, y + 38, 2, 4);
		g.fillRect(x + 12, y + 36, 2, 2);
		g.fillRect(x + 12, y + 40, 2, 8);
		g.fillRect(x + 14, y + 38, 8, 2);
		g.fillRect(x + 14, y + 40, 2, 4);
		g.fillRect(x + 16, y + 42, 2, 4);
		g.fillRect(x + 22, y + 40, 10, 2);
		g.fillRect(x + 32, y + 38, 8, 2);
		g.fillRect(x + 40, y + 36, 2, 2);
		g.fillRect(x + 42, y + 34, 2, 2);
		g.fillRect(x + 18, y + 40, 2, 10);
		g.fillRect(x + 20, y + 42, 2, 4);
		g.fillRect(x + 22, y + 42, 2, 8);
		g.fillRect(x + 24, y + 44, 2, 4);
		g.fillRect(x + 26, y + 42, 2, 2);
		g.fillRect(x + 28, y + 44, 2, 4);
		g.fillRect(x + 30, y + 42, 2, 8);
		g.fillRect(x + 32, y + 42, 2, 4);
		g.fillRect(x + 34, y + 40, 2, 10);
		g.fillRect(x + 36, y + 42, 2, 4);
		g.fillRect(x + 38, y + 40, 2, 4);
		g.fillRect(x + 40, y + 40, 2, 6);
		g.fillRect(x + 42, y + 38, 2, 4);
		
		g.setColor(Color.blue);
		g.fillRect(x + 26, y + 44, 2, 4);
	}	
}
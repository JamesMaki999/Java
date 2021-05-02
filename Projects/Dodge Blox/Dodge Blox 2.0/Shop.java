/*
 * DodgeBlox Halloween Edition
 * Developer: James Maki
 * Created: Wednesday, ‎September ‎11, ‎2019
 * Last Updated: Saturday, October 5, 2019
 */
package com.samantha.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import com.samantha.main.Game.STATE;

public class Shop extends MouseAdapter{
	
	Handler handler;
	HUD hud;
	Game game;
	
	private int Up1 = 1000;
	private int Up2 = 1000;
	private int Up3 = 1000;
	private int Up4 = 1000;
	private int Up5 = 50000;
	private int Up6 = 1000;
	public int Up1Purchase = 0;
	private Random r = new Random();
	Color colGra = new Color(65, 65, 65);
	
	
	public Shop(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	public void render(Graphics g) {
		g.setColor(Color.orange);
		g.setFont(new Font("curlz mt", 1, 48));
		g.drawString("SPOOKY SHOP", 120, 50);
		g.setFont(new Font("curlz mt", 1, 35));
		g.drawString("Treats: " + hud.getPoint(), Game.WIDTH/2-95, 85);
		
		//Up1
		g.setFont(new Font("curlz mt", 120, 17));
		g.setColor(colGra);
		g.fillRect(100, 100, 100, 80);
		g.setColor(Color.orange);
		g.drawString("Add 1000", 105, 120);
		g.drawString("Score", 105, 140);
		g.drawString("Cost: " + Up1, 105, 160);
		g.drawRect(100, 100, 100, 80);
		//Up2
		g.setColor(colGra);
		g.fillRect(250, 100, 100, 80);
		g.setColor(Color.orange);
		g.drawString("Upgrade Speed", 253, 120);
		g.drawString("Cost: " + Up2, 254, 140);
		g.drawRect(250, 100, 100, 80);
		//Up3
		g.setColor(colGra);
		g.fillRect(400, 100, 100, 80);
		g.setColor(Color.orange);
		g.drawString("Refill Health", 408, 120);
		g.drawString("Cost: " + Up3, 414, 140);
		g.drawRect(400, 100, 100, 80);
		//Up6
		
		g.setColor(colGra);
		g.fillRect(400, 200, 100, 80);
		g.setColor(Color.orange);
		g.drawString("Casino", 415, 220);
		g.drawString("Cost: " + Up6, 415, 240);
		g.drawRect(400, 200, 100, 80);
		
		
	}
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if(mx >= 100 && mx <= 200) {
			if(my >= 100 && my <= 180) {
				if(hud.getPoint() >= Up1) {
					hud.setPoint(hud.getPoint() - Up1);
					hud.setScore(hud.getScore() + 1000);
				}
			}
		}
		if(mx >= 250 && mx <= 350) {
			if(my >= 100 && my <= 180) {
				if(hud.getPoint() >= Up2) {
					hud.setPoint(hud.getPoint() - Up2);
					Up2+=1000;
					handler.speed++;
				}
			}
		}
		if(mx >= 400 && mx <= 500) {
			if(my >= 100 && my <= 180) {
				if(hud.getPoint() >= Up3) {
					hud.setPoint(hud.getPoint() - Up3);
					Up3=1000;
					hud.HEALTH = (100 + (hud.bounds/2));
				}
			}
		}
		if(mx >= 400 && mx <= 500) {
			if(my >= 200 && my <= 280) {
				if(hud.getPoint() >= Up6) {
					hud.setPoint(hud.getPoint() - Up6);
					Up3=1000;
					int randomInt = r.nextInt(6) + 1;
					if(randomInt == 1) {
						hud.setPoint(hud.getPoint() + 750);
					} else if(randomInt == 2) {
						hud.setPoint(hud.getPoint() + 100);
					} else if(randomInt == 3) {
						hud.setPoint(hud.getPoint() - 500);
					} else if(randomInt == 4) {
						hud.setPoint(hud.getPoint() + 50);
					} else if(randomInt == 5) {
						hud.setPoint(hud.getPoint() + 25);
					} else if(randomInt == 6) {
						hud.setPoint(hud.getPoint() + 10000);
					}
				}
			}
		}
	}
}

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

public class HUD {
	
	Shop shop;
	public int bounds = 0;
	public static int HEALTH = 100;
	
	private int greenValue = 255;
	private int score = 0;
	private int level = 1;
	private int point = 100;
	Font fnt4 = new Font("curlz mt", 1, 15);
	
	public void tick() {
		
		HEALTH = Game.clamp(HEALTH,  0,  100 + (bounds/2));
		greenValue = Game.clamp(greenValue,  0,  255);
		
		greenValue = HEALTH * 2;
		score++;
		
	}
	
	
	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(15,  15,  200 + bounds,  32);
		g.setColor(new Color(75, greenValue, 0));
		g.fillRect(15,  15,  (int)HEALTH * 2,  32);
		g.setFont(fnt4);
		g.setColor(Color.orange);
		g.drawRect(15,  15,  200 + bounds,  32);
		g.drawString("Score: " + score, 15, 64);
		g.drawString("Level: " + level, 15, 80);
		g.drawString("Points: " + point, 15, 94);
		g.drawString("P/Enter to (Un)Pause", 15, 108);
		g.drawString("Space for Shop", 15, 122);
	}
	
	public void score(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
}

package com.turtorial.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import com.turtorial.main.Game.STATE;

public class Menu extends MouseAdapter{
	
	private Game game;
	private Handler handler;
	private Random r = new Random();
	private HUD hud;
	
	
	public Menu(Game game, Handler handler, HUD hud) {
		this.game = game;
		this.hud = hud;
		this.handler = handler;
	}
	
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if(game.gameState == STATE.Menu && mouseOver(mx, my, 220, 100, 200, 64)) {
			game.gameState = STATE.Game;
			hud.setLevel(1);
			hud.setPoint(0);
			hud.setScore(0);
			handler.speed = 5;
			handler.object.clear();
			handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));
			handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy, handler));
		}
		if(game.gameState == STATE.End && mouseOver(mx, my, 220, 255, 200, 64)) {
			game.gameState = STATE.Menu;
		}
		if(game.gameState == STATE.Help && mouseOver(mx, my, 0, 0, 200, 64)) {
			game.gameState = STATE.Menu;
		}
		
		if(game.gameState == STATE.Menu && mouseOver(mx, my, 220, 200, 200, 64)) {
			game.gameState = STATE.Help;
	} if(game.gameState == STATE.Menu && mouseOver(mx, my, 220, 300, 200, 64)) {
		System.exit(1);
}
}
	
	public void mouseReleased(MouseEvent e) {
		
	}
	
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
		if(mx > x && mx < x + width) {
		if(my > y && my < y + height) {
			return true;
		} else return false;
		}else return false;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		Font fnt3 = new Font("arial", 1, 20);
		
		if(game.gameState == STATE.Menu) {
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Dodge Blox", 180, 60);
		
		g.setFont(fnt2);
		g.setColor(Color.white);
		g.drawRect(220, 100, 200, 64);
		g.drawString("Play", 285, 140);
		g.setFont(fnt2);
		g.setColor(Color.white);
		g.drawRect(220, 200, 200, 64);
		g.drawString("Help", 285, 240);
		g.setFont(fnt2);
		g.setColor(Color.white);
		g.drawRect(220, 300, 200, 64);
		g.drawString("Quit", 285, 340);
		} else if(game.gameState == STATE.End) {
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Game Over", 190, 70);
			
		g.setFont(fnt2);
		g.drawString("You lost with a score of: " + hud.getScore(), 100, 150);
			
		//Make button
		g.drawRect(220, 255, 200, 64);
		g.setFont(fnt2);
		g.drawString("Try Again", 255, 300);
		} else if(game.gameState == STATE.Help) {
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Help", 250, 70);
				
		g.setFont(fnt3);
		g.drawString("Use the WSAD keys to move", 140, 150);
		g.drawString("Avoid the squares", 140, 175);
		g.drawString("If your health drops to 0, you are dead.", 140, 200);
				
			//Make button
		g.drawRect(0, 0, 200, 64);
		g.setFont(fnt2);
		g.drawString("Go Back", 40, 40);
			} 
	}
}

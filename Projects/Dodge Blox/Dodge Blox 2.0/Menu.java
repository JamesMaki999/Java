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

public class Menu extends MouseAdapter{
	
	private Game game;
	private Handler handler;
	private Random r = new Random();
	private HUD hud;
	Color colGra = new Color(65, 65, 65);
	
	
	public Menu(Game game, Handler handler, HUD hud) {
		this.game = game;
		this.hud = hud;
		this.handler = handler;
	}
	
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if(game.gameState == STATE.Menu && mouseOver(mx, my, 220, 130, 200, 64)) {
			game.gameState = STATE.Game;
			hud.setLevel(1);
			hud.setPoint(0);
			hud.setScore(0);
			handler.speed = 5;
			handler.object.clear();
			handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));
			handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy, handler));
		}
		if(game.gameState == STATE.End && mouseOver(mx, my, 0, 0, 200, 64)) {
			game.gameState = STATE.Menu;
		}
		if(game.gameState == STATE.Help && mouseOver(mx, my, 0, 0, 200, 64)) {
			game.gameState = STATE.Menu;
		}
		
		if(game.gameState == STATE.Menu && mouseOver(mx, my, 220, 230, 200, 64)) {
			game.gameState = STATE.Help;
			} if(game.gameState == STATE.Menu && mouseOver(mx, my, 220, 330, 200, 64)) {
				System.exit(1);
}
		if(game.gameState == STATE.Menu && mouseOver(mx, my, 570, 20, 40, 40)) {
			game.gameState = STATE.Egg1;
		}
		if(game.gameState == STATE.Egg1 && mouseOver(mx, my, 570, 390, 40, 40)) {
			game.gameState = STATE.Egg2;
		}
		if(game.gameState == STATE.Egg1 && mouseOver(mx, my, 0, 0, 200, 64)) {
			game.gameState = STATE.Menu;
		}
		if(game.gameState == STATE.Egg2 && mouseOver(mx, my, 20, 390, 40, 40)) {
			game.gameState = STATE.Egg3;
		}
		if(game.gameState == STATE.Egg2 && mouseOver(mx, my, 0, 0, 200, 64)) {
			game.gameState = STATE.Menu;
		}
		if(game.gameState == STATE.Egg3 && mouseOver(mx, my, 0, 0, 200, 64)) {
			game.gameState = STATE.Menu;
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
		Font fnt4 = new Font("curlz mt", 1, 40);
		
		if(game.gameState == STATE.Menu) {
			//title
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Dodge Blox", 180, 60);
			//subtitle
			g.setFont(fnt4);
			g.setColor(Color.orange);
			g.drawString("Halloween Edition", 160, 90);
			//Play button
			g.setFont(fnt4);
			g.setColor(colGra);
			g.fillRect(220, 130, 200, 64);
			g.setColor(Color.orange);
			g.drawRect(220, 130, 200, 64);
			g.setColor(Color.orange);
			g.drawString("Play", 285, 177);
			//Help button
			g.setColor(colGra);
			g.fillRect(220, 230, 200, 64);
			g.setColor(Color.orange);
			g.drawRect(220, 230, 200, 64);
			g.setColor(Color.orange);
			g.drawString("Help", 285, 275);
			//Quit button
			g.setColor(colGra);
			g.fillRect(220, 330, 200, 64);
			g.setColor(Color.orange);
			g.drawRect(220, 330, 200, 64);
			g.drawString("Quit", 285, 375);
			//EasterEgg1 button
			g.setColor(colGra);
			g.fillRect(570, 20, 40, 40);
			g.setColor(Color.orange);
			g.setFont(fnt4);
			g.drawString("S", 580, 55);
			g.drawRect(570, 20, 40, 40);
			} else if(game.gameState == STATE.End) {
				g.setFont(fnt);
				g.setColor(Color.white);
				g.drawString("Game Over", 190, 120);
				g.setFont(fnt4);
				g.setColor(Color.orange);
				g.drawString("Happy Halloween!", 168, 150);
					
				g.setFont(fnt2);
				g.setColor(Color.white);
				g.drawString("You lost with a score of: " + hud.getScore(), 110, 180);
					
				//Make button
				g.setColor(colGra);
				g.fillRect(0, 0, 200, 64);
				g.setColor(Color.orange);
				g.drawRect(0, 0, 200, 64);
				g.setFont(fnt4);
				g.drawString("Try Again", 18, 45);
			} else if(game.gameState == STATE.Help) {
				g.setFont(fnt4);
				g.setColor(Color.orange);
				g.drawString("Help", 250, 70);
					
				g.setFont(fnt4);
				g.drawString("Use the WSAD keys to move", 75, 140);
				g.drawString("Avoid the squares", 140, 175);
				g.drawString("If your health drops to 0", 110, 215);
				g.drawString("you are dead!", 190, 250);
					
				//Back button
				g.setColor(colGra);
				g.fillRect(0, 0, 200, 64);
				g.setFont(fnt4);
				g.setColor(Color.orange);
				g.drawRect(0, 0, 200, 64);
				g.drawString("Go Back", 30, 45);
			} else if(game.gameState == STATE.Egg1) {
				g.setFont(fnt4);
				g.setColor(Color.orange);
				g.drawString("Boo!", 270,  100);
				g.drawString("Go back!", 233, 140);
				g.drawString("Don't click that second box!", 70, 300);
				
				//EasterEgg2 button
				g.setColor(colGra);
				g.fillRect(570, 390, 40, 40);
				g.setColor(Color.orange);
				g.setFont(fnt4);
				g.drawRect(570, 390, 40, 40);
				g.drawString("A", 576, 424);
				
				//Back button
				g.setColor(colGra);
				g.fillRect(0, 0, 200, 64);
				g.setFont(fnt4);
				g.setColor(Color.orange);
				g.drawRect(0, 0, 200, 64);
				g.drawString("Go Back", 30, 45);
		} else if(game.gameState == STATE.Egg2) {
			g.setFont(fnt4);
			g.setColor(Color.orange);
			g.drawString("STOP!", 250, 140);
			g.drawString("Don't you dare go any further!", 50, 300);
			
			//EasterEgg2 button
			g.setColor(colGra);
			g.fillRect(20, 390, 40, 40);
			g.setColor(Color.orange);
			g.setFont(fnt4);
			g.drawRect(20, 390, 40, 40);
			g.drawString("M", 23, 424);
			
			//Back button
			g.setColor(colGra);
			g.fillRect(0, 0, 200, 64);
			g.setFont(fnt4);
			g.setColor(Color.orange);
			g.drawRect(0, 0, 200, 64);
			g.drawString("Menu", 50, 45);
	} else if(game.gameState == STATE.Egg3) {
		g.setFont(fnt4);
		g.setColor(Color.orange);
		g.drawString("Happy Birthday, Sam!", 130,  140);
		g.drawString("I hope that you enjoyed yourself.", 30, 180);
		g.drawString("I love you, no matter what!", 70, 220);
		g.drawString("Have an amazing day!", 130, 260);
		g.drawString("<3", 220, 300);
		g.drawString("-James", 280, 300);
		
		//Menu button
		g.setColor(colGra);
		g.fillRect(0, 0, 200, 64);
		g.setFont(fnt4);
		g.setColor(Color.orange);
		g.drawRect(0, 0, 200, 64);
		g.drawString("Menu", 50, 45);
}
	}
}

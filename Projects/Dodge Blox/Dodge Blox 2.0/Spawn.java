/*
 * DodgeBlox Halloween Edition
 * Developer: James Maki
 * Created: Wednesday, ‎September ‎11, ‎2019
 * Last Updated: Saturday, October 5, 2019
 */
package com.samantha.main;

import java.util.Random;

public class Spawn {
	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	
	Shop shop;
	private int scoreKeep = 0;
	
	public Spawn(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	public void tick() {
		scoreKeep++;
		
		
		for(int i = 0; i <= 100; i++) {
			if(scoreKeep >= 100) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);
			hud.setPoint(hud.getPoint() + 100);
			int randomInt = r.nextInt(4) + 1;
			int randomInt2 = r.nextInt(4) + 1;
			if(hud.getLevel() > 0) {
				if(randomInt == 1) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy, handler));
				} else if(randomInt == 2) {
					handler.addObject(new BasicEnemy2(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy2, handler));
				} else if(randomInt == 3) {
					handler.addObject(new BasicEnemy3(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy3, handler));
				} else if(randomInt == 4) {
					handler.addObject(new BasicEnemy4(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy4, handler));
				}
			}
			if((hud.getLevel() == 10) || (hud.getLevel() == 20) || (hud.getLevel() == 30) || (hud.getLevel() == 40 || (hud.getLevel() == 50) || (hud.getLevel() == 60 || (hud.getLevel() == 70) || (hud.getLevel() == 80) || (hud.getLevel() == 90)))) {
				if(randomInt2 == 1) {
					handler.object.clear();
					handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player, handler));
					handler.addObject(new BossEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BossEnemy, handler));
				}
				if(randomInt2 == 2) {
					handler.object.clear();
					handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player, handler));
					handler.addObject(new BossEnemy2(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BossEnemy2, handler));
				}
				if(randomInt2 == 3) {
					handler.object.clear();
					handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player, handler));
					handler.addObject(new BossEnemy3(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BossEnemy3, handler));
				}
				if(randomInt2 == 4) {
					handler.object.clear();
					handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player, handler));
					handler.addObject(new BossEnemy4(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BossEnemy4, handler));
				}
			}
		}
			if(hud.getLevel() == 100) {
				handler.object.clear();
				handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player, handler));
				for(int o = 0; o < 1; o++) {
					handler.addObject(new BossEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BossEnemy, handler));
					handler.addObject(new BossEnemy2(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BossEnemy2, handler));
					handler.addObject(new BossEnemy3(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BossEnemy3, handler));
					handler.addObject(new BossEnemy4(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BossEnemy4, handler));
				}
			}
		}
	}
	}
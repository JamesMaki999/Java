/*
 * DodgeBlox Halloween Edition
 * Developer: James Maki
 * Created: Wednesday, ‎September ‎11, ‎2019
 * Last Updated: Saturday, October 5, 2019
 */
package com.samantha.main;

import java.util.Random;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.samantha.main.Game.STATE;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = -6101886440505356147L;

	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	private Thread thread;
	private boolean running = false;

	public static boolean paused = false;

	private Random r;
	private Handler handler;
	private HUD hud;
	private Spawn spawner;
	private Menu menu;
	private Shop shop;
	Font fnt4 = new Font("curlz mt", 1, 15);

	public enum STATE {
		Menu, Help, Game, Shop, Egg1, Egg2, Egg3, End
	};

	public STATE gameState = STATE.Menu;

	public Game() {
		handler = new Handler();
		hud = new HUD();
		shop = new Shop(handler, hud);
		menu = new Menu(this, handler, hud);
		this.addKeyListener(new KeyInput(handler, this));
		this.addMouseListener(menu);
		this.addMouseListener(shop);

		new Window(WIDTH, HEIGHT, "DodgeBlox Halloween Edition", this);

		spawner = new Spawn(handler, hud);

		r = new Random();

		if (gameState == STATE.Game) { // If the game state changes to game then create player and enemies
			handler.addObject(new Player(WIDTH / 2 - 32, HEIGHT / 2 - 32, ID.Player, handler));
			handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy, handler));
		}
		if (gameState == STATE.Menu || gameState == STATE.Egg1 || gameState == STATE.Egg2 || gameState == STATE.Egg3
				|| gameState == STATE.End || gameState == STATE.Shop || gameState == STATE.Help) {
			handler.object.clear();
			for (int i = 0; i < 5; i++) {
				handler.addObject(new MenuParticle(r.nextInt(WIDTH), r.nextInt(HEIGHT), ID.MenuParticle, handler));
				handler.addObject(new MenuParticle2(r.nextInt(WIDTH), r.nextInt(HEIGHT), ID.MenuParticle2, handler));
			}
		}
	}

	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}// hello

	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				tick();
				delta--;
			}
			if (running)
				render();

			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
			}
		}
		stop();
	}

	private void tick() {

		if (!paused) {
			if (gameState == STATE.Game) {
				handler.tick();
				hud.tick();
				spawner.tick();
				if (HUD.HEALTH <= 0) {
					HUD.HEALTH = 100;
					handler.object.clear();
					for (int i = 0; i < 10; i++) {
						handler.addObject(
								new MenuParticle(r.nextInt(WIDTH), r.nextInt(HEIGHT), ID.MenuParticle, handler));
					}
					gameState = STATE.End;
				}
			} else if (gameState == STATE.Menu || gameState == STATE.Egg1 || gameState == STATE.Egg2
					|| gameState == STATE.Egg3 || gameState == STATE.End || gameState == STATE.Help) {
				menu.tick();
				handler.tick();
			}
		}

	}

	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();

		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);

		if (paused) {
			g.setFont(fnt4);
			g.setColor(Color.orange);
			g.drawString("PAUSED", 300, 100);
		}

		if (gameState == STATE.Game) {
			hud.render(g);
			handler.render(g);
		} else if (gameState == STATE.Shop) {
			shop.render(g);

		} else if (gameState == STATE.Menu || gameState == STATE.Egg1 || gameState == STATE.Egg2
				|| gameState == STATE.Egg3 || gameState == STATE.End || gameState == STATE.Help) {
			menu.render(g);
			handler.render(g);
		}

		g.dispose();
		bs.show();
	}

	public static int clamp(int var, int min, int max) {
		if (var >= max) {
			return var = max;
		} else if (var <= min) {
			return var = min;
		} else {
			return var;
		}
	}

	public static void main(String args[]) {
		new Game();
	}
}
/*
 * DodgeBlox Halloween Edition
 * Developer: James Maki
 * Created: Wednesday, ‎September ‎11, ‎2019
 * Last Updated: Saturday, October 5, 2019
 */
package com.samantha.main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{

	private static final long serialVersionUID = -3272253329846697217L;
	
	public Window(int width, int height, String title, Game game) {
		// Frame of our window, inbuilt library
		JFrame frame = new JFrame(title);
		
		// Preferred size
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		// Stops the game
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Can we resize the window?
		frame.setResizable(false);
		// Window starts in middle of screen, if it wasnt null then it would start in top left
		frame.setLocationRelativeTo(null);
		frame.add(game);
		frame.setVisible(true);
		game.start();
	}

}

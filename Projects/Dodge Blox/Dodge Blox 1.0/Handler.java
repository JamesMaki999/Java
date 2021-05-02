package com.turtorial.main;

import java.util.LinkedList;
import java.awt.Graphics;

public class Handler {
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public int speed = 5;
	
	public void tick() {
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			tempObject.tick();
		}
	}
	public void render(Graphics g) {
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
		}
	}
	public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	public void removalObject(GameObject object) {
		this.object.remove(object);
	}
}

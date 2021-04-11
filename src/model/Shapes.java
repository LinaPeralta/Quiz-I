package model;

import processing.core.PApplet;

public abstract class Shapes {
	
	protected String words;
	PApplet app;
	protected int tam, posX, posY, directionA, directionB, value;

	public Shapes(PApplet app,  String words) {
		
		this.app = app;
		this.words = words;	

	}

	public abstract void draw();

	public abstract void move();
}

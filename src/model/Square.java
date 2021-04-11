package model;

import processing.core.PApplet;

public class Square extends Shapes {

	public int posX, posY, direction, value;

	PApplet app;

	public Square(PApplet app, String words) {
		
		super(app, words);

		this.app = app;

	}

}

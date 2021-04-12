package model;

import processing.core.PApplet;

public class Triangle {

	protected int tam, posX, posY, directionA, directionB, value;
	int R,G,B;
	PApplet app;

	public Triangle(PApplet app) {
		
		this.app=app;
		
		R = 190; 
		G = 78;
		B = 50;
		
	}

	public void draw() {

		app.triangle(posX, posY - tam / 2, posX - tam / 2, posY + tam / 2, posX + tam / 2, posY + tam / 2);
		app.fill(R,G,B);
		app.textSize(tam - 30);
		app.text(value + "", posX, posY);

	}

	public void move() {

	}

}

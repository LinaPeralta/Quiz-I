package model;

import processing.core.PApplet;
import processing.core.PConstants;

public class Square extends Shapes {


	int R,G,B;
	PApplet app;
	private  String [] squareValues;

	public Square(PApplet app, String words) {
		
		super(app, words);

		this.app = app;
		
		R = 154; 
		G = 133;
		B = 81;
		
		splitValues();

	}
	
	public void splitValues () {

		//separar los valores que componen la figura
		squareValues = app.split(words, " ");
		
		
		for (int i = 0; i < squareValues.length; i++) {
		
		tam = Integer.parseInt(squareValues[1]);
		posX= Integer.parseInt(squareValues[2]);
		posY= Integer.parseInt(squareValues[3]);
		directionA= Integer.parseInt(squareValues[4]);
		directionB= Integer.parseInt(squareValues[4]);
		value= Integer.parseInt(squareValues[5]);
		
		}
	}
	
	
	public void draw() {
		
		app.noStroke();
		app.fill (R,G,B);
		app.rectMode(PConstants.CENTER);
		app.square(posX,posY,tam);
	    app.fill (96,24,63);
		app.textSize(tam/2);
		app.text(value + " ", posX, posY);
		

	}

	public void move() {
		super.move();
		//ssuper.limit();

	}

}

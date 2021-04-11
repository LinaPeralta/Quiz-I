package model;

import processing.core.PApplet;

public class Circle extends Shapes{

	//public int posX, posY, direction, value;
	
	
	private  String [] circleValues;


	public Circle(PApplet app, String words) {
		
		super(app, words);

	}
	
	public void splitValues () {
		
		circleValues = app.split(words, " ");
	}
	
	
}

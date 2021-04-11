package model;

import processing.core.PApplet;

public class Circle extends Shapes{


	
	PApplet app;
	int R,G,B;
	private  String [] circleValues;
	


	public Circle(PApplet app, String words) {
		
		super(app, words);
		
		
		R = 96; 
		G = 24;
		B = 63;
				

		splitValues();

	}
	
	public void splitValues () {

		//separar los valores que componen la figura
		circleValues = app.split(words, " ");
		
		
		for (int i = 0; i < circleValues.length; i++) {
		
		tam = Integer.parseInt(circleValues[1]);
		posX= Integer.parseInt(circleValues[2]);
		posY= Integer.parseInt(circleValues[3]);
		directionA= Integer.parseInt(circleValues[4]);
		directionB= Integer.parseInt(circleValues[4]);
		value= Integer.parseInt(circleValues[5]);

			
		}
	}
	
	
	public void draw() {
		
		app.circle(posX,posY,tam);
	    app.fill (R,G,B);
		app.textSize(tam/2);
		app.text(value + " ", posX, posY);
		
	}
	
	public void move() {
		super.move();
		super.limit();

	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = r;
	}

	public int getG() {
		return G;
	}

	public void setG(int g) {
		G = g;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	public String[] getCircleValues() {
		return circleValues;
	}

	public void setCircleValues(String[] circleValues) {
		this.circleValues = circleValues;
	}
	
	
}

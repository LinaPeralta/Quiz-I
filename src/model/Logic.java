package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {

	PApplet app;

	String[] words;

	ArrayList<Circle> circle;
	ArrayList<Square> square;
	ArrayList<Triangle> triangle;


	public Logic(PApplet app) {

		this.app = app;

		words = app.loadStrings("Text.txt");
		circle = new ArrayList<Circle>();
		square = new ArrayList<Square>();
		triangle = new ArrayList<Triangle>();
		
		split();	
	}

	public void split() {
		
		for (int i = 0; i < words.length; i++) {
			
			if (words[i].contains ("Circulo")) {
				circle.add(new Circle(app, words[i]));		
			}
			
			if (words[i].contains ("Cuadrado")) {
				square.add(new Square(app, words[i]));
			}
			
		}

	}

	public void draw() {

	}

	public void stopMove() { 

	}

	public void distShapes() {

	}

	public void newShape() {

	}

}

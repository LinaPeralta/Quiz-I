package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {

	PApplet app;

	int R, G, B;
	private boolean crashA, crashB, crashC;

	String[] words;

	// Circle circulo;

	ArrayList<Circle> circle;
	ArrayList<Square> square;
	ArrayList<Triangle> triangle;

	public Logic(PApplet app) {

		this.app = app;

		words = app.loadStrings("./Text/Text.txt");
		circle = new ArrayList<Circle>();
		square = new ArrayList<Square>();
		triangle = new ArrayList<Triangle>();

		split();
	}

	public void split() {

		for (int i = 0; i < words.length; i++) {

			if (words[i].contains("Circulo")) {
				circle.add(new Circle(app, words[i]));
			}

			if (words[i].contains("Cuadrado")) {
				square.add(new Square(app, words[i]));
			}

		}

	}

	public void draw() {

		for (int i = 0; i < circle.size(); i++) {
			Circle actual = circle.get(i);
			circle.get(i).draw();
			circle.get(i).move();
		}

		for (int i = 0; i < square.size(); i++) {
			Square actual = square.get(i);
			square.get(i).draw();
			square.get(i).move();

		}

		for (int i = 0; i < triangle.size(); i++) {
			Triangle actual = triangle.get(i);
			triangle.get(i).draw();
			triangle.get(i).move();

		}

		distShapes();

	}

	public void stopMove() {

		for (int j = 0; j < circle.size(); j++) {

			if (distance(app.mouseX, circle.get(j).getPosX(), app.mouseY, circle.get(j).getPosY()) < circle.get(j)
					.getTam()) {
				circle.get(j).setStop(!circle.get(j).isStop());
			}
		}

		for (int i = 0; i < square.size(); i++) {

			if (app.mouseX > square.get(i).getPosX() - square.get(i).getTam()
					&& app.mouseX < square.get(i).getPosX() + square.get(i).getTam()
					&& app.mouseY > square.get(i).getPosY() - square.get(i).getTam()
					&& app.mouseY < square.get(i).getPosY() + square.get(i).getTam()) {
				square.get(i).setStop(!square.get(i).isStop());
			}
		}

	}
	
	public void stopMoveTriangle() {
		for (int i = 0; i < triangle.size(); i++) {
			//Mouse clicked (left) on triangle, it makes it stop
			if (distance(app.mouseX, triangle.get(i).getPosX(), app.mouseY, triangle.get(i).getPosY())<triangle.get(i).getSides()-10) {
				triangle.get(i).setStop(!triangle.get(i).isStop());
			}		
		}
	}
	

	public void distShapes() {

	}

	public void newShape() {

	}

	private double distance(double x1, double x2, double y1, double y2) {
		return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	}

}
